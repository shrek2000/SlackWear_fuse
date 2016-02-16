package simpleslackapi.events;

import com.ullink.slack.simpleslackapi.SlackPersona;

public interface SlackConnected extends SlackEvent
{
    SlackPersona getConnectedPersona();
}
