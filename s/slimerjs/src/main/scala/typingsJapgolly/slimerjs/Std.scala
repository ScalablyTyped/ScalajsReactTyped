package typingsJapgolly.slimerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Std extends js.Object {
  def read(): js.Any
  def write(arg: js.Any): Unit
}

object Std {
  @scala.inline
  def apply(read: CallbackTo[js.Any], write: js.Any => Callback): Std = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: js.Any) => write(t0).runNow()))
    __obj.asInstanceOf[Std]
  }
}

