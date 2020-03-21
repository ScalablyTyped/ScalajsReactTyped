package typingsJapgolly.ngxInfiniteScroll.eventTriggerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerEvents extends js.Object {
  def down(event: js.Any): js.Any
  def up(event: js.Any): js.Any
}

object ITriggerEvents {
  @scala.inline
  def apply(down: js.Any => CallbackTo[js.Any], up: js.Any => CallbackTo[js.Any]): ITriggerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("down")(js.Any.fromFunction1((t0: js.Any) => down(t0).runNow()))
    __obj.updateDynamic("up")(js.Any.fromFunction1((t0: js.Any) => up(t0).runNow()))
    __obj.asInstanceOf[ITriggerEvents]
  }
}

