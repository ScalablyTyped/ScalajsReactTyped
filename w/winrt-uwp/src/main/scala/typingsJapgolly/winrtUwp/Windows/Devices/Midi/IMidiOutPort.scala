package typingsJapgolly.winrtUwp.Windows.Devices.Midi

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single MIDI out port. */
trait IMidiOutPort extends IClosable {
  /** Gets the ID of the device that contains the MIDI out port. */
  var deviceId: String
  /**
    * Sends the contents of the buffer through the MIDI out port.
    * @param midiData The data to send to the device.
    */
  def sendBuffer(midiData: IBuffer): Unit
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit
}

object IMidiOutPort {
  @scala.inline
  def apply(
    close: Callback,
    deviceId: String,
    sendBuffer: IBuffer => Callback,
    sendMessage: IMidiMessage => Callback
  ): IMidiOutPort = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("sendBuffer")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer) => sendBuffer(t0).runNow()))
    __obj.updateDynamic("sendMessage")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Devices.Midi.IMidiMessage) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[IMidiOutPort]
  }
}

