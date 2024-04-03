-- 코드를 작성해주세요
SELECT A.ITEM_ID, A.ITEM_NAME
FROM ITEM_INFO A JOIN ITEM_TREE B
ON A.ITEM_ID = B.ITEM_ID
WHERE PARENT_ITEM_ID IS NULL
ORDER BY ITEM_ID ASC;