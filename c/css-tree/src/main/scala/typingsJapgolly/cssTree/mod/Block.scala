package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typingsJapgolly.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_Block: typingsJapgolly.cssTree.cssTreeStrings.Block
}
object Block {
  
  inline def apply(children: typingsJapgolly.cssTree.mod.List[CssNode]): Block = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Block): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
