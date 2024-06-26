package com.example.mylaundry.Service;

import com.example.mylaundry.Api.ApiException;
import com.example.mylaundry.Model.Laundry;
import com.example.mylaundry.Repositroy.LaundryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaundryService {

    private final LaundryRepository  laundryRepository;

    public List<Laundry> getAllLaundry(){
        return laundryRepository.findAll();
    }

    public void addLaundry(Laundry laundry){
        laundryRepository.save(laundry);
    }

    public void updateLaundry(Integer id,Laundry laundry){
        Laundry l=laundryRepository.findLaundryById(id);
        if(l==null){
            throw new ApiException("laundry found");
        }

        l.setName(laundry.getName());
        l.setCommercialRegistertion(laundry.getCommercialRegistertion());
        l.setPhoneNumber(laundry.getPhoneNumber());
        l.setEmail(laundry.getEmail());

        laundryRepository.save(l);
    }

    public void deleteLaundry(Integer id){
        Laundry l=laundryRepository.findLaundryById(id);
        if(l==null){
            throw new ApiException("laundry found");
        }
        laundryRepository.delete(l);
    }

}