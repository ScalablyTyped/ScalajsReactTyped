package typingsJapgolly.winrtUwp.Windows.Devices.Usb

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the setup packet for a USB control transfer. For an explanation of the setup packet, see Table 9.2 in the Universal Serial Bus (USB) specification. */
@JSGlobal("Windows.Devices.Usb.UsbSetupPacket")
@js.native
/** Creates a UsbSetupPacket object. */
class UsbSetupPacket () extends js.Object {
  /**
    * Creates a UsbSetupPacket object from a formatted buffer (eight bytes) that contains the setup packet.
    * @param eightByteBuffer A caller-supplied buffer that contains the setup packet formatted as per the standard USB specification. The length of the buffer must be eight bytes because that is the size of a setup packet on the bus.
    */
  def this(eightByteBuffer: IBuffer) = this()
  /** Gets or sets the wIndex field in the setup packet of the USB control transfer. */
  var index: Double = js.native
  /** Gets the length, in bytes, of the setup packet. */
  var length: Double = js.native
  /** Gets or sets the bRequest field in the setup packet of the USB control transfer. */
  var request: Double = js.native
  /** Gets or sets the bmRequestType field in the setup packet of the USB control transfer. That field is represented by a UsbControlRequestType object. */
  var requestType: UsbControlRequestType = js.native
  /** Gets or sets the wValue field in the setup packet of the USB control transfer. */
  var value: Double = js.native
}

