package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.JSXOpeningFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait JSXOpeningFragment_
  extends StObject
     with BaseNode
     with Immutable
     with JSX {
  
  @JSName("type")
  var type_JSXOpeningFragment_ : JSXOpeningFragment
}
object JSXOpeningFragment_ {
  
  inline def apply(): JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment_]
  }
  
  extension [Self <: JSXOpeningFragment_](x: Self) {
    
    inline def setType(value: JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
