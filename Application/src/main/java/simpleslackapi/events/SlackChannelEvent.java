package simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackChannel;

public interface SlackChannelEvent extends SlackEvent
{
    SlackChannel getSlackChannel();
}
