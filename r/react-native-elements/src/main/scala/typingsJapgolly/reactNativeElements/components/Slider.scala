package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.SpringAnimationConfig
import typingsJapgolly.reactNative.mod.Animated.TimingAnimationConfig
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.AnonHeight
import typingsJapgolly.reactNativeElements.mod.SliderProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.horizontal
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.spring
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.timing
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  def apply(
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    animationConfig: TimingAnimationConfig | SpringAnimationConfig = null,
    animationType: spring | timing = null,
    debugTouchArea: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maximumTrackTintColor: String = null,
    maximumValue: Int | Double = null,
    minimumTrackTintColor: String = null,
    minimumValue: Int | Double = null,
    onSlidingComplete: /* value */ Double => Callback = null,
    onSlidingStart: /* value */ Double => Callback = null,
    onValueChange: /* value */ Double => Callback = null,
    orientation: horizontal | vertical = null,
    step: Int | Double = null,
    style: StyleProp[ViewStyle] = null,
    thumbStyle: StyleProp[ViewStyle] = null,
    thumbTintColor: String = null,
    thumbTouchSize: AnonHeight = null,
    trackStyle: StyleProp[ViewStyle] = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, typingsJapgolly.reactNativeElements.mod.Slider, Unit, SliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (animationConfig != null) __obj.updateDynamic("animationConfig")(animationConfig.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (!js.isUndefined(debugTouchArea)) __obj.updateDynamic("debugTouchArea")(debugTouchArea.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (onSlidingComplete != null) __obj.updateDynamic("onSlidingComplete")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onSlidingComplete(t0).runNow()))
    if (onSlidingStart != null) __obj.updateDynamic("onSlidingStart")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onSlidingStart(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onValueChange(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (thumbTintColor != null) __obj.updateDynamic("thumbTintColor")(thumbTintColor.asInstanceOf[js.Any])
    if (thumbTouchSize != null) __obj.updateDynamic("thumbTouchSize")(thumbTouchSize.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.Slider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.SliderProps])(children: _*)
  }
  @JSImport("react-native-elements", "Slider")
  @js.native
  object componentImport extends js.Object
  
}

