/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Power#getBase <em>Base</em>}</li>
 *   <li>{@link math.Power#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getPower()
 * @model
 * @generated
 */
public interface Power extends Expression {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Expression)
	 * @see math.MathExpressionModelPackage#getPower_Base()
	 * @model
	 * @generated
	 */
	Expression getBase();

	/**
	 * Sets the value of the '{@link math.Power#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Expression value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exponent</em>' reference.
	 * @see #setExponent(Expression)
	 * @see math.MathExpressionModelPackage#getPower_Exponent()
	 * @model
	 * @generated
	 */
	Expression getExponent();

	/**
	 * Sets the value of the '{@link math.Power#getExponent <em>Exponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' reference.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(Expression value);

} // Power
