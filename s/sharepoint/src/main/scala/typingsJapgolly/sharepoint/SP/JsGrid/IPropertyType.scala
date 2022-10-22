package typingsJapgolly.sharepoint.SP.JsGrid

import japgolly.scalajs.react.Callback
import typingsJapgolly.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyType extends StObject {
  
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ DataValue, Unit],
    fnError: Any
  ): Unit
  
  var ID: String
}
object IPropertyType {
  
  inline def apply(
    BeginValidateNormalizeConvert: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Callback,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6((t0: Double, t1: String, t2: Any, t3: Boolean, t4: js.Function1[/* args */ DataValue, Unit], t5: Any) => (BeginValidateNormalizeConvert(t0, t1, t2, t3, t4, t5)).runNow()), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyType]
  }
  
  extension [Self <: IPropertyType](x: Self) {
    
    inline def setBeginValidateNormalizeConvert(value: (Double, String, Any, Boolean, js.Function1[/* args */ DataValue, Unit], Any) => Callback): Self = StObject.set(x, "BeginValidateNormalizeConvert", js.Any.fromFunction6((t0: Double, t1: String, t2: Any, t3: Boolean, t4: js.Function1[/* args */ DataValue, Unit], t5: Any) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
