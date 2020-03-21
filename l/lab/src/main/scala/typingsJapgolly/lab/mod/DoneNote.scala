package typingsJapgolly.lab.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneNote extends js.Object {
  /** Attach a note to the test case */
  def note(text: String): Unit
}

object DoneNote {
  @scala.inline
  def apply(note: String => Callback): DoneNote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("note")(js.Any.fromFunction1((t0: java.lang.String) => note(t0).runNow()))
    __obj.asInstanceOf[DoneNote]
  }
}

