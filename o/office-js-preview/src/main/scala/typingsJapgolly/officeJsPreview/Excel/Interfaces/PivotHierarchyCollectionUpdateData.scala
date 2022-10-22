package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the PivotHierarchyCollection object, for use in `pivotHierarchyCollection.set({ ... })`. */
trait PivotHierarchyCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[PivotHierarchyData]] = js.undefined
}
object PivotHierarchyCollectionUpdateData {
  
  inline def apply(): PivotHierarchyCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHierarchyCollectionUpdateData]
  }
  
  extension [Self <: PivotHierarchyCollectionUpdateData](x: Self) {
    
    inline def setItems(value: js.Array[PivotHierarchyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PivotHierarchyData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
