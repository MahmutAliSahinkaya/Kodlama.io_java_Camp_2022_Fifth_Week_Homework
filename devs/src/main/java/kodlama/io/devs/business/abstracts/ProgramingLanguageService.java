package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.ProgramingLanguageRequest;
import kodlama.io.devs.business.responses.ProgramingLanguageResponse;
import kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageService {


	List<ProgramingLanguageResponse> getAll();
    ProgramingLanguageResponse getResponseById(int id);
    ProgramingLanguage getById(int id);
    void add(ProgramingLanguageRequest languageRequest) throws Exception;
    void delete(int id);
    void update(ProgramingLanguageRequest languageRequest,int id) throws Exception;

}
