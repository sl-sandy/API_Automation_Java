package entities;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "login",
        "id",
        "node_id",
        "avatar_url",
        "gravatar_id",
        "url",
        "html_url",
        "followers_url",
        "following_url",
        "gists_url",
        "starred_url",
        "subscriptions_url",
        "organizations_url",
        "repos_url",
        "events_url",
        "received_events_url",
        "type",
        "site_admin"
})

public class Owner {

    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Double id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("id")
    public Double getId() {
        return id;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("gravatar_id")
    public String getGravatar_Id() {
        return gravatarId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("followers_url")
    private String getFollowersUrl() { return followersUrl; }

    @JsonProperty("following_url")
    private String getFollowingUrl() { return followingUrl; }

    @JsonProperty("gists_url")
    private String getGistsUrl() { return gistsUrl; }

    @JsonProperty("starred_url")
    private String getStarredUrl() { return starredUrl; }

    @JsonProperty("subscriptions_url")
    private String getSubscriptionsUrl() { return subscriptionsUrl; }

    @JsonProperty("organizations_url")
    private String getOrganizationsUrl() { return organizationsUrl; }

    @JsonProperty("repos_url")
    private String getReposUrl() { return reposUrl; }

    @JsonProperty("events_url")
    private String getEventsUrl() { return eventsUrl; }

    @JsonProperty("received_events_url")
    private String getReceivedEventsUrl() { return receivedEventsUrl; }

    @JsonProperty("type")
    private String getType() { return type; }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
}
