package main.dto;

import main.model.Message;

public class MessageMapper {

    public static DtoMessage map(Message message) {
        return new DtoMessage(message.getDateTime().toString()
        , message.getUser().getName()
        , message.getMessage());
    }
}
