package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamParams extends js.Object {
  def end(): js.Any
  def error(err: js.Error): js.Any
  def readable(): js.Any
}

object StreamParams {
  @scala.inline
  def apply(end: CallbackTo[js.Any], error: js.Error => CallbackTo[js.Any], readable: CallbackTo[js.Any]): StreamParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()))
    __obj.updateDynamic("readable")(readable.toJsFn)
    __obj.asInstanceOf[StreamParams]
  }
}

