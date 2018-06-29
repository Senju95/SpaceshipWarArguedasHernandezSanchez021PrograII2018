package domain;

public class Message {
    private String message;
    private String reciever;
    private String sender;

    public Message(String message, Player receptor, Player emisor) {
        this.message = message;
        this.reciever = receptor.getName();
        this.sender = emisor.getName();
    }
    
    public Message(){
        this.message = "";
        this.reciever = "";
        this.sender = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
    
    @Override
    public String toString() {
        return "Message: " + message + "\nReciever: " + reciever + "\nSender: " + sender;
    }
    
}
