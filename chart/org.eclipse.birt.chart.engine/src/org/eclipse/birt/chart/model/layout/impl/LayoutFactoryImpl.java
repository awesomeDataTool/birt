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

package org.eclipse.birt.chart.model.layout.impl;

import org.eclipse.birt.chart.model.layout.*;

import org.eclipse.birt.chart.model.layout.Block;
import org.eclipse.birt.chart.model.layout.ClientArea;
import org.eclipse.birt.chart.model.layout.LabelBlock;
import org.eclipse.birt.chart.model.layout.LayoutFactory;
import org.eclipse.birt.chart.model.layout.LayoutPackage;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.layout.TitleBlock;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory </b>. <!--
 * end-user-doc -->
 * @generated
 */
public class LayoutFactoryImpl extends EFactoryImpl implements LayoutFactory
{

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutFactory init( )
	{
		try
		{
			LayoutFactory theLayoutFactory = (LayoutFactory) EPackage.Registry.INSTANCE.getEFactory( "http://www.birt.eclipse.org/ChartModelLayout" ); //$NON-NLS-1$ 
			if ( theLayoutFactory != null )
			{
				return theLayoutFactory;
			}
		}
		catch ( Exception exception )
		{
			EcorePlugin.INSTANCE.log( exception );
		}
		return new LayoutFactoryImpl( );
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public LayoutFactoryImpl( )
	{
		super( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create( EClass eClass )
	{
		switch ( eClass.getClassifierID( ) )
		{
			case LayoutPackage.BLOCK :
				return createBlock( );
			case LayoutPackage.CLIENT_AREA :
				return createClientArea( );
			case LayoutPackage.LABEL_BLOCK :
				return createLabelBlock( );
			case LayoutPackage.LEGEND :
				return createLegend( );
			case LayoutPackage.PLOT :
				return createPlot( );
			case LayoutPackage.TITLE_BLOCK :
				return createTitleBlock( );
			default :
				throw new IllegalArgumentException( "The class '" + eClass.getName( ) + "' is not a valid classifier" ); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock( )
	{
		BlockImpl block = new BlockImpl( );
		return block;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ClientArea createClientArea( )
	{
		ClientAreaImpl clientArea = new ClientAreaImpl( );
		return clientArea;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LabelBlock createLabelBlock( )
	{
		LabelBlockImpl labelBlock = new LabelBlockImpl( );
		return labelBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Legend createLegend( )
	{
		LegendImpl legend = new LegendImpl( );
		return legend;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Plot createPlot( )
	{
		PlotImpl plot = new PlotImpl( );
		return plot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TitleBlock createTitleBlock( )
	{
		TitleBlockImpl titleBlock = new TitleBlockImpl( );
		return titleBlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutPackage getLayoutPackage( )
	{
		return (LayoutPackage) getEPackage( );
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static LayoutPackage getPackage( )
	{
		return LayoutPackage.eINSTANCE;
	}

} // LayoutFactoryImpl
