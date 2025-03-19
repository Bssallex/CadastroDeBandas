package dev.Java10x.CadastroDeBandas.Repository;

import dev.Java10x.CadastroDeBandas.Model.BandModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandRepository extends JpaRepository<BandModel, Long> {
}
