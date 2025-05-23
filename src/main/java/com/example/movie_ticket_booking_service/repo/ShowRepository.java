package com.example.movie_ticket_booking_service.repo;

import com.example.movie_ticket_booking_service.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show,Long> {
}
