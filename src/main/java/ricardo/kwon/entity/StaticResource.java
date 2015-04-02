package ricardo.kwon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATIC_RESOURCE")
public class StaticResource {

    @Id
    @Column(name = "STATIC_RESOURCE_SEQ")
    private Long staticResourceSeq;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CONTENT")
    private String content;

    public Long getStaticResourceSeq() {
        return staticResourceSeq;
    }

    public void setStaticResourceSeq(Long staticResourceSeq) {
        this.staticResourceSeq = staticResourceSeq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
