package typingsJapgolly.winrtUwp.Windows.Devices.Sensors

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a controller responsible for turning on or off the phone display based on the readings from the ProximitySensor . */
trait ProximitySensorDisplayOnOffController extends StObject {
  
  /** Disconnects this ProximitySensorDisplayOnOffController instance from the service and frees all the allocated resources. */
  def close(): Unit
}
object ProximitySensorDisplayOnOffController {
  
  inline def apply(close: Callback): ProximitySensorDisplayOnOffController = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[ProximitySensorDisplayOnOffController]
  }
  
  extension [Self <: ProximitySensorDisplayOnOffController](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
