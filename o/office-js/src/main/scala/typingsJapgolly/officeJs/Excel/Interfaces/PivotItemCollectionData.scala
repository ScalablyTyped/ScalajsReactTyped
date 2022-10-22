package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotItemCollection.toJSON()`. */
trait PivotItemCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotItemData]] = js.undefined
}
object PivotItemCollectionData {
  
  inline def apply(): PivotItemCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionData]
  }
  
  extension [Self <: PivotItemCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PivotItemData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotItemData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
