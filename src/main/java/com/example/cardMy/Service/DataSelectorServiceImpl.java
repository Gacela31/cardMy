package com.example.cardMy.Service;

import com.example.cardMy.DTo.DataSelectorDTO;
import com.example.cardMy.Entities.DataSelector;
import com.example.cardMy.Exceptions.ResourceNotFoundException;
import com.example.cardMy.Repositories.DataSelectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.ResourceBundle;

@Service
public class DataSelectorServiceImpl implements DataSelectorService{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DataSelectorRepository dataSelectorRepository;

    @Override
    public DataSelectorDTO searchById(Long id) {
        DataSelector dataSelector = dataSelectorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Data", "id", id));
        return mapDTO(dataSelector);
    }

    @Override
    public List<DataSelectorDTO> searchAll() {
        return null;
    }

    @Override
    public DataSelectorDTO registerData(DataSelectorDTO dataSelectorDTO) {
        DataSelector dataSelector = mapEntity(dataSelectorDTO);
        DataSelector newData = dataSelectorRepository.save(dataSelector);
        DataSelectorDTO dataResponse = mapDTO(newData);
        return dataResponse;
    }

    @Override
    public DataSelectorDTO update(DataSelectorDTO dataSelectorDTO, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    //Convierte entidad a DTO
    private DataSelectorDTO mapDTO(DataSelector dataSelector) {
        DataSelectorDTO dataSelectorDTO = modelMapper.map(dataSelector, DataSelectorDTO.class);
        return dataSelectorDTO;
    }

    // Convierte de DTO a Entidad
    private DataSelector mapEntity(DataSelectorDTO reserveDTO) {
        DataSelector dataSelector = modelMapper.map(reserveDTO, DataSelector.class);
        return dataSelector;
    }
}
