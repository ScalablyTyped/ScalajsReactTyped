package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQuery
  extends StObject
     with CssNodeCommon
     with CssNode {
  
  var children: typingsJapgolly.cssTree.mod.List[CssNode]
  
  @JSName("type")
  var type_MediaQuery: typingsJapgolly.cssTree.cssTreeStrings.MediaQuery
}
object MediaQuery {
  
  inline def apply(children: typingsJapgolly.cssTree.mod.List[CssNode]): MediaQuery = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaQuery")
    __obj.asInstanceOf[MediaQuery]
  }
  
  extension [Self <: MediaQuery](x: Self) {
    
    inline def setChildren(value: typingsJapgolly.cssTree.mod.List[CssNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.MediaQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
