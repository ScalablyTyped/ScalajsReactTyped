package typingsJapgolly.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CustomProperty object, for use in `customProperty.set({ ... })`. */
trait CustomPropertyUpdateData extends StObject {
  
  /**
    * The value of the custom property. The value is limited to 255 characters outside of Excel on the web (larger values are automatically trimmed to 255 characters on other platforms).
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[Any] = js.undefined
}
object CustomPropertyUpdateData {
  
  inline def apply(): CustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPropertyUpdateData]
  }
  
  extension [Self <: CustomPropertyUpdateData](x: Self) {
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
