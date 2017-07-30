package com.capsilon.api.impl;

import javax.jws.WebService;

import com.capsilon.api.Calculator;

@WebService(endpointInterface = "com.capsilon.api.Calculator", serviceName = "calculatorService", targetNamespace = "http://types.capsilon.com")
public class CalculatorImpl implements Calculator
{
	@Override
	public int addition(int input1, int input2)
	{
		return input1 + input2;
	}

	@Override
	public int substraction(int input1, int input2)
	{
		return input1 - input2;
	}

	@Override
	public int multiplication(int input1, int input2)
	{
		return input1 * input2;
	}

	@Override
	public int division(int input1, int input2)
	{
		return input1 / input2;
	}
}
