package typingsJapgolly.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableCollection object, for use in `tableCollection.set({ ... })`. */
trait TableCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[TableData]] = js.undefined
}
object TableCollectionUpdateData {
  
  inline def apply(): TableCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCollectionUpdateData]
  }
  
  extension [Self <: TableCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[TableData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TableData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
