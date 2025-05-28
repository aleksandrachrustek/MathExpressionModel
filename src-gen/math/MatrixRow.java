/**
 */
package math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link math.MatrixRow#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see math.MathExpressionModelPackage#getMatrixRow()
 * @model
 * @generated
 */
public interface MatrixRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link math.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see math.MathExpressionModelPackage#getMatrixRow_Elements()
	 * @model upper="2"
	 * @generated
	 */
	EList<Expression> getElements();

} // MatrixRow
