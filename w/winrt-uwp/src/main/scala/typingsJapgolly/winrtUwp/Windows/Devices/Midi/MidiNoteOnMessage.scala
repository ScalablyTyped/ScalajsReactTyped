package typingsJapgolly.winrtUwp.Windows.Devices.Midi

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a MIDI note to turn on. */
@JSGlobal("Windows.Devices.Midi.MidiNoteOnMessage")
@js.native
class MidiNoteOnMessage protected () extends js.Object {
  /**
    * Creates a new MidiNoteOnMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param velocity The velocity which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, velocity: Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double = js.native
  /** Gets the note to turn on which is specified as a value from 0-127. */
  var note: Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
  /** Gets the value of the velocity from 0-127. */
  var velocity: Double = js.native
}

