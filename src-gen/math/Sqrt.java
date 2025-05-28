/**
 */
package math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqrt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Sqrt#getRadicand <em>Radicand</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getSqrt()
 * @model
 * @generated
 */
public interface Sqrt extends EObject {
	/**
	 * Returns the value of the '<em><b>Radicand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radicand</em>' containment reference.
	 * @see #setRadicand(Expression)
	 * @see math.MathExpressionModelPackage#getSqrt_Radicand()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRadicand();

	/**
	 * Sets the value of the '{@link math.Sqrt#getRadicand <em>Radicand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radicand</em>' containment reference.
	 * @see #getRadicand()
	 * @generated
	 */
	void setRadicand(Expression value);

} // Sqrt
