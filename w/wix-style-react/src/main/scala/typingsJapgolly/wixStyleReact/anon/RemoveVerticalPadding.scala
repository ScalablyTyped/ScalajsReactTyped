package typingsJapgolly.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveVerticalPadding extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var removeVerticalPadding: Any
}
object RemoveVerticalPadding {
  
  inline def apply(children: Any, className: Any, dataHook: Any, removeVerticalPadding: Any): RemoveVerticalPadding = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], removeVerticalPadding = removeVerticalPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveVerticalPadding]
  }
  
  extension [Self <: RemoveVerticalPadding](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setRemoveVerticalPadding(value: Any): Self = StObject.set(x, "removeVerticalPadding", value.asInstanceOf[js.Any])
  }
}
