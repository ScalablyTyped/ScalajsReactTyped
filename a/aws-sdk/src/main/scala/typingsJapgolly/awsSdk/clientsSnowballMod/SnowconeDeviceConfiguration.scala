package typingsJapgolly.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowconeDeviceConfiguration extends StObject {
  
  /**
    * Configures the wireless connection for the Snowcone device.
    */
  var WirelessConnection: js.UndefOr[typingsJapgolly.awsSdk.clientsSnowballMod.WirelessConnection] = js.undefined
}
object SnowconeDeviceConfiguration {
  
  inline def apply(): SnowconeDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowconeDeviceConfiguration]
  }
  
  extension [Self <: SnowconeDeviceConfiguration](x: Self) {
    
    inline def setWirelessConnection(value: WirelessConnection): Self = StObject.set(x, "WirelessConnection", value.asInstanceOf[js.Any])
    
    inline def setWirelessConnectionUndefined: Self = StObject.set(x, "WirelessConnection", js.undefined)
  }
}
