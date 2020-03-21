package typingsJapgolly.winrtUwp.Windows.Media.DialProtocol

import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DevicePickerAppearance
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.UI.Popups.Placement
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.dialdevicepickerdismissed
import typingsJapgolly.winrtUwp.winrtUwpStrings.dialdeviceselected
import typingsJapgolly.winrtUwp.winrtUwpStrings.disconnectbuttonclicked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a picker flyout that contains a list of remote devices for the user to choose from. */
@JSGlobal("Windows.Media.DialProtocol.DialDevicePicker")
@js.native
/** Creates a new DialDevicePicker object. */
class DialDevicePicker () extends js.Object {
  /** Used to change the colors of the picker. */
  var appearance: DevicePickerAppearance = js.native
  /** Gets the filter used to choose what devices to show in the picker. */
  var filter: DialDevicePickerFilter = js.native
  /** Indicates that the device picker was light dismissed, which means that the user clicked or touched anywhere other than the picker UI, and so the picker will be closed. */
  @JSName("ondialdevicepickerdismissed")
  var ondialdevicepickerdismissed_Original: TypedEventHandler[DialDevicePicker, _] = js.native
  /** Indicates that the user selected a device from the picker. */
  @JSName("ondialdeviceselected")
  var ondialdeviceselected_Original: TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs] = js.native
  /** Indicates that the user clicked on the disconnect button in the picker. */
  @JSName("ondisconnectbuttonclicked")
  var ondisconnectbuttonclicked_Original: TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialdevicepickerdismissed(`type`: dialdevicepickerdismissed, listener: TypedEventHandler[DialDevicePicker, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialdeviceselected(
    `type`: dialdeviceselected,
    listener: TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnectbuttonclicked(
    `type`: disconnectbuttonclicked,
    listener: TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs]
  ): Unit = js.native
  /** Hides the picker. */
  def hide(): Unit = js.native
  /** Indicates that the device picker was light dismissed, which means that the user clicked or touched anywhere other than the picker UI, and so the picker will be closed. */
  def ondialdevicepickerdismissed(ev: js.Any with WinRTEvent[DialDevicePicker]): Unit = js.native
  /** Indicates that the user selected a device from the picker. */
  def ondialdeviceselected(ev: DialDeviceSelectedEventArgs with WinRTEvent[DialDevicePicker]): Unit = js.native
  /** Indicates that the user clicked on the disconnect button in the picker. */
  def ondisconnectbuttonclicked(ev: DialDisconnectButtonClickedEventArgs with WinRTEvent[DialDevicePicker]): Unit = js.native
  /**
    * Shows the picker. Call this method directly to show to show the picker, instead of showing it in response to an event.
    * @param selection The rectangle from which to show the picker.
    * @return The device the user selected from the picker.
    */
  def pickSingleDialDeviceAsync(selection: Rect): IPromiseWithIAsyncOperation[DialDevice] = js.native
  /**
    * Shows the picker. Call this method directly to show to show the picker, instead of showing it in response to an event.
    * @param selection The rectangle from which to show the picker.
    * @param preferredPlacement The edge of the rectangle from which to show the picker.
    * @return The DialDevice object selected.
    */
  def pickSingleDialDeviceAsync(selection: Rect, preferredPlacement: Placement): IPromiseWithIAsyncOperation[DialDevice] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialdevicepickerdismissed(`type`: dialdevicepickerdismissed, listener: TypedEventHandler[DialDevicePicker, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialdeviceselected(
    `type`: dialdeviceselected,
    listener: TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnectbuttonclicked(
    `type`: disconnectbuttonclicked,
    listener: TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs]
  ): Unit = js.native
  /**
    * Updates the picker UI to reflect the status fo a given remote device.
    * @param device The remote device whose status you want to display.
    * @param status The status you want displayed.
    */
  def setDisplayStatus(device: DialDevice, status: DialDeviceDisplayStatus): Unit = js.native
  /**
    * Displays the picker to the user. When called, the picker flies out from an edge of the provided rectangle.
    * @param selection The rectangle from which you want the picker to show.
    */
  def show(selection: Rect): Unit = js.native
  /**
    * Displays the picker to the user. When called, the picker flies out from the specified edge of the provided rectangle.
    * @param selection The rectangle from which you want the picker to show.
    * @param preferredPlacement The edge from which you want the picker to show.
    */
  def show(selection: Rect, preferredPlacement: Placement): Unit = js.native
}

