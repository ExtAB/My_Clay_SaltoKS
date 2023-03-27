package org.example.pageExceptions;

public class PeopleException extends BaseExceptions{

    public PeopleException(){
        super("an element could not be located on the Peoples page using the given search action");
    }

    public PeopleException(Throwable cause) {
        super(cause);
    }

    public PeopleException(String message, Throwable cause) {
        super(message, cause);
    }

    public PeopleException(String message) {
        super(message);
    }

    @Override
    public String getError() {
        return "no such element found in Peoples Page object";
    }
}
