package typingsJapgolly.algebraJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("algebra.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("algebra.js", "Equation")
  @js.native
  open class Equation protected ()
    extends StObject
       with typingsJapgolly.algebraJs.mod.algebra.js_.Equation {
    def this(lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression, rhs: Double) = this()
    def this(
      lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression,
      rhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression
    ) = this()
    def this(
      lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression,
      rhs: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction
    ) = this()
    
    /* CompleteClass */
    var lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
    
    /* CompleteClass */
    var rhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
    
    /* CompleteClass */
    override def solveFor(variable: String): js.UndefOr[
        typingsJapgolly.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]) | typingsJapgolly.algebraJs.mod.algebra.js_.Expression
      ] = js.native
  }
  
  @JSImport("algebra.js", "Expression")
  @js.native
  open class Expression ()
    extends StObject
       with typingsJapgolly.algebraJs.mod.algebra.js_.Expression {
    def this(variable: Union) = this()
  }
  
  @JSImport("algebra.js", "Fraction")
  @js.native
  open class Fraction protected ()
    extends StObject
       with typingsJapgolly.algebraJs.mod.algebra.js_.Fraction {
    def this(num: Double, denom: Double) = this()
  }
  
  inline def parse(input: String): typingsJapgolly.algebraJs.mod.algebra.js_.Equation | typingsJapgolly.algebraJs.mod.algebra.js_.Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.algebraJs.mod.algebra.js_.Equation | typingsJapgolly.algebraJs.mod.algebra.js_.Expression]
  
  inline def toTex(input: js.Array[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction | js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTex(input: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTex(input: typingsJapgolly.algebraJs.mod.algebra.js_.Equation): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTex(input: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toTex(input: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTex")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Term
    extends StObject
       with _Union {
    
    def coefficient(): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction
    
    var coefficients: js.Array[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]
    
    var variables: js.Array[Variable]
  }
  object Term {
    
    inline def apply(
      coefficient: CallbackTo[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction],
      coefficients: js.Array[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction],
      variables: js.Array[Variable]
    ): Term = {
      val __obj = js.Dynamic.literal(coefficient = coefficient.toJsFn, coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    extension [Self <: Term](x: Self) {
      
      inline def setCoefficient(value: CallbackTo[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]): Self = StObject.set(x, "coefficient", value.toJsFn)
      
      inline def setCoefficients(value: js.Array[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]): Self = StObject.set(x, "coefficients", value.asInstanceOf[js.Any])
      
      inline def setCoefficientsVarargs(value: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction*): Self = StObject.set(x, "coefficients", js.Array(value*))
      
      inline def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typingsJapgolly.algebraJs.mod.algebra.js_.Fraction
    - typingsJapgolly.algebraJs.mod.Term
  */
  type Union = _Union | String | Double
  
  trait Variable extends StObject {
    
    var variable: String
  }
  object Variable {
    
    inline def apply(variable: String): Variable = {
      val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variable]
    }
    
    extension [Self <: Variable](x: Self) {
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Union extends StObject
  
  object algebra {
    
    object js_ {
      
      trait Equation extends StObject {
        
        var lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression
        
        var rhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression
        
        def solveFor(variable: String): js.UndefOr[
                typingsJapgolly.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]) | typingsJapgolly.algebraJs.mod.algebra.js_.Expression
              ]
      }
      object Equation {
        
        inline def apply(
          lhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression,
          rhs: typingsJapgolly.algebraJs.mod.algebra.js_.Expression,
          solveFor: String => js.UndefOr[
                  typingsJapgolly.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]) | typingsJapgolly.algebraJs.mod.algebra.js_.Expression
                ]
        ): typingsJapgolly.algebraJs.mod.algebra.js_.Equation = {
          val __obj = js.Dynamic.literal(lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any], solveFor = js.Any.fromFunction1(solveFor))
          __obj.asInstanceOf[typingsJapgolly.algebraJs.mod.algebra.js_.Equation]
        }
        
        extension [Self <: typingsJapgolly.algebraJs.mod.algebra.js_.Equation](x: Self) {
          
          inline def setLhs(value: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
          
          inline def setRhs(value: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
          
          inline def setSolveFor(
            value: String => js.UndefOr[
                      typingsJapgolly.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typingsJapgolly.algebraJs.mod.algebra.js_.Fraction]) | typingsJapgolly.algebraJs.mod.algebra.js_.Expression
                    ]
          ): Self = StObject.set(x, "solveFor", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait Expression extends StObject {
        
        def add(other: Union): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: Union, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def constant(): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var constants: js.Array[typingsJapgolly.algebraJs.mod.algebra.js_.Fraction] = js.native
        
        def divide(other: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def eval(p: js.Object): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def eval(p: js.Object, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def multiply(other: Union): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: Union, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def pow(p: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def pow(p: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def simplify(): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def subtract(other: Union): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: Union, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: typingsJapgolly.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        def summation(variable: String, lower: Double, upper: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Expression = js.native
        
        var terms: js.Array[Term] = js.native
      }
      
      @js.native
      trait Fraction
        extends StObject
           with _Union {
        
        def abs(): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        
        def add(other: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var denom: Double = js.native
        
        def divide(other: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        
        def multiply(other: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var numer: Double = js.native
        
        def subtract(other: Double): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: Double, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: typingsJapgolly.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typingsJapgolly.algebraJs.mod.algebra.js_.Fraction = js.native
      }
    }
  }
}
