package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectorListPlain
  extends StObject
     with CssNodeCommon
     with CssNodePlain {
  
  var children: js.Array[CssNodePlain]
  
  @JSName("type")
  var type_SelectorListPlain: typingsJapgolly.cssTree.cssTreeStrings.SelectorList
}
object SelectorListPlain {
  
  inline def apply(children: js.Array[CssNodePlain]): SelectorListPlain = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SelectorList")
    __obj.asInstanceOf[SelectorListPlain]
  }
  
  extension [Self <: SelectorListPlain](x: Self) {
    
    inline def setChildren(value: js.Array[CssNodePlain]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: CssNodePlain*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.SelectorList): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
