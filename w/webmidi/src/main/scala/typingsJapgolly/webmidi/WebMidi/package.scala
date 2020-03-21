package typingsJapgolly.webmidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebMidi {
  /**
    * This is a maplike interface whose value is a MIDIInput instance and key is its
    * ID.
    */
  type MIDIInputMap = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.webmidi.WebMidi.MIDIInput]
  /**
    * This is a maplike interface whose value is a MIDIOutput instance and key is its
    * ID.
    */
  type MIDIOutputMap = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.webmidi.WebMidi.MIDIOutput]
}
