-- 코드를 작성해주세요
SELECT YEAR(A.DIFFERENTIATION_DATE) AS YEAR, (B.SIZE - A.SIZE_OF_COLONY) AS YEAR_DEV, ID
FROM ECOLI_DATA AS A 
LEFT JOIN (SELECT YEAR(DIFFERENTIATION_DATE) AS YEAR, MAX(SIZE_OF_COLONY) AS SIZE
          FROM ECOLI_DATA
          GROUP BY YEAR(DIFFERENTIATION_DATE)) AS B
ON YEAR(A.DIFFERENTIATION_DATE) = B.YEAR
ORDER BY YEAR ASC, YEAR_DEV ASC;
