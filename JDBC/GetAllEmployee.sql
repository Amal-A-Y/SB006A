DELIMITER //

CREATE PROCEDURE GetAllEmployee()
BEGIN
	SELECT *  FROM Employees;
END //GetAllEmployee

DELIMITER ;