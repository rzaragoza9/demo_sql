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
@Table(name = "tags")
public class TagDTO {
    @Id
    @GeneratedValue
    @Column(name = "tag_id")
    private Integer tagId;

    @NotNull
    @Column(name = "tag_expression", nullable = false)
    private String tagExpression;

    @ManyToMany
    @JoinTable(
            name = "tag_user",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<UserDTO> users;

    @ManyToMany(mappedBy = "tags")
    private List<NoteDTO> notes;
}
