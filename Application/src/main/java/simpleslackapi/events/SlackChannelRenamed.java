package simpleslackapi.events;

public interface SlackChannelRenamed extends SlackChannelEvent
{
    String getNewName();
}
