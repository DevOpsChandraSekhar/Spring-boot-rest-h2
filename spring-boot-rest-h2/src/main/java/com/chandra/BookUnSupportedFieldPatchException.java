/**
 * 
 */
package com.chandra;

import java.util.Set;

/**
 * @author chandrasekhar
 *
 */
public class BookUnSupportedFieldPatchException extends RuntimeException{
	public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }
	
}
