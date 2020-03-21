package typingsJapgolly.dva.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionAPI extends js.Object {
  var dispatch: Dispatch[_]
  var history: History[LocationState]
}

object SubscriptionAPI {
  @scala.inline
  def apply(dispatch: js.Any => CallbackTo[js.Any], history: History[LocationState]): SubscriptionAPI = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: js.Any) => dispatch(t0).runNow()))
    __obj.asInstanceOf[SubscriptionAPI]
  }
}

