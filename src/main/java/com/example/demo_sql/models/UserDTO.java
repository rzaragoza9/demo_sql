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
@Table(name = "users")
public class UserDTO {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Column(name = "user_name", nullable = false)
    private String userName;

    @OneToMany(mappedBy = "user")
    private List<NoteDTO> notes;

    @ManyToMany(mappedBy = "users")
    private List<TagDTO> tags;

}
