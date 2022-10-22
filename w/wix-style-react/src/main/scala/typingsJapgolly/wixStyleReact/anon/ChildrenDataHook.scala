package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenDataHook extends StObject {
  
  var children: Any
  
  var dataHook: Any
}
object ChildrenDataHook {
  
  inline def apply(children: Any, dataHook: Any): ChildrenDataHook = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenDataHook]
  }
  
  extension [Self <: ChildrenDataHook](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
