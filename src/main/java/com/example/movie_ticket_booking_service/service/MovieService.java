package com.example.movie_ticket_booking_service.service;


import com.example.movie_ticket_booking_service.dto.MovieDTO;

public interface MovieService {

    MovieDTO getMovieDetails(Long movieId);
}
