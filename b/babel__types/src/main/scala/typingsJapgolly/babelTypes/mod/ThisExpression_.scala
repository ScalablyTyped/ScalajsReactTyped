package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ThisExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait ThisExpression_
  extends StObject
     with BaseNode
     with Expression
     with Standardized {
  
  @JSName("type")
  var type_ThisExpression_ : ThisExpression
}
object ThisExpression_ {
  
  inline def apply(): ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[ThisExpression_]
  }
  
  extension [Self <: ThisExpression_](x: Self) {
    
    inline def setType(value: ThisExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
