package simpleslackapi.events;

public interface SlackMessageEvent extends SlackEvent
{
    String getTimeStamp();
}
