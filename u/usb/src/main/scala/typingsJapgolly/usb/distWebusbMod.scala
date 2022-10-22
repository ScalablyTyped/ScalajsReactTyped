package typingsJapgolly.usb

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Map
import typingsJapgolly.usb.usbStrings.connect
import typingsJapgolly.usb.usbStrings.disconnect
import typingsJapgolly.w3cWebUsb.USB
import typingsJapgolly.w3cWebUsb.USBDevice
import typingsJapgolly.w3cWebUsb.USBDeviceFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebusbMod {
  
  @JSImport("usb/dist/webusb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("usb/dist/webusb", "WebUSB")
  @js.native
  open class WebUSB ()
    extends StObject
       with USB {
    def this(options: USBOptions) = this()
    
    /* private */ var _onconnect: Any = js.native
    
    /* private */ var _ondisconnect: Any = js.native
    
    def addEventListener(`type`: connect | disconnect, listener: EventListener): Unit = js.native
    
    /* protected */ var allowedDevices: js.Array[USBDeviceFilter] = js.native
    
    /* protected */ var emitter: EventEmitter = js.native
    
    /* private */ var filterDevice: Any = js.native
    
    /* private */ var getDeviceId: Any = js.native
    
    /* private */ var isAllowedDevice: Any = js.native
    
    /* protected */ var knownDevices: Map[String, USBDevice] = js.native
    
    /* private */ var loadDevices: Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var preFilterDevices: Any = js.native
    
    def removeEventListener(`type`: connect | disconnect, callback: EventListener): Unit = js.native
  }
  
  inline def getWebUsb(): USB = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebUsb")().asInstanceOf[USB]
  
  trait USBOptions extends StObject {
    
    /**
      * Optional flag to automatically allow all devices
      */
    var allowAllDevices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional array of preconfigured allowed devices
      */
    var allowedDevices: js.UndefOr[js.Array[USBDeviceFilter]] = js.undefined
    
    /**
      * Optional timeout (in milliseconds) to use for the device control transfers
      */
    var deviceTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional `device found` callback function to allow the user to select a device
      */
    var devicesFound: js.UndefOr[js.Function1[/* devices */ js.Array[USBDevice], js.Promise[USBDevice | Unit]]] = js.undefined
  }
  object USBOptions {
    
    inline def apply(): USBOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[USBOptions]
    }
    
    extension [Self <: USBOptions](x: Self) {
      
      inline def setAllowAllDevices(value: Boolean): Self = StObject.set(x, "allowAllDevices", value.asInstanceOf[js.Any])
      
      inline def setAllowAllDevicesUndefined: Self = StObject.set(x, "allowAllDevices", js.undefined)
      
      inline def setAllowedDevices(value: js.Array[USBDeviceFilter]): Self = StObject.set(x, "allowedDevices", value.asInstanceOf[js.Any])
      
      inline def setAllowedDevicesUndefined: Self = StObject.set(x, "allowedDevices", js.undefined)
      
      inline def setAllowedDevicesVarargs(value: USBDeviceFilter*): Self = StObject.set(x, "allowedDevices", js.Array(value*))
      
      inline def setDeviceTimeout(value: Double): Self = StObject.set(x, "deviceTimeout", value.asInstanceOf[js.Any])
      
      inline def setDeviceTimeoutUndefined: Self = StObject.set(x, "deviceTimeout", js.undefined)
      
      inline def setDevicesFound(value: /* devices */ js.Array[USBDevice] => js.Promise[USBDevice | Unit]): Self = StObject.set(x, "devicesFound", js.Any.fromFunction1(value))
      
      inline def setDevicesFoundUndefined: Self = StObject.set(x, "devicesFound", js.undefined)
    }
  }
}
