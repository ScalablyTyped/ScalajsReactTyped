package typingsJapgolly.winrtUwp.Windows.Devices.Midi

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.IClosable
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single MIDI out port. */
trait IMidiOutPort
  extends StObject
     with IClosable {
  
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
  
  inline def apply(
    close: Callback,
    deviceId: String,
    sendBuffer: IBuffer => Callback,
    sendMessage: IMidiMessage => Callback
  ): IMidiOutPort = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1((t0: IBuffer) => sendBuffer(t0).runNow()), sendMessage = js.Any.fromFunction1((t0: IMidiMessage) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[IMidiOutPort]
  }
  
  extension [Self <: IMidiOutPort](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSendBuffer(value: IBuffer => Callback): Self = StObject.set(x, "sendBuffer", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setSendMessage(value: IMidiMessage => Callback): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1((t0: IMidiMessage) => value(t0).runNow()))
  }
}
