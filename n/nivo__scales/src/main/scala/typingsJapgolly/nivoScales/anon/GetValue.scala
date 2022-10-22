package typingsJapgolly.nivoScales.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleAxis
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetValue[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */] extends StObject {
  
  var getValue: js.UndefOr[js.Function1[/* d */ DataRecord[Axis, Value], Value | Null]] = js.undefined
  
  var setValue: js.UndefOr[js.Function2[/* d */ DataRecord[Axis, Value], /* v */ Value, Unit]] = js.undefined
}
object GetValue {
  
  inline def apply[Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](): GetValue[Axis, Value] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetValue[Axis, Value]]
  }
  
  extension [Self <: GetValue[?, ?], Axis /* <: ScaleAxis */, Value /* <: ScaleValue */](x: Self & (GetValue[Axis, Value])) {
    
    inline def setGetValue(value: /* d */ DataRecord[Axis, Value] => Value | Null): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setSetValue(value: (/* d */ DataRecord[Axis, Value], /* v */ Value) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: /* d */ DataRecord[Axis, Value], t1: /* v */ Value) => (value(t0, t1)).runNow()))
    
    inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
  }
}
