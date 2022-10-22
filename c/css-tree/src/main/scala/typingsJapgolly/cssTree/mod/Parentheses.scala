package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parentheses
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typingsJapgolly.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_Parentheses: typingsJapgolly.cssTree.cssTreeStrings.Parentheses
}
object Parentheses {
  
  inline def apply(children: typingsJapgolly.cssTree.mod.List[CssNode]): Parentheses = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parentheses")
    __obj.asInstanceOf[Parentheses]
  }
  
  extension [Self <: Parentheses](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Parentheses): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
