package typingsJapgolly.reactSwipeableViewsUtils.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactSwipeableViews.mod.OnChangeIndexCallback
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.decremental
import typingsJapgolly.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.incremental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithAutoPlayProps extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[incremental | decremental] = js.undefined
  var index: Double
  var interval: js.UndefOr[Double] = js.undefined
  var onChangeIndex: OnChangeIndexCallback
  var slideCount: js.UndefOr[Double] = js.undefined
}

object WithAutoPlayProps {
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    direction: incremental | decremental = null,
    interval: Int | Double = null,
    slideCount: Int | Double = null
  ): WithAutoPlayProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithAutoPlayProps]
  }
}

