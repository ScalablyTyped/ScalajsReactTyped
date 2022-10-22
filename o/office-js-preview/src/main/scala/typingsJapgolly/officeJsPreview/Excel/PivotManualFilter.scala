package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurable template for a manual filter to apply to a PivotField.
  The `condition` defines what criteria need to be set in order for the filter to operate.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
trait PivotManualFilter extends StObject {
  
  /**
    * A list of selected items to manually filter. These must be existing and valid items from the chosen field.
    *
    * @remarks
    * [Api set: ExcelApi 1.12]
    */
  var selectedItems: js.UndefOr[js.Array[String | PivotItem]] = js.undefined
}
object PivotManualFilter {
  
  inline def apply(): PivotManualFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotManualFilter]
  }
  
  extension [Self <: PivotManualFilter](x: Self) {
    
    inline def setSelectedItems(value: js.Array[String | PivotItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: (String | PivotItem)*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
