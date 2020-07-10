package com.slack.api.methods.response.conversations;

import com.slack.api.methods.SlackApiResponse;
import com.slack.api.model.ResponseMetadata;
import lombok.Data;

@Data
public class ConversationsMarkResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
    private ResponseMetadata responseMetadata;
}
