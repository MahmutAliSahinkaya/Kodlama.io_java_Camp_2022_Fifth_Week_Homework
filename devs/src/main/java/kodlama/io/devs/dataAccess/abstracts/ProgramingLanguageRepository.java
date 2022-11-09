package kodlama.io.devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository extends JpaRepository<ProgramingLanguage,Integer>{

    ProgramingLanguage findById(int id);
    ProgramingLanguage findByName(String name);
	
}

