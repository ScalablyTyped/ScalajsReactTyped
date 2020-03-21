package typingsJapgolly.logfmt.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableStream extends js.Object {
  def write(data: String): Unit
}

object WritableStream {
  @scala.inline
  def apply(write: String => Callback): WritableStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[WritableStream]
  }
}

