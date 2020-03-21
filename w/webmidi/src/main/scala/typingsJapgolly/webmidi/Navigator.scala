package typingsJapgolly.webmidi

import typingsJapgolly.webmidi.WebMidi.MIDIAccess
import typingsJapgolly.webmidi.WebMidi.MIDIOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  /**
    * When invoked, returns a Promise object representing a request for access to MIDI
    * devices on the user's system.
    */
  def requestMIDIAccess(): js.Promise[MIDIAccess] = js.native
  def requestMIDIAccess(options: MIDIOptions): js.Promise[MIDIAccess] = js.native
}

