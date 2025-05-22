package com.example.movie_ticket_booking_service.repo;

import com.example.movie_ticket_booking_service.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Long> {
}
