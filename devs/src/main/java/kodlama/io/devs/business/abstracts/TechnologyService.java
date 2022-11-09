package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.TechnologyRequest;
import kodlama.io.devs.business.responses.TechnologyResponse;

public interface TechnologyService {
    List<TechnologyResponse> getAll();
    void add(TechnologyRequest technologyRequest);
    void update(TechnologyRequest technologyRequest,int id);
    void delete(int id);
}
