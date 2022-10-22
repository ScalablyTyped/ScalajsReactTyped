package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownDevice extends StObject {
  
  var shutdownDevice: js.UndefOr[Boolean] = js.undefined
}
object ShutdownDevice {
  
  inline def apply(): ShutdownDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShutdownDevice]
  }
  
  extension [Self <: ShutdownDevice](x: Self) {
    
    inline def setShutdownDevice(value: Boolean): Self = StObject.set(x, "shutdownDevice", value.asInstanceOf[js.Any])
    
    inline def setShutdownDeviceUndefined: Self = StObject.set(x, "shutdownDevice", js.undefined)
  }
}
