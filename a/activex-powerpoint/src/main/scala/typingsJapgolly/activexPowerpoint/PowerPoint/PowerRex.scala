package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerRex extends StObject {
  
  def OnAsfEncoderEvent(erorCode: Any, bstrErrorDesc: Any): Unit
  
  /* private */ @JSName("PowerPoint.PowerRex_typekey")
  var PowerPointDotPowerRex_typekey: PowerRex
}
object PowerRex {
  
  inline def apply(OnAsfEncoderEvent: (Any, Any) => Callback, PowerPointDotPowerRex_typekey: PowerRex): PowerRex = {
    val __obj = js.Dynamic.literal(OnAsfEncoderEvent = js.Any.fromFunction2((t0: Any, t1: Any) => (OnAsfEncoderEvent(t0, t1)).runNow()))
    __obj.updateDynamic("PowerPoint.PowerRex_typekey")(PowerPointDotPowerRex_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerRex]
  }
  
  extension [Self <: PowerRex](x: Self) {
    
    inline def setOnAsfEncoderEvent(value: (Any, Any) => Callback): Self = StObject.set(x, "OnAsfEncoderEvent", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPowerPointDotPowerRex_typekey(value: PowerRex): Self = StObject.set(x, "PowerPoint.PowerRex_typekey", value.asInstanceOf[js.Any])
  }
}
