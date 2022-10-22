package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsOpen extends StObject {
  
  var isOpen: Boolean
  
  var selectedIds: js.Array[Any]
}
object IsOpen {
  
  inline def apply(isOpen: Boolean, selectedIds: js.Array[Any]): IsOpen = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOpen]
  }
  
  extension [Self <: IsOpen](x: Self) {
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setSelectedIds(value: js.Array[Any]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedIdsVarargs(value: Any*): Self = StObject.set(x, "selectedIds", js.Array(value*))
  }
}
