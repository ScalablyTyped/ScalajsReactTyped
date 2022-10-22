package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typingsJapgolly.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_Value: typingsJapgolly.cssTree.cssTreeStrings.Value
}
object Value {
  
  inline def apply(children: typingsJapgolly.cssTree.mod.List[CssNode]): Value = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Value")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
