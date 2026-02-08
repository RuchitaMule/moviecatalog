package com.example.moviecatalog.repository;

import com.example.moviecatalog.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {

    private final List<Movie> movies = new ArrayList<>();
    private Long idCounter = 1L;

    public Movie save(Movie movie) {
        movie.setId(idCounter++);
        movies.add(movie);
        return movie;
    }

    public Optional<Movie> findById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}
