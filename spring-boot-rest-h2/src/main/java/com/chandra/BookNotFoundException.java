/**
 * 
 */
package com.chandra;

/**
 * @author chandrasekhar
 *
 */
public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException(Long id) {

		  super("Book id not found : " + id);
	}

	
}
