package typingsJapgolly.vuex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSubscribersObject[P, S] extends js.Object {
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
}

object ActionSubscribersObject {
  @scala.inline
  def apply[P, S](after: (P, S) => CallbackTo[js.Any] = null, before: (P, S) => CallbackTo[js.Any] = null): ActionSubscribersObject[P, S] = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction2((t0: P, t1: S) => after(t0, t1).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2((t0: P, t1: S) => before(t0, t1).runNow()))
    __obj.asInstanceOf[ActionSubscribersObject[P, S]]
  }
}

