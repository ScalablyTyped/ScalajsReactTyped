package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.anon.ProductId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBDevicesPermission
  extends StObject
     with Permission {
  
  var usbDevices: js.Array[ProductId]
}
object USBDevicesPermission {
  
  inline def apply(usbDevices: js.Array[ProductId]): USBDevicesPermission = {
    val __obj = js.Dynamic.literal(usbDevices = usbDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBDevicesPermission]
  }
  
  extension [Self <: USBDevicesPermission](x: Self) {
    
    inline def setUsbDevices(value: js.Array[ProductId]): Self = StObject.set(x, "usbDevices", value.asInstanceOf[js.Any])
    
    inline def setUsbDevicesVarargs(value: ProductId*): Self = StObject.set(x, "usbDevices", js.Array(value*))
  }
}
