/**
 */
package math.impl;

import java.util.Collection;

import math.MathExpressionModelPackage;
import math.MatrixContent;
import math.MatrixRow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link math.impl.MatrixContentImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixContentImpl extends MinimalEObjectImpl.Container implements MatrixContent {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExpressionModelPackage.Literals.MATRIX_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixRow> getRows() {
		if (rows == null) {
			rows = new EObjectResolvingEList<MatrixRow>(MatrixRow.class, this,
					MathExpressionModelPackage.MATRIX_CONTENT__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MathExpressionModelPackage.MATRIX_CONTENT__ROWS:
			return getRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MathExpressionModelPackage.MATRIX_CONTENT__ROWS:
			getRows().clear();
			getRows().addAll((Collection<? extends MatrixRow>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MathExpressionModelPackage.MATRIX_CONTENT__ROWS:
			getRows().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MathExpressionModelPackage.MATRIX_CONTENT__ROWS:
			return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatrixContentImpl
