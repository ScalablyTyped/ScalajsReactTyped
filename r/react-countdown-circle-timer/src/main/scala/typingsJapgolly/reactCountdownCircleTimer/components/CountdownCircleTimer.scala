package typingsJapgolly.reactCountdownCircleTimer.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCountdownCircleTimer.mod.ColorType
import typingsJapgolly.reactCountdownCircleTimer.mod.Props
import typingsJapgolly.reactCountdownCircleTimer.mod.StrokeLinecapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountdownCircleTimer {
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
    trailColor: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, typingsJapgolly.reactCountdownCircleTimer.mod.CountdownCircleTimer, Unit, Props] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCountdownCircleTimer.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCountdownCircleTimer.mod.CountdownCircleTimer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCountdownCircleTimer.mod.Props])(children: _*)
  }
  @JSImport("react-countdown-circle-timer", "CountdownCircleTimer")
  @js.native
  object componentImport extends js.Object
  
}

