package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  val location: HistoryLocation
  var navigate: NavigateFn
  val transitioning: Boolean
  def listen(listener: HistoryListener): HistoryUnsubscribe
}

object History {
  @scala.inline
  def apply(
    listen: HistoryListener => CallbackTo[HistoryUnsubscribe],
    location: HistoryLocation,
    navigate: NavigateFn,
    transitioning: Boolean
  ): History = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], transitioning = transitioning.asInstanceOf[js.Any])
    __obj.updateDynamic("listen")(js.Any.fromFunction1((t0: typingsJapgolly.reachRouter.mod.HistoryListener) => listen(t0).runNow()))
    __obj.asInstanceOf[History]
  }
}

