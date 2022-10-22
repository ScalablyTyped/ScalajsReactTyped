package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brackets
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typingsJapgolly.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_Brackets: typingsJapgolly.cssTree.cssTreeStrings.Brackets
}
object Brackets {
  
  inline def apply(children: typingsJapgolly.cssTree.mod.List[CssNode]): Brackets = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Brackets")
    __obj.asInstanceOf[Brackets]
  }
  
  extension [Self <: Brackets](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Brackets): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
