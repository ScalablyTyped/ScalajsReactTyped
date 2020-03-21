package typingsJapgolly.webmidi.WebMidi

import typingsJapgolly.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIMessageEventInit extends EventInit {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: scala.scalajs.js.typedarray.Uint8Array
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double
}

object MIDIMessageEventInit {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.Uint8Array,
    receivedTime: Double,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedTime = receivedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
}

