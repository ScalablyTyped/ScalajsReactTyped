package typingsJapgolly.webmidi.WebMidi

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIMessageEvent extends Event_ {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double = js.native
}

