package com.example.demo_sql.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "notes")
public class NoteDTO {
    @Id
    @GeneratedValue
    @Column(name = "note_id")
    private Integer noteId;

    @NotNull
    @Column(name = "note_message", nullable = false)
    private String noteMessage;

    @Column(name = "note_archive")
    private Boolean noteArchive;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private  UserDTO user;

    @ManyToMany
    @JoinTable(
            name = "note_tag",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<TagDTO> tags;
}
