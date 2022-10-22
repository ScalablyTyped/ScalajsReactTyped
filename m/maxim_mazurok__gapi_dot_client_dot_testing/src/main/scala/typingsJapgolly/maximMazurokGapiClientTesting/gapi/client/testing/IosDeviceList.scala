package typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosDeviceList extends StObject {
  
  /** Required. A list of iOS devices. */
  var iosDevices: js.UndefOr[js.Array[IosDevice]] = js.undefined
}
object IosDeviceList {
  
  inline def apply(): IosDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosDeviceList]
  }
  
  extension [Self <: IosDeviceList](x: Self) {
    
    inline def setIosDevices(value: js.Array[IosDevice]): Self = StObject.set(x, "iosDevices", value.asInstanceOf[js.Any])
    
    inline def setIosDevicesUndefined: Self = StObject.set(x, "iosDevices", js.undefined)
    
    inline def setIosDevicesVarargs(value: IosDevice*): Self = StObject.set(x, "iosDevices", js.Array(value*))
  }
}
