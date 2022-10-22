package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.emphasis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emphasis
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Emphasis: emphasis
}
object Emphasis {
  
  inline def apply(children: js.Array[PhrasingContent]): Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("emphasis")
    __obj.asInstanceOf[Emphasis]
  }
  
  extension [Self <: Emphasis](x: Self) {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setType(value: emphasis): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
