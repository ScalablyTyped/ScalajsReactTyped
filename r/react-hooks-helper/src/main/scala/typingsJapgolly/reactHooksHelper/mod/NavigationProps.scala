package typingsJapgolly.reactHooksHelper.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProps extends js.Object {
  var go: js.UndefOr[js.Function1[/* step */ Double | String, Unit]] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  var previous: js.UndefOr[js.Function0[Unit]] = js.undefined
  def next(): Unit
}

object NavigationProps {
  @scala.inline
  def apply(
    next: Callback,
    go: /* step */ Double | String => Callback = null,
    pause: js.UndefOr[Callback] = js.undefined,
    play: js.UndefOr[Callback] = js.undefined,
    previous: js.UndefOr[Callback] = js.undefined
  ): NavigationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(next.toJsFn)
    if (go != null) __obj.updateDynamic("go")(js.Any.fromFunction1((t0: /* step */ scala.Double | java.lang.String) => go(t0).runNow()))
    pause.foreach(p => __obj.updateDynamic("pause")(p.toJsFn))
    play.foreach(p => __obj.updateDynamic("play")(p.toJsFn))
    previous.foreach(p => __obj.updateDynamic("previous")(p.toJsFn))
    __obj.asInstanceOf[NavigationProps]
  }
}

