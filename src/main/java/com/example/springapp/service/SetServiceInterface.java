package com.example.springapp.service;

import java.util.List;

import com.example.springapp.model.Set_;



public interface SetServiceInterface {
	
	List<Set_> getAllSet();
	Set_ getSetById(long id);
	List<Set_> getSetByExerciseId(long id);

}
	