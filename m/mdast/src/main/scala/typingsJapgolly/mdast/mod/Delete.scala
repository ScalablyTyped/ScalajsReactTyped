package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Delete: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Delete: delete
}
object Delete {
  
  inline def apply(children: js.Array[PhrasingContent]): Delete = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
