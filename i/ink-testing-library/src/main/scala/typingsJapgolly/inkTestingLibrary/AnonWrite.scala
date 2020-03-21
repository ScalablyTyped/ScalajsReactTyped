package typingsJapgolly.inkTestingLibrary

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrite extends js.Object {
  def write(data: js.Any): Boolean
}

object AnonWrite {
  @scala.inline
  def apply(write: js.Any => CallbackTo[Boolean]): AnonWrite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Any) => write(t0).runNow()))
    __obj.asInstanceOf[AnonWrite]
  }
}

