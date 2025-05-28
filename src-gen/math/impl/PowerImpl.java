/**
 */
package math.impl;

import math.Expression;
import math.MathExpressionModelPackage;
import math.Power;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link math.impl.PowerImpl#getBase <em>Base</em>}</li>
 *   <li>{@link math.impl.PowerImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerImpl extends ExpressionImpl implements Power {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Expression base;

	/**
	 * The cached value of the '{@link #getExponent() <em>Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected Expression exponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExpressionModelPackage.Literals.POWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject) base;
			base = (Expression) eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathExpressionModelPackage.POWER__BASE,
							oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Expression newBase) {
		Expression oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExpressionModelPackage.POWER__BASE, oldBase,
					base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExponent() {
		if (exponent != null && exponent.eIsProxy()) {
			InternalEObject oldExponent = (InternalEObject) exponent;
			exponent = (Expression) eResolveProxy(oldExponent);
			if (exponent != oldExponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MathExpressionModelPackage.POWER__EXPONENT, oldExponent, exponent));
			}
		}
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetExponent() {
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExponent(Expression newExponent) {
		Expression oldExponent = exponent;
		exponent = newExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExpressionModelPackage.POWER__EXPONENT,
					oldExponent, exponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MathExpressionModelPackage.POWER__BASE:
			if (resolve)
				return getBase();
			return basicGetBase();
		case MathExpressionModelPackage.POWER__EXPONENT:
			if (resolve)
				return getExponent();
			return basicGetExponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MathExpressionModelPackage.POWER__BASE:
			setBase((Expression) newValue);
			return;
		case MathExpressionModelPackage.POWER__EXPONENT:
			setExponent((Expression) newValue);
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
		case MathExpressionModelPackage.POWER__BASE:
			setBase((Expression) null);
			return;
		case MathExpressionModelPackage.POWER__EXPONENT:
			setExponent((Expression) null);
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
		case MathExpressionModelPackage.POWER__BASE:
			return base != null;
		case MathExpressionModelPackage.POWER__EXPONENT:
			return exponent != null;
		}
		return super.eIsSet(featureID);
	}

} //PowerImpl
