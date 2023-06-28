package dev.agh.talk.domain;

import javax.persistence.*;

@Entity
public class ChatMessage {
    @Id
    @Column(name = "chat_message_id")
    private Long id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;
}
