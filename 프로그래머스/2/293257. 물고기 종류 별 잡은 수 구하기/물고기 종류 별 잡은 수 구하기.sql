-- 코드를 작성해주세요
SELECT COUNT(*) AS FISH_COUNT, FI.FISH_NAME
FROM FISH_NAME_INFO FI INNER JOIN FISH_INFO F 
ON FI.FISH_TYPE = F.FISH_TYPE
GROUP BY FI.FISH_NAME
ORDER BY FISH_COUNT DESC;