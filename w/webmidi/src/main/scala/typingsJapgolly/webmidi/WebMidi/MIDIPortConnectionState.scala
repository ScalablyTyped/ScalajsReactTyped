package typingsJapgolly.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webmidi.webmidiStrings.open
  - typingsJapgolly.webmidi.webmidiStrings.closed
  - typingsJapgolly.webmidi.webmidiStrings.pending
*/
trait MIDIPortConnectionState extends js.Object

object MIDIPortConnectionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typingsJapgolly.webmidi.webmidiStrings.closed = this.cast("closed")
  @scala.inline
  def open: typingsJapgolly.webmidi.webmidiStrings.open = this.cast("open")
  @scala.inline
  def pending: typingsJapgolly.webmidi.webmidiStrings.pending = this.cast("pending")
}

