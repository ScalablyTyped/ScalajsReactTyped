package typingsJapgolly.webBluetooth

import org.scalajs.dom.Event
import typingsJapgolly.std.EventTarget
import typingsJapgolly.webBluetooth.webBluetoothStrings.advertisementreceived
import typingsJapgolly.webBluetooth.webBluetoothStrings.availabilitychanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bluetooth
  extends StObject
     with EventTarget
     with BluetoothDeviceEventHandlers
     with CharacteristicEventHandlers
     with ServiceEventHandlers {
  
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BluetoothAdvertisingEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_advertisementreceived(
    `type`: advertisementreceived,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BluetoothAdvertisingEvent, Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(`type`: availabilitychanged, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: availabilitychanged,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getAvailability(): js.Promise[Boolean] = js.native
  
  def getDevices(): js.Promise[js.Array[BluetoothDevice]] = js.native
  
  def onavailabilitychanged(ev: Event): Any = js.native
  
  val referringDevice: js.UndefOr[BluetoothDevice] = js.native
  
  def requestDevice(): js.Promise[BluetoothDevice] = js.native
  def requestDevice(options: RequestDeviceOptions): js.Promise[BluetoothDevice] = js.native
  
  def requestLEScan(): js.Promise[BluetoothLEScan] = js.native
  def requestLEScan(options: BluetoothLEScanOptions): js.Promise[BluetoothLEScan] = js.native
}
