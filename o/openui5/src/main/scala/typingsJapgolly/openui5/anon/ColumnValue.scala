package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiTableColumnMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnValue extends StObject {
  
  /**
    * filtered column.
    */
  var column: js.UndefOr[default] = js.undefined
  
  /**
    * filter value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ColumnValue {
  
  inline def apply(): ColumnValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnValue]
  }
  
  extension [Self <: ColumnValue](x: Self) {
    
    inline def setColumn(value: default): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
