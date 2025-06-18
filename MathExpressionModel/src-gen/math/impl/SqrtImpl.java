/**
 */
package math.impl;

import math.Expression;
import math.MathExpressionModelPackage;
import math.Sqrt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqrt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link math.impl.SqrtImpl#getRadicand <em>Radicand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqrtImpl extends MinimalEObjectImpl.Container implements Sqrt {
	/**
	 * The cached value of the '{@link #getRadicand() <em>Radicand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadicand()
	 * @generated
	 * @ordered
	 */
	protected Expression radicand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqrtImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathExpressionModelPackage.Literals.SQRT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRadicand() {
		return radicand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRadicand(Expression newRadicand, NotificationChain msgs) {
		Expression oldRadicand = radicand;
		radicand = newRadicand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MathExpressionModelPackage.SQRT__RADICAND, oldRadicand, newRadicand);
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
	public void setRadicand(Expression newRadicand) {
		if (newRadicand != radicand) {
			NotificationChain msgs = null;
			if (radicand != null)
				msgs = ((InternalEObject) radicand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.SQRT__RADICAND, null, msgs);
			if (newRadicand != null)
				msgs = ((InternalEObject) newRadicand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MathExpressionModelPackage.SQRT__RADICAND, null, msgs);
			msgs = basicSetRadicand(newRadicand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MathExpressionModelPackage.SQRT__RADICAND,
					newRadicand, newRadicand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MathExpressionModelPackage.SQRT__RADICAND:
			return basicSetRadicand(null, msgs);
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
		case MathExpressionModelPackage.SQRT__RADICAND:
			return getRadicand();
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
		case MathExpressionModelPackage.SQRT__RADICAND:
			setRadicand((Expression) newValue);
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
		case MathExpressionModelPackage.SQRT__RADICAND:
			setRadicand((Expression) null);
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
		case MathExpressionModelPackage.SQRT__RADICAND:
			return radicand != null;
		}
		return super.eIsSet(featureID);
	}

} //SqrtImpl
