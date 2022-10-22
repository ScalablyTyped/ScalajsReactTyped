package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pivotFieldCollection.toJSON()`. */
trait PivotFieldCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
}
object PivotFieldCollectionData {
  
  inline def apply(): PivotFieldCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotFieldCollectionData]
  }
  
  extension [Self <: PivotFieldCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[PivotFieldData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotFieldData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
