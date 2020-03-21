package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a line of text that is displayed with a TimedTextCue . */
@JSGlobal("Windows.Media.Core.TimedTextLine")
@js.native
/** Initializes a new instance of the TimedTextLine class. */
class TimedTextLine () extends js.Object {
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  var subformats: IVector[TimedTextSubformat] = js.native
  /** Gets or sets the text content of the TimedTextLine . */
  var text: String = js.native
}

