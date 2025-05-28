/**
 */
package math.impl;

import math.Absolute;
import math.Addition;
import math.Constant;
import math.Division;
import math.Factorial;
import math.FunctionCall;
import math.Integral;
import math.MathExpressionModelFactory;
import math.MathExpressionModelPackage;
import math.MatrixContent;
import math.MatrixExpr;
import math.MatrixRow;
import math.Modulo;
import math.Multiplication;
import math.Parenthesized;
import math.Power;
import math.Product;
import math.Sqrt;
import math.Sum;
import math.Variable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MathExpressionModelFactoryImpl extends EFactoryImpl implements MathExpressionModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MathExpressionModelFactory init() {
		try {
			MathExpressionModelFactory theMathExpressionModelFactory = (MathExpressionModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MathExpressionModelPackage.eNS_URI);
			if (theMathExpressionModelFactory != null) {
				return theMathExpressionModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MathExpressionModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathExpressionModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MathExpressionModelPackage.NUMBER:
			return createNumber();
		case MathExpressionModelPackage.VARIABLE:
			return createVariable();
		case MathExpressionModelPackage.ADDITION:
			return createAddition();
		case MathExpressionModelPackage.MULTIPLICATION:
			return createMultiplication();
		case MathExpressionModelPackage.DIVISION:
			return createDivision();
		case MathExpressionModelPackage.SQRT:
			return createSqrt();
		case MathExpressionModelPackage.CONSTANT:
			return createConstant();
		case MathExpressionModelPackage.POWER:
			return createPower();
		case MathExpressionModelPackage.MODULO:
			return createModulo();
		case MathExpressionModelPackage.FACTORIAL:
			return createFactorial();
		case MathExpressionModelPackage.ABSOLUTE:
			return createAbsolute();
		case MathExpressionModelPackage.SUM:
			return createSum();
		case MathExpressionModelPackage.INTEGRAL:
			return createIntegral();
		case MathExpressionModelPackage.PRODUCT:
			return createProduct();
		case MathExpressionModelPackage.FUNCTION_CALL:
			return createFunctionCall();
		case MathExpressionModelPackage.PARENTHESIZED:
			return createParenthesized();
		case MathExpressionModelPackage.MATRIX_EXPR:
			return createMatrixExpr();
		case MathExpressionModelPackage.MATRIX_CONTENT:
			return createMatrixContent();
		case MathExpressionModelPackage.MATRIX_ROW:
			return createMatrixRow();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public math.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplication createMultiplication() {
		MultiplicationImpl multiplication = new MultiplicationImpl();
		return multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Division createDivision() {
		DivisionImpl division = new DivisionImpl();
		return division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sqrt createSqrt() {
		SqrtImpl sqrt = new SqrtImpl();
		return sqrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Power createPower() {
		PowerImpl power = new PowerImpl();
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Factorial createFactorial() {
		FactorialImpl factorial = new FactorialImpl();
		return factorial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Absolute createAbsolute() {
		AbsoluteImpl absolute = new AbsoluteImpl();
		return absolute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integral createIntegral() {
		IntegralImpl integral = new IntegralImpl();
		return integral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parenthesized createParenthesized() {
		ParenthesizedImpl parenthesized = new ParenthesizedImpl();
		return parenthesized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixExpr createMatrixExpr() {
		MatrixExprImpl matrixExpr = new MatrixExprImpl();
		return matrixExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixContent createMatrixContent() {
		MatrixContentImpl matrixContent = new MatrixContentImpl();
		return matrixContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixRow createMatrixRow() {
		MatrixRowImpl matrixRow = new MatrixRowImpl();
		return matrixRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MathExpressionModelPackage getMathExpressionModelPackage() {
		return (MathExpressionModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MathExpressionModelPackage getPackage() {
		return MathExpressionModelPackage.eINSTANCE;
	}

} //MathExpressionModelFactoryImpl
