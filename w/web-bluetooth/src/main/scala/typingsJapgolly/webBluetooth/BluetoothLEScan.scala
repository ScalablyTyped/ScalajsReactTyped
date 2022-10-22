package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothLEScan
  extends StObject
     with BluetoothLEScanOptions {
  
  var active: Boolean
  
  def stop(): Unit
}
object BluetoothLEScan {
  
  inline def apply(active: Boolean, stop: Callback): BluetoothLEScan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], stop = stop.toJsFn)
    __obj.asInstanceOf[BluetoothLEScan]
  }
  
  extension [Self <: BluetoothLEScan](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
