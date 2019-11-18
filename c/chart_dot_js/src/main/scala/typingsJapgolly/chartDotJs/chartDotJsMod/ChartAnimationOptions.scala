package typingsJapgolly.chartDotJs.chartDotJsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAnimationOptions extends js.Object {
  var animateRotate: js.UndefOr[Boolean] = js.undefined
  var animateScale: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[Easing] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.undefined
  var onProgress: js.UndefOr[js.Function1[/* chart */ js.Any, Unit]] = js.undefined
}

object ChartAnimationOptions {
  @scala.inline
  def apply(
    animateRotate: js.UndefOr[Boolean] = js.undefined,
    animateScale: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easing: Easing = null,
    onComplete: /* chart */ js.Any => Callback = null,
    onProgress: /* chart */ js.Any => Callback = null
  ): ChartAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animateRotate)) __obj.updateDynamic("animateRotate")(animateRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(animateScale)) __obj.updateDynamic("animateScale")(animateScale.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* chart */ js.Any) => onComplete(t0).runNow()))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1((t0: /* chart */ js.Any) => onProgress(t0).runNow()))
    __obj.asInstanceOf[ChartAnimationOptions]
  }
}

