package dev.Java10x.CadastroDeBandas.Service;

import dev.Java10x.CadastroDeBandas.Model.BandModel;
import dev.Java10x.CadastroDeBandas.Repository.BandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandService {

    private final BandRepository bandRepository;

    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    //LISTAR BANDAS
    public List<BandModel> listarBandas(){
        List<BandModel> listar = bandRepository.findAll();
        return listar;
    }

    //CRIAR UMA BANDA
    public BandModel criarBandas(BandModel bandModel){
        BandModel criar = bandRepository.save(bandModel);
        return criar;
    }
}
