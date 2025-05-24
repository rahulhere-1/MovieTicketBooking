package com.example.movie_ticket_booking_service.service;


import com.example.movie_ticket_booking_service.exception.MovieNotFoundException;
import com.example.movie_ticket_booking_service.dto.MovieDTO;
import com.example.movie_ticket_booking_service.model.Movie;
import com.example.movie_ticket_booking_service.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {


    @Autowired
    private MovieRepository movieRepository;

    @Override
    public MovieDTO getMovieDetails(Long movieId){
        Movie movie = movieRepository.findById(movieId).orElseThrow(MovieNotFoundException::new);
        MovieDTO dto = new MovieDTO();
        dto.setMovieId(movie.getId());
        dto.setMovieName(movie.getName());
        dto.setDuration(movie.getDuration());
        return dto;
    }

    @Override
    public void saveMovie(MovieDTO dto){
        Movie movie = new Movie();
        movie.setName(dto.getMovieName());
        movie.setDuration(dto.getDuration());
        movie.setGenre(dto.getGenre());
        movieRepository.save(movie);
    }
}
