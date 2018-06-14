package br.com.rafaelporreca.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaelporreca.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}