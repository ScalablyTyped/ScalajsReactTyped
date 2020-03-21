package typingsJapgolly.reactCountdownCircleTimer.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var colors: ColorType
  var durationSeconds: Double
  var gradientUniqueKey: js.UndefOr[String] = js.undefined
  var isLinearGradient: js.UndefOr[Boolean] = js.undefined
  var isPlaying: js.UndefOr[Boolean] = js.undefined
  var onComplete: js.UndefOr[OnCompleteFunctionType] = js.undefined
  var renderTime: js.UndefOr[RenderTimeFunctionType] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecapType] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
  var trailColor: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    colors: ColorType,
    durationSeconds: Double,
    gradientUniqueKey: String = null,
    isLinearGradient: js.UndefOr[Boolean] = js.undefined,
    isPlaying: js.UndefOr[Boolean] = js.undefined,
    onComplete: js.UndefOr[CallbackTo[js.UndefOr[(js.Tuple2[Boolean, Double]) | Unit]]] = js.undefined,
    renderTime: (/* remainingTime */ Double, /* elapsedTime */ Double, /* isPlaying */ Boolean) => CallbackTo[Node] = null,
    size: Int | Double = null,
    strokeLinecap: StrokeLinecapType = null,
    strokeWidth: Int | Double = null,
    trailColor: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], durationSeconds = durationSeconds.asInstanceOf[js.Any])
    if (gradientUniqueKey != null) __obj.updateDynamic("gradientUniqueKey")(gradientUniqueKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isLinearGradient)) __obj.updateDynamic("isLinearGradient")(isLinearGradient.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlaying)) __obj.updateDynamic("isPlaying")(isPlaying.asInstanceOf[js.Any])
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (renderTime != null) __obj.updateDynamic("renderTime")(js.Any.fromFunction3((t0: /* remainingTime */ scala.Double, t1: /* elapsedTime */ scala.Double, t2: /* isPlaying */ scala.Boolean) => renderTime(t0, t1, t2).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (trailColor != null) __obj.updateDynamic("trailColor")(trailColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

