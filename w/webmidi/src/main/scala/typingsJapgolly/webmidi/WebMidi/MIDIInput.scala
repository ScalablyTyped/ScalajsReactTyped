package typingsJapgolly.webmidi.WebMidi

import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.webmidi.webmidiStrings.input
import typingsJapgolly.webmidi.webmidiStrings.midimessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIInput extends MIDIPort {
  @JSName("type")
  var type_MIDIInput: input = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(`type`: midimessage, listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* e */ MIDIMessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def onmidimessage(e: MIDIMessageEvent): Unit = js.native
}

