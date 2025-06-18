/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Sum#getLower <em>Lower</em>}</li>
 *   <li>{@link math.Sum#getUpper <em>Upper</em>}</li>
 *   <li>{@link math.Sum#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends Expression {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see math.MathExpressionModelPackage#getSum_Lower()
	 * @model
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link math.Sum#getLower <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' reference.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' reference.
	 * @see #setUpper(Expression)
	 * @see math.MathExpressionModelPackage#getSum_Upper()
	 * @model
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link math.Sum#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Expression)
	 * @see math.MathExpressionModelPackage#getSum_Body()
	 * @model
	 * @generated
	 */
	Expression getBody();

	/**
	 * Sets the value of the '{@link math.Sum#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Expression value);

} // Sum
