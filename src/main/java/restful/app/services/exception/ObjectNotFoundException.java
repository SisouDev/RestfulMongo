package restful.app.services.exception;

public class ObjectNotFoundException extends RuntimeException{
    
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
