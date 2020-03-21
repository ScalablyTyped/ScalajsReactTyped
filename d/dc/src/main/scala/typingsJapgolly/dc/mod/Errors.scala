package typingsJapgolly.dc.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  def BadArgumentException(): Unit
  def Exception(msg: String): Unit
  def InvalidStateException(): Unit
}

object Errors {
  @scala.inline
  def apply(BadArgumentException: Callback, Exception: String => Callback, InvalidStateException: Callback): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BadArgumentException")(BadArgumentException.toJsFn)
    __obj.updateDynamic("Exception")(js.Any.fromFunction1((t0: java.lang.String) => Exception(t0).runNow()))
    __obj.updateDynamic("InvalidStateException")(InvalidStateException.toJsFn)
    __obj.asInstanceOf[Errors]
  }
}

