package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `linkedWorkbookCollection.toJSON()`. */
trait LinkedWorkbookCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[LinkedWorkbookData]] = js.undefined
}
object LinkedWorkbookCollectionData {
  
  inline def apply(): LinkedWorkbookCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedWorkbookCollectionData]
  }
  
  extension [Self <: LinkedWorkbookCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[LinkedWorkbookData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: LinkedWorkbookData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
