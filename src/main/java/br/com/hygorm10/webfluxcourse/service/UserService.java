package br.com.hygorm10.webfluxcourse.service;

import br.com.hygorm10.webfluxcourse.entity.User;
import br.com.hygorm10.webfluxcourse.mapper.UserMapper;
import br.com.hygorm10.webfluxcourse.model.request.UserRequest;
import br.com.hygorm10.webfluxcourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }

}
