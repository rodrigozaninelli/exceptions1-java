package model.exceptions;

public class DomainException extends Exception{
        //pode extender de Exception ou RuntimeException
        //se extender de Exception, o compilador obriga a tratar a exceção
        //se extender de RuntimeException o compilador não obriga a tratar

    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
