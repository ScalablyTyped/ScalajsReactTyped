package typingsJapgolly.roarr.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterType extends js.Object {
  def write(message: String): Unit
}

object WriterType {
  @scala.inline
  def apply(write: String => Callback): WriterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.asInstanceOf[WriterType]
  }
}

