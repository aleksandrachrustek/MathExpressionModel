/**
 */
package math.impl;

import math.Division;
import math.Expression;
import math.MathExpressionModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link math.impl.DivisionImpl#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link math.impl.DivisionImpl#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivisionImpl extends MinimalEObjectImpl.Container implements Division {
	/**
	 * The cached value of the '{@link #getNumerator() <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumerator()
	 * @generated
	 * @ordered
	 */
	protected Expression numerator;

	/**
	 * The cached value of the '{@link #getDenominator() <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominator()
	 * @generated
	 * @ordered
	 */
	protected Expression denominator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExpressionModelPackage.Literals.DIVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getNumerator() {
		return numerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumerator(Expression newNumerator, NotificationChain msgs) {
		Expression oldNumerator = numerator;
		numerator = newNumerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MathExpressionModelPackage.DIVISION__NUMERATOR, oldNumerator, newNumerator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumerator(Expression newNumerator) {
		if (newNumerator != numerator) {
			NotificationChain msgs = null;
			if (numerator != null)
				msgs = ((InternalEObject) numerator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.DIVISION__NUMERATOR, null, msgs);
			if (newNumerator != null)
				msgs = ((InternalEObject) newNumerator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.DIVISION__NUMERATOR, null, msgs);
			msgs = basicSetNumerator(newNumerator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExpressionModelPackage.DIVISION__NUMERATOR,
					newNumerator, newNumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getDenominator() {
		return denominator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDenominator(Expression newDenominator, NotificationChain msgs) {
		Expression oldDenominator = denominator;
		denominator = newDenominator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MathExpressionModelPackage.DIVISION__DENOMINATOR, oldDenominator, newDenominator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDenominator(Expression newDenominator) {
		if (newDenominator != denominator) {
			NotificationChain msgs = null;
			if (denominator != null)
				msgs = ((InternalEObject) denominator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.DIVISION__DENOMINATOR, null, msgs);
			if (newDenominator != null)
				msgs = ((InternalEObject) newDenominator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.DIVISION__DENOMINATOR, null, msgs);
			msgs = basicSetDenominator(newDenominator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExpressionModelPackage.DIVISION__DENOMINATOR,
					newDenominator, newDenominator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MathExpressionModelPackage.DIVISION__NUMERATOR:
			return basicSetNumerator(null, msgs);
		case MathExpressionModelPackage.DIVISION__DENOMINATOR:
			return basicSetDenominator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MathExpressionModelPackage.DIVISION__NUMERATOR:
			return getNumerator();
		case MathExpressionModelPackage.DIVISION__DENOMINATOR:
			return getDenominator();
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
		case MathExpressionModelPackage.DIVISION__NUMERATOR:
			setNumerator((Expression) newValue);
			return;
		case MathExpressionModelPackage.DIVISION__DENOMINATOR:
			setDenominator((Expression) newValue);
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
		case MathExpressionModelPackage.DIVISION__NUMERATOR:
			setNumerator((Expression) null);
			return;
		case MathExpressionModelPackage.DIVISION__DENOMINATOR:
			setDenominator((Expression) null);
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
		case MathExpressionModelPackage.DIVISION__NUMERATOR:
			return numerator != null;
		case MathExpressionModelPackage.DIVISION__DENOMINATOR:
			return denominator != null;
		}
		return super.eIsSet(featureID);
	}

} //DivisionImpl
