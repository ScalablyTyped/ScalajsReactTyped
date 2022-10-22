package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattDeviceService
import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.connectionstatuschanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.gattserviceschanged
import typingsJapgolly.winrtUwp.winrtUwpStrings.namechanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Bluetooth LE device. */
@js.native
trait BluetoothLEDevice extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
  
  /** Gets the BluetoothLEAppearance object for the Bluetooth LE device. */
  var appearance: BluetoothLEAppearance = js.native
  
  /** Gets the device address. */
  var bluetoothAddress: Double = js.native
  
  /** Gets the address type for the Bluetooth LE device. */
  var bluetoothAddressType: BluetoothAddressType = js.native
  
  /** Closes this Bluetooth LE device. */
  def close(): Unit = js.native
  
  /** Gets the connection status of the device. */
  var connectionStatus: BluetoothConnectionStatus = js.native
  
  /** Gets the device Id. */
  var deviceId: String = js.native
  
  /** Gets the DeviceInformation object for the Bluetooth LE device. */
  var deviceInformation: DeviceInformation = js.native
  
  /** Gets the read-only list of GATT services supported by the device. */
  var gattServices: IVectorView[GattDeviceService] = js.native
  
  /**
    * Returns the GATT service with the given service Id.
    * @param serviceUuid The service Id of the GATT service.
    * @return The GATT service represented by the given service Id.
    */
  def getGattService(serviceUuid: String): GattDeviceService = js.native
  
  /** Gets the name of the Bluetooth LE device. */
  var name: String = js.native
  
  /** Occurs when the connection status for the device has changed. */
  def onconnectionstatuschanged(ev: Any & WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the connection status for the device has changed. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[BluetoothLEDevice, Any] = js.native
  
  /** Occurs when the list of GATT services supported by the device has changed. */
  def ongattserviceschanged(ev: Any & WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the list of GATT services supported by the device has changed. */
  @JSName("ongattserviceschanged")
  var ongattserviceschanged_Original: TypedEventHandler[BluetoothLEDevice, Any] = js.native
  
  /** Occurs when the name of the device has changed. */
  def onnamechanged(ev: Any & WinRTEvent[BluetoothLEDevice]): Unit = js.native
  /** Occurs when the name of the device has changed. */
  @JSName("onnamechanged")
  var onnamechanged_Original: TypedEventHandler[BluetoothLEDevice, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gattserviceschanged(`type`: gattserviceschanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_namechanged(`type`: namechanged, listener: TypedEventHandler[BluetoothLEDevice, Any]): Unit = js.native
}
