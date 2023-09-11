package searchengine.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "index", schema = "search_engine")
@Data
public class IndexEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "page_id")
    private int pageId;
    @Column(name = "lemma_id")
    private int lemmaId;
    @Column(name = "rank")
    private double rank;
}