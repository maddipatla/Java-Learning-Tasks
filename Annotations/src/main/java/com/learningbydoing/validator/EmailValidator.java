/**
 *
 */
package com.learningbydoing.validator;

import java.util.List;

import com.learningbydoing.annotation.Email;
import com.learningbydoing.document.Document;

/**
 * @author Maddipatla Chandra Babu
 * @date 09-Feb-2018
 */
public class EmailValidator extends AbstractValidator {

	public EmailValidator(List<Document> documents) {
		super(documents);
	}

	@Override
	public boolean isAllDocumentsHaveConsistentDataAgainstAadhaar() {
		return validateAnnotationOnField(Email.class, email) && validateAnnotationOnMethod(Email.class, email);
	}

}
