package com.example.movie_ticket_booking_service.controller;


import com.example.movie_ticket_booking_service.dto.MovieDTO;s
import com.example.movie_ticket_booking_service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(name = "/")
    public ResponseEntity<MovieDTO> getMovieDetails(MovieDTO request){
        Long movieId = request.getMovieId();
        MovieDTO response = movieService.getMovieDetails(movieId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
