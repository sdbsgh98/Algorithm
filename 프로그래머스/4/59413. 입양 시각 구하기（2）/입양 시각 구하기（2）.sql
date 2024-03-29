-- 코드를 입력하세요
SET @hour := -1; # 변수 선언문

SELECT (@hour := @hour + 1) as HOUR,
(	SELECT COUNT(DATETIME) 
	FROM ANIMAL_OUTS 
	WHERE HOUR(DATETIME) = @hour) as COUNT
FROM ANIMAL_OUTS
WHERE @hour < 23;