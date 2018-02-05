package com.learningbydoing.refactor;

public class StatementFactory {

	private StatementFactory() {
		throw new IllegalStateException("Utililty class");
	}

	public static Statement getStatement(StatementConstants statementType, Customer customer) {
		switch (statementType) {
		case EMAIL:
			return new EmailStatement(customer);
		case PDF:
			return new PDFStatement(customer);
		default:
			break;
		}
		return null;
	}
}
