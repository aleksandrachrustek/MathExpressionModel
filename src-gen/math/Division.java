/**
 */
package math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Division</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Division#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link math.Division#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getDivision()
 * @model
 * @generated
 */
public interface Division extends EObject {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(Expression)
	 * @see math.MathExpressionModelPackage#getDivision_Numerator()
	 * @model containment="true"
	 * @generated
	 */
	Expression getNumerator();

	/**
	 * Sets the value of the '{@link math.Division#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(Expression value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(Expression)
	 * @see math.MathExpressionModelPackage#getDivision_Denominator()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDenominator();

	/**
	 * Sets the value of the '{@link math.Division#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(Expression value);

} // Division
