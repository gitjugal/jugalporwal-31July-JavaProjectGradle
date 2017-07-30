package com.capsilon.api;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://types.capsilon.com")
public interface Calculator
{
	public int addition(@WebParam(name = "input1") int input1, @WebParam(name = "input2") int input2);

	public int substraction(@WebParam(name = "input1") int input1, @WebParam(name = "input2") int input2);

	public int multiplication(@WebParam(name = "input1") int input1, @WebParam(name = "input2") int input2);

	public int division(@WebParam(name = "input1") int input1, @WebParam(name = "input2") int input2);
}
