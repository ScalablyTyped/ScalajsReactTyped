package typingsJapgolly.reactMove.animateMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactMove.mod.GetInterpolator
import typingsJapgolly.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimateProps extends js.Object {
  var enter: js.UndefOr[js.Any] = js.undefined
  var interpolation: js.UndefOr[GetInterpolator] = js.undefined
  var leave: js.UndefOr[js.Any] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var start: js.Any
  var update: js.UndefOr[js.Any] = js.undefined
  def children(state: HashMap): Element
}

object IAnimateProps {
  @scala.inline
  def apply(
    children: HashMap => CallbackTo[Element],
    start: js.Any,
    enter: js.Any = null,
    interpolation: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => CallbackTo[js.Function1[/* t */ Double, js.Any]] = null,
    leave: js.Any = null,
    show: js.UndefOr[Boolean] = js.undefined,
    update: js.Any = null
  ): IAnimateProps = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactMove.mod.HashMap) => children(t0).runNow()))
    if (enter != null) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(js.Any.fromFunction4((t0: /* begValue */ js.UndefOr[js.Any], t1: /* endValue */ js.UndefOr[js.Any], t2: /* attr */ js.UndefOr[java.lang.String], t3: /* namespace */ js.UndefOr[java.lang.String]) => interpolation(t0, t1, t2, t3).runNow()))
    if (leave != null) __obj.updateDynamic("leave")(leave.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimateProps]
  }
}

