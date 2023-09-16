package main;

import java.sql.Connection;

abstract interface Salary{
	abstract void Calculate (int empId,Connection conn);
}
