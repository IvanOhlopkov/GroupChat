package main.dto;

public class DtoMessage {
    private String datetime;
    private String username;
    private String text;

    public DtoMessage(String datetime, String username, String text) {
        this.datetime = datetime;
        this.username = username;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
