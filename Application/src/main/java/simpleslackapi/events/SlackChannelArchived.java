package simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackUser;

public interface SlackChannelArchived extends SlackChannelEvent
{
    SlackUser getUser();
}
