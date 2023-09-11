package searchengine.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "lemma", schema = "search_engine")
@Data
public class LemmaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "site_id")
    private int siteId;
    @Column(name = "lemma")
    private String lemma;
    @Column(name = "frequency")
    private int frequency;
}