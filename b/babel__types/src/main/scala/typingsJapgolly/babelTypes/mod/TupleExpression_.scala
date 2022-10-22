package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TupleExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TupleExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var elements: js.Array[Expression | SpreadElement_]
  
  @JSName("type")
  var type_TupleExpression_ : TupleExpression
}
object TupleExpression_ {
  
  inline def apply(elements: js.Array[Expression | SpreadElement_]): TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[TupleExpression_]
  }
  
  extension [Self <: TupleExpression_](x: Self) {
    
    inline def setElements(value: js.Array[Expression | SpreadElement_]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: (Expression | SpreadElement_)*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setType(value: TupleExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
