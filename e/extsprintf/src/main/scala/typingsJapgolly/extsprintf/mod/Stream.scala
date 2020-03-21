package typingsJapgolly.extsprintf.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def write(str: String): Unit
}

object Stream {
  @scala.inline
  def apply(write: String => Callback): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[Stream]
  }
}

