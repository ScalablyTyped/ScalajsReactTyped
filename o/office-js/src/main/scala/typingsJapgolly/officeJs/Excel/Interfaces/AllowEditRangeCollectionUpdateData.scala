package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the AllowEditRangeCollection object, for use in `allowEditRangeCollection.set({ ... })`. */
trait AllowEditRangeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[AllowEditRangeData]] = js.undefined
}
object AllowEditRangeCollectionUpdateData {
  
  inline def apply(): AllowEditRangeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeCollectionUpdateData]
  }
  
  extension [Self <: AllowEditRangeCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[AllowEditRangeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: AllowEditRangeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
