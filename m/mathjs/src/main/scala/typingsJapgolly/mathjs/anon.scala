package typingsJapgolly.mathjs

import typingsJapgolly.mathjs.mod.MathCollection
import typingsJapgolly.mathjs.mod.MathNode
import typingsJapgolly.mathjs.mod.MathNumericType
import typingsJapgolly.mathjs.mod.MathType
import typingsJapgolly.mathjs.mod.SimplifyContext
import typingsJapgolly.mathjs.mod.UnitPrefix
import typingsJapgolly.mathjs.mod._SimplifyRule
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Associative extends StObject {
    
    var associative: Boolean
    
    var commutative: Boolean
    
    var total: Boolean
    
    var trivial: Boolean
  }
  object Associative {
    
    inline def apply(associative: Boolean, commutative: Boolean, total: Boolean, trivial: Boolean): Associative = {
      val __obj = js.Dynamic.literal(associative = associative.asInstanceOf[js.Any], commutative = commutative.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], trivial = trivial.asInstanceOf[js.Any])
      __obj.asInstanceOf[Associative]
    }
    
    extension [Self <: Associative](x: Self) {
      
      inline def setAssociative(value: Boolean): Self = StObject.set(x, "associative", value.asInstanceOf[js.Any])
      
      inline def setCommutative(value: Boolean): Self = StObject.set(x, "commutative", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Boolean): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTrivial(value: Boolean): Self = StObject.set(x, "trivial", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assuming
    extends StObject
       with _SimplifyRule {
    
    var assuming: js.UndefOr[SimplifyContext] = js.undefined
    
    var imposeContext: js.UndefOr[SimplifyContext] = js.undefined
    
    var l: String
    
    var r: String
    
    var repeat: js.UndefOr[Boolean] = js.undefined
  }
  object Assuming {
    
    inline def apply(l: String, r: String): Assuming = {
      val __obj = js.Dynamic.literal(l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assuming]
    }
    
    extension [Self <: Assuming](x: Self) {
      
      inline def setAssuming(value: SimplifyContext): Self = StObject.set(x, "assuming", value.asInstanceOf[js.Any])
      
      inline def setAssumingUndefined: Self = StObject.set(x, "assuming", js.undefined)
      
      inline def setImposeContext(value: SimplifyContext): Self = StObject.set(x, "imposeContext", value.asInstanceOf[js.Any])
      
      inline def setImposeContextUndefined: Self = StObject.set(x, "imposeContext", js.undefined)
      
      inline def setL(value: String): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    }
  }
  
  trait Base extends StObject {
    
    var base: Dimensions
    
    var dimensions: js.Array[Double]
    
    var name: String
    
    var offset: Double
    
    var prefixes: Record[String, UnitPrefix]
    
    var value: Double
  }
  object Base {
    
    inline def apply(
      base: Dimensions,
      dimensions: js.Array[Double],
      name: String,
      offset: Double,
      prefixes: Record[String, UnitPrefix],
      value: Double
    ): Base = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: Dimensions): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDimensions(value: js.Array[Double]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsVarargs(value: Double*): Self = StObject.set(x, "dimensions", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPrefixes(value: Record[String, UnitPrefix]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coefficients extends StObject {
    
    var coefficients: js.Array[MathType]
    
    var expression: MathNode | String
    
    var variables: js.Array[String]
  }
  object Coefficients {
    
    inline def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): Coefficients = {
      val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Coefficients]
    }
    
    extension [Self <: Coefficients](x: Self) {
      
      inline def setCoefficients(value: js.Array[MathType]): Self = StObject.set(x, "coefficients", value.asInstanceOf[js.Any])
      
      inline def setCoefficientsVarargs(value: MathType*): Self = StObject.set(x, "coefficients", js.Array(value*))
      
      inline def setExpression(value: MathNode | String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: js.Array[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: String*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
  
  trait Dimensions extends StObject {
    
    var dimensions: js.Array[Double]
    
    var key: String
  }
  object Dimensions {
    
    inline def apply(dimensions: js.Array[Double], key: String): Dimensions = {
      val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setDimensions(value: js.Array[Double]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setDimensionsVarargs(value: Double*): Self = StObject.set(x, "dimensions", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImposeContext
    extends StObject
       with _SimplifyRule {
    
    var assuming: js.UndefOr[SimplifyContext] = js.undefined
    
    var imposeContext: js.UndefOr[SimplifyContext] = js.undefined
    
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    var s: String
  }
  object ImposeContext {
    
    inline def apply(s: String): ImposeContext = {
      val __obj = js.Dynamic.literal(s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImposeContext]
    }
    
    extension [Self <: ImposeContext](x: Self) {
      
      inline def setAssuming(value: SimplifyContext): Self = StObject.set(x, "assuming", value.asInstanceOf[js.Any])
      
      inline def setAssumingUndefined: Self = StObject.set(x, "assuming", js.undefined)
      
      inline def setImposeContext(value: SimplifyContext): Self = StObject.set(x, "imposeContext", value.asInstanceOf[js.Any])
      
      inline def setImposeContextUndefined: Self = StObject.set(x, "imposeContext", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: MathNode
    
    var visible: Boolean
  }
  object Node {
    
    inline def apply(node: MathNode, visible: Boolean): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: MathNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeMathNode extends StObject {
    
    var node: MathNode
  }
  object NodeMathNode {
    
    inline def apply(node: MathNode): NodeMathNode = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMathNode]
    }
    
    extension [Self <: NodeMathNode](x: Self) {
      
      inline def setNode(value: MathNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Simplify extends StObject {
    
    var simplify: Boolean
  }
  object Simplify {
    
    inline def apply(simplify: Boolean): Simplify = {
      val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simplify]
    }
    
    extension [Self <: Simplify](x: Self) {
      
      inline def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    }
  }
  
  trait Values extends StObject {
    
    var values: MathCollection
    
    var vectors: MathCollection
  }
  object Values {
    
    inline def apply(values: MathCollection, vectors: MathCollection): Values = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any], vectors = vectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values]
    }
    
    extension [Self <: Values](x: Self) {
      
      inline def setValues(value: MathCollection): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVectors(value: MathCollection): Self = StObject.set(x, "vectors", value.asInstanceOf[js.Any])
      
      inline def setVectorsVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "vectors", js.Array(value*))
    }
  }
}
