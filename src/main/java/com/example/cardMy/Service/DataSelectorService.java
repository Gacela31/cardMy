package com.example.cardMy.Service;

import com.example.cardMy.DTo.DataSelectorDTO;
import com.example.cardMy.Entities.DataSelector;

import java.util.List;

public interface DataSelectorService {
    public DataSelectorDTO searchById(Long id);
    public List<DataSelectorDTO> searchAll();
    public DataSelectorDTO registerData (DataSelectorDTO dataSelectorDTO);
    public DataSelectorDTO update (DataSelectorDTO dataSelectorDTO, Long id);
    public void delete(Long id);
}
