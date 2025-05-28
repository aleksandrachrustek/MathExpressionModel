/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.FunctionCall#getFunc <em>Func</em>}</li>
 *   <li>{@link math.FunctionCall#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Func</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Func</em>' attribute.
	 * @see #setFunc(String)
	 * @see math.MathExpressionModelPackage#getFunctionCall_Func()
	 * @model
	 * @generated
	 */
	String getFunc();

	/**
	 * Sets the value of the '{@link math.FunctionCall#getFunc <em>Func</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Func</em>' attribute.
	 * @see #getFunc()
	 * @generated
	 */
	void setFunc(String value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(Expression)
	 * @see math.MathExpressionModelPackage#getFunctionCall_Argument()
	 * @model
	 * @generated
	 */
	Expression getArgument();

	/**
	 * Sets the value of the '{@link math.FunctionCall#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Expression value);

} // FunctionCall
