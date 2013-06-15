/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE 
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. 
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY 
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE 
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" 
 * BUTTON AT THE BOTTOM OF THIS PAGE.
 *
 * Specification:  JSR-354  Money and Currency API ("Specification")
 *
 * Copyright (c) 2012-2013, Credit Suisse
 * All rights reserved.
 */
package javax.money.ext;

import java.util.Collection;

import javax.money.CurrencyUnit;

public class CurrencyValidityInfo {
	
	public Collection<CurrencyValidity> getValidityInfo(CurrencyUnit currencyUnit){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public Collection<CurrencyValidity> getValidityInfo(CurrencyUnit currencyUnit, long timestamp){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public Collection<CurrencyValidity> getValidityInfo(CurrencyUnit currencyUnit, long from, long to){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public Collection<CurrencyValidity> getValidityInfo(Region region){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public Collection<CurrencyValidity> getValidityInfo(Region region, long timestamp){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
	
	public Collection<CurrencyValidity> getValidityInfo(Region region, long from, long to){
		throw new UnsupportedOperationException("Not yet implemented.");
	}
}
