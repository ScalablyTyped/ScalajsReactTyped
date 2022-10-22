package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableColumnCollection object, for use in `tableColumnCollection.set({ ... })`. */
trait TableColumnCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableColumnData]] = js.undefined
}
object TableColumnCollectionUpdateData {
  
  inline def apply(): TableColumnCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnCollectionUpdateData]
  }
  
  extension [Self <: TableColumnCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TableColumnData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableColumnData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
