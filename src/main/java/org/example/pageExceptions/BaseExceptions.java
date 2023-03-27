package org.example.pageExceptions;

public class BaseExceptions extends RuntimeException{

    public BaseExceptions(){
        super("An unknown mobile error occurred while processing the command");
    }

    public BaseExceptions(Throwable t){
        super(t);
    }

    public BaseExceptions(String message) {
        super(message);
    }
    public BaseExceptions(String message,Throwable t){
        super(t);
    }

    public String getError(){
        return "unknown error";
    }

}
