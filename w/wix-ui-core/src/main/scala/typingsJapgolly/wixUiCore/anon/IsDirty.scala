package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDirty extends StObject {
  
  var isDirty: Boolean
  
  var selectedIds: js.Array[Any]
}
object IsDirty {
  
  inline def apply(isDirty: Boolean, selectedIds: js.Array[Any]): IsDirty = {
    val __obj = js.Dynamic.literal(isDirty = isDirty.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDirty]
  }
  
  extension [Self <: IsDirty](x: Self) {
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setSelectedIds(value: js.Array[Any]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
    
    inline def setSelectedIdsVarargs(value: Any*): Self = StObject.set(x, "selectedIds", js.Array(value*))
  }
}
