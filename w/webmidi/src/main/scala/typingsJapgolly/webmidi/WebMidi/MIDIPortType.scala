package typingsJapgolly.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webmidi.webmidiStrings.input
  - typingsJapgolly.webmidi.webmidiStrings.output
*/
trait MIDIPortType extends js.Object

object MIDIPortType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def input: typingsJapgolly.webmidi.webmidiStrings.input = this.cast("input")
  @scala.inline
  def output: typingsJapgolly.webmidi.webmidiStrings.output = this.cast("output")
}

