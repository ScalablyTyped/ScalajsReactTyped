package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.NumberLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait NumberLiteralTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  @JSName("type")
  var type_NumberLiteralTypeAnnotation_ : NumberLiteralTypeAnnotation
  
  var value: Double
}
object NumberLiteralTypeAnnotation_ {
  
  inline def apply(value: Double): NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[NumberLiteralTypeAnnotation_]
  }
  
  extension [Self <: NumberLiteralTypeAnnotation_](x: Self) {
    
    inline def setType(value: NumberLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
