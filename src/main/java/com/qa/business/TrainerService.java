package com.qa.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Trainer;
import com.qa.persistence.repository.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	private TrainerRepository repository;
	
	public List<Trainer> getAllTrainer(){
		return repository.findAll();
	}
	
	public Trainer saveTrainer(Trainer trainerToSave) 
	{
		return repository.save(trainerToSave);
	}
	
	public Trainer updateTrainer(Trainer trainerToUpdate) 
	{
		return repository.save(trainerToUpdate);
	}
	
	public String deleteTrainer(Long trainerIdToDelete) 
	{
		 repository.deleteById(trainerIdToDelete);
		 return "Well done you have the left the training team";
	}


}
