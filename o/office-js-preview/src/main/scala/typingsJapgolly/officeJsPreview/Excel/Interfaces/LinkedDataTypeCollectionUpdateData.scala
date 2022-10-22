package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the LinkedDataTypeCollection object, for use in `linkedDataTypeCollection.set({ ... })`. */
trait LinkedDataTypeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[LinkedDataTypeData]] = js.undefined
}
object LinkedDataTypeCollectionUpdateData {
  
  inline def apply(): LinkedDataTypeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedDataTypeCollectionUpdateData]
  }
  
  extension [Self <: LinkedDataTypeCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[LinkedDataTypeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LinkedDataTypeData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
