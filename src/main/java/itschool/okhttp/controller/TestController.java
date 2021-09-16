package itschool.okhttp.controller;


import itschool.okhttp.dto.ResponseStatusDTO;
import itschool.okhttp.dto.ResponseUrlDTO;
import itschool.okhttp.dto.TestDTO;
import itschool.okhttp.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {


   private final TestService testService;

    @GetMapping("/get-one/{id}")
    public TestDTO getOne(@PathVariable Long id){
        return testService.getOne(id); }
     @PostMapping("/save-one")
    public ResponseStatusDTO saveOne(@RequestBody TestDTO testDTO){
       return  testService.saveOne(testDTO);
     }


    @GetMapping("/get-one-url")
    public ResponseUrlDTO getOneUrl(){
        return new ResponseUrlDTO("http:/localhost:8082/api/v1/test/get-one/");

    }
}
