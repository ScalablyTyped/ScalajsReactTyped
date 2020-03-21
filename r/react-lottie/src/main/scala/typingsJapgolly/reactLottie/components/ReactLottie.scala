package typingsJapgolly.reactLottie.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLottie.mod.EventListener
import typingsJapgolly.reactLottie.mod.LottieProps
import typingsJapgolly.reactLottie.mod.Options
import typingsJapgolly.reactLottie.mod.default
import typingsJapgolly.reactLottie.reactLottieStrings.animation
import typingsJapgolly.reactLottie.reactLottieStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLottie {
  def apply(
    options: Options,
    ariaLabel: String | animation = null,
    ariaRole: String | button = null,
    direction: Int | Double = null,
    eventListeners: js.Array[EventListener] = null,
    height: Double | String = null,
    isClickToPauseDisabled: js.UndefOr[Boolean] = js.undefined,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    isStopped: js.UndefOr[Boolean] = js.undefined,
    segments: js.Array[Double] = null,
    speed: Int | Double = null,
    title: String = null,
    width: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LottieProps, default, Unit, LottieProps] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (eventListeners != null) __obj.updateDynamic("eventListeners")(eventListeners.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickToPauseDisabled)) __obj.updateDynamic("isClickToPauseDisabled")(isClickToPauseDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopped)) __obj.updateDynamic("isStopped")(isStopped.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLottie.mod.LottieProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLottie.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLottie.mod.LottieProps])(children: _*)
  }
  @JSImport("react-lottie", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

