/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Modulo#getLeft <em>Left</em>}</li>
 *   <li>{@link math.Modulo#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Expression)
	 * @see math.MathExpressionModelPackage#getModulo_Left()
	 * @model
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link math.Modulo#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Expression)
	 * @see math.MathExpressionModelPackage#getModulo_Right()
	 * @model
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link math.Modulo#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Modulo
