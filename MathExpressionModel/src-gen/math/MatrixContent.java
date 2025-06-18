/**
 */
package math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.MatrixContent#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getMatrixContent()
 * @model
 * @generated
 */
public interface MatrixContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list.
	 * The list contents are of type {@link math.MatrixRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see math.MathExpressionModelPackage#getMatrixContent_Rows()
	 * @model upper="2"
	 * @generated
	 */
	EList<MatrixRow> getRows();

} // MatrixContent
