package itschool.okhttp.service.Impl;

import itschool.okhttp.dto.ResponseStatusDTO;
import itschool.okhttp.dto.TestDTO;
import itschool.okhttp.mapper.TestMapper;
import itschool.okhttp.repository.TestRepo;
import itschool.okhttp.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class TestServiceImpl  implements TestService {


    private final TestRepo testRepo;
    @Override
    public TestDTO getOne(Long id) {
        return TestMapper.INSTANCE.toDTO(testRepo.findById(id).orElseThrow(()-> new RuntimeException("Test wasn't found")));
    }

    @Override
    public ResponseStatusDTO saveOne(TestDTO testDTO) {
        testRepo.save(TestMapper.INSTANCE.toEntity(testDTO));
        return new ResponseStatusDTO("Success", testDTO);
    }
}
