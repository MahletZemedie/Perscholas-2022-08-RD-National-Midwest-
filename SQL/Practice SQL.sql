#1
SELECT department.name as "Department Name", count(course.deptid) as "Number of Courses"
FROM department, course
WHERE department.id = course.deptid
group by department.name
order by count(course.deptid), department.name;

#2
SELECT course.name, count(studentCourse.studentID)
FROM course, studentCourse
WHERE course.id = studentCourse.courseID
group by course.name
order by count(studentCourse.studentID) desc, course.name;

#3
SELECT name
FROM course
WHERE id NOT IN (SELECT courseID from facultyCourse )
order by name;

#4
SELECT course.name, count(studentCourse.studentID)
FROM course, studentCourse
WHERE course.id = studentCourse.courseID and course.ID NOT IN 
                              (SELECT CourseID fROM facultyCourse)
GROUP BY course.name
ORDER BY count(studentCourse.studentID) desc, course.name;

#5
SELECT count(distinct (studentID)) as "Students", YEAR(startDate) AS "Year"
FROM studentCourse
GROUP BY YEAR(startDate)
ORDER BY YEAR(startDate), count(studentID) desc;

#6
SELECT startDate, count(distinct (studentID))
FROM studentCourse
WHERE MONTH(startDate) = 8
GROUP BY startDate
ORDER BY startDate;

#7
SELECT s.firstname, s.lastname, count(sc.courseId)
FROM student s, studentCourse sc, course c
WHERE s.id = sc.studentid and sc.courseID=c.id and s.majorID = c.deptID
GROUP BY s.lastname, s.firstname
ORDER BY count(sc.studentid) desc, s.firstname, s.lastname;

#8
SELECT s.firstname, s.lastname, round(avg(sc.progress), 1)
FROM student s, studentCourse sc
WHERE s.id = sc.studentId
group by s.firstname, s.lastname
HAVING AVG(sc.progress) < 50
ORDER BY round(avg(sc.progress), 1) desc, s.firstname, s.lastname;

#9
SELECT c.name, ROUND(avg(sc.progress), 1)
FROM course c, studentCourse sc
WHERE c.id = sc.courseId
GROUP BY c.name
ORDER BY ROUND(avg(sc.progress),1) desc, c.name;

#10
SELECT c.name, ROUND(AVG(sc.progress),1)
FROM course c, studentCourse sc
WHERE c.id = sc.courseId
GROUP BY c.name
ORDER BY ROUND(AVG(sc.progress),1) DESC
LIMIT 1;

#11
SELECT f.firstname, f.lastname, ROUND(AVG(sc.progress), 1)
FROM faculty f, facultyCourse fc, studentCourse sc, course c
WHERE f.id = fc.facultyId and fc.courseId = c.id and c.id = sc.courseId
GROUP BY f.firstname, f.lastname
ORDER BY ROUND(AVG(sc.progress), 1) desc, f.firstname, f.lastname;

#12
 SELECT firstname, lastname, 
    CASE
    WHEN min(progress) < 40  THEN "F"
    WHEN min(progress) < 50  THEN "D"
    WHEN min(progress) < 60  THEN "C"
    WHEN min(progress) < 70  THEN "B"
    WHEN min(progress) >=70 THEN "A" 
    END AS "MinGrade",
   CASE 
    WHEN max(progress) < 40 THEN "F"
    WHEN max(progress) < 50 THEN "D"
    WHEN max(progress) < 60 THEN "C"
    WHEN max(progress) < 70 THEN "B"
    WHEN max(progress) >=70 THEN "A"
    END AS "MaxGrade" 
    FROM student s, studentCourse sc
    WHERE s.id = sc.studentId
    GROUP BY firstname, lastname
    ORDER BY MinGrade desc, MaxGrade desc, firstname, lastname;

