package searchengine.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "page", schema = "search_engine")
@Data
public class PageEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "site_id")
    private int siteId;
    @Column(name = "path")
    private String path;
    @Column(name = "code")
    private int code;
    @Column(name = "content")
    private String content;
}