/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Product#getLower <em>Lower</em>}</li>
 *   <li>{@link math.Product#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends Expression {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' reference.
	 * @see #setLower(Expression)
	 * @see math.MathExpressionModelPackage#getProduct_Lower()
	 * @model
	 * @generated
	 */
	Expression getLower();

	/**
	 * Sets the value of the '{@link math.Product#getLower <em>Lower</em>}' reference.
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
	 * @see math.MathExpressionModelPackage#getProduct_Upper()
	 * @model
	 * @generated
	 */
	Expression getUpper();

	/**
	 * Sets the value of the '{@link math.Product#getUpper <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' reference.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Expression value);

} // Product
