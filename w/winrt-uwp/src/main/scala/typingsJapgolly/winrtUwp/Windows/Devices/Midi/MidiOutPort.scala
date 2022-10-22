package typingsJapgolly.winrtUwp.Windows.Devices.Midi

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a port used to send MIDI messages to a MIDI device. */
trait MidiOutPort extends StObject {
  
  /** Closes the MidiOutPort . */
  def close(): Unit
  
  /** Gets the id of the device that was used to initialize the MidiOutPort . */
  var deviceId: String
  
  /**
    * Send the specified data buffer to the device associated with this MidiOutPort .
    * @param midiData The data to send to the device.
    */
  def sendBuffer(midiData: IBuffer): Unit
  
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit
}
object MidiOutPort {
  
  inline def apply(
    close: Callback,
    deviceId: String,
    sendBuffer: IBuffer => Callback,
    sendMessage: IMidiMessage => Callback
  ): MidiOutPort = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1((t0: IBuffer) => sendBuffer(t0).runNow()), sendMessage = js.Any.fromFunction1((t0: IMidiMessage) => sendMessage(t0).runNow()))
    __obj.asInstanceOf[MidiOutPort]
  }
  
  extension [Self <: MidiOutPort](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSendBuffer(value: IBuffer => Callback): Self = StObject.set(x, "sendBuffer", js.Any.fromFunction1((t0: IBuffer) => value(t0).runNow()))
    
    inline def setSendMessage(value: IMidiMessage => Callback): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1((t0: IMidiMessage) => value(t0).runNow()))
  }
}
