package typingsJapgolly.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  manualRowSelectedKey :react-table.react-table.IdType<D>,   autoResetSelectedRows :boolean,   selectSubRows :boolean}> */
trait UseRowSelectOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetSelectedRows: js.UndefOr[Boolean] = js.undefined
  
  var manualRowSelectedKey: js.UndefOr[IdType[D]] = js.undefined
  
  var selectSubRows: js.UndefOr[Boolean] = js.undefined
}
object UseRowSelectOptions {
  
  inline def apply[D /* <: js.Object */](): UseRowSelectOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowSelectOptions[D]]
  }
  
  extension [Self <: UseRowSelectOptions[?], D /* <: js.Object */](x: Self & UseRowSelectOptions[D]) {
    
    inline def setAutoResetSelectedRows(value: Boolean): Self = StObject.set(x, "autoResetSelectedRows", value.asInstanceOf[js.Any])
    
    inline def setAutoResetSelectedRowsUndefined: Self = StObject.set(x, "autoResetSelectedRows", js.undefined)
    
    inline def setManualRowSelectedKey(value: IdType[D]): Self = StObject.set(x, "manualRowSelectedKey", value.asInstanceOf[js.Any])
    
    inline def setManualRowSelectedKeyUndefined: Self = StObject.set(x, "manualRowSelectedKey", js.undefined)
    
    inline def setSelectSubRows(value: Boolean): Self = StObject.set(x, "selectSubRows", value.asInstanceOf[js.Any])
    
    inline def setSelectSubRowsUndefined: Self = StObject.set(x, "selectSubRows", js.undefined)
  }
}
