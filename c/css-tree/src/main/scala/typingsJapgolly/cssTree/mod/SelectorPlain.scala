package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_SelectorPlain: typingsJapgolly.cssTree.cssTreeStrings.Selector
}
object SelectorPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): SelectorPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Selector")
    __obj.asInstanceOf[SelectorPlain]
  }
  
  extension [Self <: SelectorPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Selector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
