/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.attribute.impl;

import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.SeriesValue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Series Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.birt.chart.model.attribute.impl.SeriesValueImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeriesValueImpl extends ActionValueImpl implements SeriesValue
{

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SeriesValueImpl( )
	{
		super( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass( )
	{
		return AttributePackage.Literals.SERIES_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName( )
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName( String newName )
	{
		String oldName = name;
		name = newName;
		if ( eNotificationRequired( ) )
			eNotify( new ENotificationImpl( this,
					Notification.SET,
					AttributePackage.SERIES_VALUE__NAME,
					oldName,
					name ) );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet( int featureID, boolean resolve, boolean coreType )
	{
		switch ( featureID )
		{
			case AttributePackage.SERIES_VALUE__NAME :
				return getName( );
		}
		return super.eGet( featureID, resolve, coreType );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet( int featureID, Object newValue )
	{
		switch ( featureID )
		{
			case AttributePackage.SERIES_VALUE__NAME :
				setName( (String) newValue );
				return;
		}
		super.eSet( featureID, newValue );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset( int featureID )
	{
		switch ( featureID )
		{
			case AttributePackage.SERIES_VALUE__NAME :
				setName( NAME_EDEFAULT );
				return;
		}
		super.eUnset( featureID );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet( int featureID )
	{
		switch ( featureID )
		{
			case AttributePackage.SERIES_VALUE__NAME :
				return NAME_EDEFAULT == null ? name != null
						: !NAME_EDEFAULT.equals( name );
		}
		return super.eIsSet( featureID );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String toString( )
	{
		if ( eIsProxy( ) )
			return super.toString( );

		StringBuffer result = new StringBuffer( super.toString( ) );
		result.append( " (name: " ); //$NON-NLS-1$
		result.append( name );
		result.append( ')' );
		return result.toString( );
	}

	/**
	 * A convenience method provided to build a series action value when needed
	 * 
	 * @param name
	 * @return
	 */
	public static final SeriesValue create( String name )
	{
		SeriesValue sv = AttributeFactoryImpl.eINSTANCE.createSeriesValue( );
		sv.setName( name );
		return sv;
	}

} // SeriesValueImpl
