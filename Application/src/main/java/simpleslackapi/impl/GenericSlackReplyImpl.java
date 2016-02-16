package simpleslackapi.impl;

import com.ullink.slack.simpleslackapi.replies.GenericSlackReply;

import org.json.simple.JSONObject;

class GenericSlackReplyImpl implements GenericSlackReply
{
    private JSONObject obj;

    public GenericSlackReplyImpl(JSONObject obj)
    {
        this.obj = obj;
    }

    @Override
    public JSONObject getPlainAnswer()
    {
        return obj;
    }

}
