package typingsJapgolly.rcFieldForm.esInterfaceMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbacks[Values] extends StObject {
  
  var onFieldsChange: js.UndefOr[
    js.Function2[/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData], Unit]
  ] = js.undefined
  
  var onFinish: js.UndefOr[js.Function1[/* values */ Values, Unit]] = js.undefined
  
  var onFinishFailed: js.UndefOr[js.Function1[/* errorInfo */ ValidateErrorEntity[Values], Unit]] = js.undefined
  
  var onValuesChange: js.UndefOr[js.Function2[/* changedValues */ Any, /* values */ Values, Unit]] = js.undefined
}
object Callbacks {
  
  inline def apply[Values](): Callbacks[Values] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks[Values]]
  }
  
  extension [Self <: Callbacks[?], Values](x: Self & Callbacks[Values]) {
    
    inline def setOnFieldsChange(value: (/* changedFields */ js.Array[FieldData], /* allFields */ js.Array[FieldData]) => Callback): Self = StObject.set(x, "onFieldsChange", js.Any.fromFunction2((t0: /* changedFields */ js.Array[FieldData], t1: /* allFields */ js.Array[FieldData]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldsChangeUndefined: Self = StObject.set(x, "onFieldsChange", js.undefined)
    
    inline def setOnFinish(value: /* values */ Values => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction1((t0: /* values */ Values) => value(t0).runNow()))
    
    inline def setOnFinishFailed(value: /* errorInfo */ ValidateErrorEntity[Values] => Callback): Self = StObject.set(x, "onFinishFailed", js.Any.fromFunction1((t0: /* errorInfo */ ValidateErrorEntity[Values]) => value(t0).runNow()))
    
    inline def setOnFinishFailedUndefined: Self = StObject.set(x, "onFinishFailed", js.undefined)
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setOnValuesChange(value: (/* changedValues */ Any, /* values */ Values) => Callback): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction2((t0: /* changedValues */ Any, t1: /* values */ Values) => (value(t0, t1)).runNow()))
    
    inline def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
  }
}
