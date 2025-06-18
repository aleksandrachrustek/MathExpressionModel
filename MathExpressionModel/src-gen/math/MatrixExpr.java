/**
 */
package math;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.MatrixExpr#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getMatrixExpr()
 * @model
 * @generated
 */
public interface MatrixExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(MatrixContent)
	 * @see math.MathExpressionModelPackage#getMatrixExpr_Content()
	 * @model
	 * @generated
	 */
	MatrixContent getContent();

	/**
	 * Sets the value of the '{@link math.MatrixExpr#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(MatrixContent value);

} // MatrixExpr
