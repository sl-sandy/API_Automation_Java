package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "node_id",
        "name",
        "full_name",
        "owner"
})
public class GitHub {

    @JsonProperty("id")
    private int id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("owner")
    private Owner owner = new Owner();

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("name")
    public String getName() { return name; }

    @JsonProperty("full_name")
    public String getFullName() { return fullName; }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }
}
