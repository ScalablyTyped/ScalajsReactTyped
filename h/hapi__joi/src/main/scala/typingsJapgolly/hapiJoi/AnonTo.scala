package typingsJapgolly.hapiJoi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiJoi.mod.CustomHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTo extends js.Object {
  def from(value: js.Any): js.Any
  def to(value: js.Any, helpers: CustomHelpers[_]): js.Any
}

object AnonTo {
  @scala.inline
  def apply(from: js.Any => CallbackTo[js.Any], to: (js.Any, CustomHelpers[js.Any]) => CallbackTo[js.Any]): AnonTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: js.Any) => from(t0).runNow()))
    __obj.updateDynamic("to")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.hapiJoi.mod.CustomHelpers[js.Any]) => to(t0, t1).runNow()))
    __obj.asInstanceOf[AnonTo]
  }
}

