package typingsJapgolly.ledgerhqHwTransport.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[Ev] extends js.Object {
  def complete(): js.Any
  def error(e: js.Any): js.Any
  def next(event: Ev): js.Any
}

object Observer {
  @scala.inline
  def apply[Ev](complete: CallbackTo[js.Any], error: js.Any => CallbackTo[js.Any], next: Ev => CallbackTo[js.Any]): Observer[Ev] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: Ev) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[Ev]]
  }
}

