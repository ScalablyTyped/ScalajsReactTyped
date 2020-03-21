package typingsJapgolly.mapsjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mapsjs.mod.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownAction extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ point, _]] = js.undefined
  var dragEnabled: Boolean
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ point, Unit]] = js.undefined
  var upAction: js.UndefOr[js.Function1[/* upPoint */ point, Unit]] = js.undefined
  var useElementInsteadOfNewGestureOverlay: Boolean
  var wheelAction: js.UndefOr[js.Function1[/* delta */ Double, Unit]] = js.undefined
}

object AnonDownAction {
  @scala.inline
  def apply(
    dragEnabled: Boolean,
    useElementInsteadOfNewGestureOverlay: Boolean,
    downAction: /* downPoint */ point => CallbackTo[js.Any] = null,
    moveAction: /* movePoint */ point => Callback = null,
    upAction: /* upPoint */ point => Callback = null,
    wheelAction: /* delta */ Double => Callback = null
  ): AnonDownAction = {
    val __obj = js.Dynamic.literal(dragEnabled = dragEnabled.asInstanceOf[js.Any], useElementInsteadOfNewGestureOverlay = useElementInsteadOfNewGestureOverlay.asInstanceOf[js.Any])
    if (downAction != null) __obj.updateDynamic("downAction")(js.Any.fromFunction1((t0: /* downPoint */ typingsJapgolly.mapsjs.mod.point) => downAction(t0).runNow()))
    if (moveAction != null) __obj.updateDynamic("moveAction")(js.Any.fromFunction1((t0: /* movePoint */ typingsJapgolly.mapsjs.mod.point) => moveAction(t0).runNow()))
    if (upAction != null) __obj.updateDynamic("upAction")(js.Any.fromFunction1((t0: /* upPoint */ typingsJapgolly.mapsjs.mod.point) => upAction(t0).runNow()))
    if (wheelAction != null) __obj.updateDynamic("wheelAction")(js.Any.fromFunction1((t0: /* delta */ scala.Double) => wheelAction(t0).runNow()))
    __obj.asInstanceOf[AnonDownAction]
  }
}

