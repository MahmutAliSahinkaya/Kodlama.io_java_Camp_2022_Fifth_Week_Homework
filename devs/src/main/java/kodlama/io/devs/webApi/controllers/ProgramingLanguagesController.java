package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.business.requests.ProgramingLanguageRequest;
import kodlama.io.devs.business.responses.ProgramingLanguageResponse;



@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgramingLanguagesController {
	
    ProgramingLanguageService programingLanguageService;

    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgramingLanguageResponse> getAll(){
        return  programingLanguageService.getAll();
    }
    @GetMapping("/getbyid")
    public ProgramingLanguageResponse getById(@RequestParam int id){
        return  programingLanguageService.getResponseById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody ProgramingLanguageRequest languageRequest) throws Exception {
        programingLanguageService.add(languageRequest);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        programingLanguageService.delete(id);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody ProgramingLanguageRequest languageRequest,@PathVariable int id) throws Exception {
        programingLanguageService.update(languageRequest,id);
    }

}
