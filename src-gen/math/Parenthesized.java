/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parenthesized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.Parenthesized#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getParenthesized()
 * @model
 * @generated
 */
public interface Parenthesized extends Expression {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' reference.
	 * @see #setExpr(Expression)
	 * @see math.MathExpressionModelPackage#getParenthesized_Expr()
	 * @model
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link math.Parenthesized#getExpr <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // Parenthesized
