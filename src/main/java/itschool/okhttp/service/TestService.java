package itschool.okhttp.service;

import itschool.okhttp.dto.ResponseStatusDTO;
import itschool.okhttp.dto.TestDTO;
import org.springframework.stereotype.Service;

@Service
public interface TestService {

     TestDTO getOne(Long id);
     ResponseStatusDTO saveOne(TestDTO testDTO);
}
