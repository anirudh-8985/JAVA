package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.Sorter;
import com.mycompany.app.Bubblesort;
import com.mycompany.app.InsertionSort;
import com.mycompany.app.MergeSort;



@RestController
public class ServiceController{

	@RequestMapping("/bubblesort")
	public double[] service(){
	Sorter sorter = new Sorter();

	double arr[] = {10,14,12,1,2,3,55,33,12,999};
	
		return (sorter.Sort(arr,new Bubblesort()));
	}
	
	@RequestMapping("/insertionsort")
	public double[] service1(){
	Sorter sorter = new Sorter();

	double arr[] = {10,14,12,1,2,3,55,33,12,999};
	
		return (sorter.Sort(arr,new InsertionSort()));
	}
	
	@RequestMapping("/mergesort")
	public double[] service2(){
	Sorter sorter = new Sorter();

	double arr[] = {10,14,12,1,2,3,55,33,12,1999};
	
		return (sorter.Sort(arr,new MergeSort()));
	}
}


