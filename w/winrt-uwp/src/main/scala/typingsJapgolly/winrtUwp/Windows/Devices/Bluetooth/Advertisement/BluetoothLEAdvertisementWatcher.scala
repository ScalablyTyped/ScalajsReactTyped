package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.received
import typingsJapgolly.winrtUwp.winrtUwpStrings.stopped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to receive Bluetooth Low Energy (LE) advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher")
@js.native
/** Creates a new BluetoothLEAdvertisementWatcher object. */
class BluetoothLEAdvertisementWatcher () extends js.Object {
  /**
    * Creates a new BluetoothLEAdvertisementWatcher object with an advertisement filter to initialize the watcher.
    * @param advertisementFilter The advertisement filter to initialize the watcher.
    */
  def this(advertisementFilter: BluetoothLEAdvertisementFilter) = this()
  /** Gets or sets a BluetoothLEAdvertisementFilter object used for configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  /** Gets the maximum out of range timeout. */
  var maxOutOfRangeTimeout: Double = js.native
  /** Gets the maximum sampling interval. */
  var maxSamplingInterval: Double = js.native
  /** Gets the minimum out of range timeout. */
  var minOutOfRangeTimeout: Double = js.native
  /** Gets the minimum sampling interval. */
  var minSamplingInterval: Double = js.native
  /** Notification for new Bluetooth LE advertisement events received. */
  @JSName("onreceived")
  var onreceived_Original: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs] = js.native
  /** Notification to the app that the Bluetooth LE scanning for advertisements has been cancelled or aborted either by the app or due to an error. */
  @JSName("onstopped")
  var onstopped_Original: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs] = js.native
  /** Gets or sets the Bluetooth LE scanning mode. */
  var scanningMode: BluetoothLEScanningMode = js.native
  /** Gets or sets a BluetoothSignalStrengthFilter object used for configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
  /** Gets the current status of the BluetoothLEAdvertisementWatcher . */
  var status: BluetoothLEAdvertisementWatcherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_received(
    `type`: received,
    listener: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stopped(
    `type`: stopped,
    listener: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs]
  ): Unit = js.native
  /** Notification for new Bluetooth LE advertisement events received. */
  def onreceived(ev: BluetoothLEAdvertisementReceivedEventArgs with WinRTEvent[BluetoothLEAdvertisementWatcher]): Unit = js.native
  /** Notification to the app that the Bluetooth LE scanning for advertisements has been cancelled or aborted either by the app or due to an error. */
  def onstopped(
    ev: BluetoothLEAdvertisementWatcherStoppedEventArgs with WinRTEvent[BluetoothLEAdvertisementWatcher]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_received(
    `type`: received,
    listener: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementReceivedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stopped(
    `type`: stopped,
    listener: TypedEventHandler[BluetoothLEAdvertisementWatcher, BluetoothLEAdvertisementWatcherStoppedEventArgs]
  ): Unit = js.native
  /** Start the BluetoothLEAdvertisementWatcher to scan for Bluetooth LE advertisements. */
  def start(): Unit = js.native
  /** Stop the BluetoothLEAdvertisementWatcher and disable the scanning for Bluetooth LE advertisements. */
  def stop(): Unit = js.native
}

