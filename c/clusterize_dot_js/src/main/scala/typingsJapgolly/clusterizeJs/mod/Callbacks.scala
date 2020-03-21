package typingsJapgolly.clusterizeJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  var clusterChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var clusterWillChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var scrollingProgress: js.UndefOr[js.Function1[/* progress */ Double, Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    clusterChanged: js.UndefOr[Callback] = js.undefined,
    clusterWillChange: js.UndefOr[Callback] = js.undefined,
    scrollingProgress: /* progress */ Double => Callback = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    clusterChanged.foreach(p => __obj.updateDynamic("clusterChanged")(p.toJsFn))
    clusterWillChange.foreach(p => __obj.updateDynamic("clusterWillChange")(p.toJsFn))
    if (scrollingProgress != null) __obj.updateDynamic("scrollingProgress")(js.Any.fromFunction1((t0: /* progress */ scala.Double) => scrollingProgress(t0).runNow()))
    __obj.asInstanceOf[Callbacks]
  }
}

