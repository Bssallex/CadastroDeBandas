package dev.Java10x.CadastroDeBandas.Controller;

import dev.Java10x.CadastroDeBandas.Model.BandModel;
import dev.Java10x.CadastroDeBandas.Service.BandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/band")
public class BandControle {

    private final BandService bandService;

    public BandControle(BandService bandService) {
        this.bandService = bandService;
    }

    @GetMapping("/listar")
    public List<BandModel> listarBandas(){
        List<BandModel> listar = bandService.listarBandas();
        return listar;
    }

    @PostMapping("/criar")
    public BandModel criarBanda(@RequestBody BandModel bandModel){
        BandModel criar = bandService.criarBandas(bandModel);
        return criar;
    }

}
