package typingsJapgolly.reactNativeMultiSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeMultiSlider.AnonBorderRadius
import typingsJapgolly.reactNativeMultiSlider.mod.MarkerProps
import typingsJapgolly.reactNativeMultiSlider.mod.MultiSliderProps
import typingsJapgolly.reactNativeMultiSlider.mod.default
import typingsJapgolly.reactNativeMultiSlider.reactNativeMultiSliderStrings.horizontal
import typingsJapgolly.reactNativeMultiSlider.reactNativeMultiSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMultiSlider {
  def apply(
    containerStyle: ViewStyle = null,
    customMarker: ComponentType[MarkerProps] = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onValuesChange: /* change */ js.Array[Double] => Callback = null,
    onValuesChangeFinish: /* change */ js.Array[Double] => Callback = null,
    onValuesChangeStart: js.UndefOr[Callback] = js.undefined,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    sliderOrientation: horizontal | vertical = null,
    step: Int | Double = null,
    touchDimensions: AnonBorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    values: js.Array[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MultiSliderProps, default, Unit, MultiSliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1((t0: /* change */ js.Array[scala.Double]) => onValuesChange(t0).runNow()))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1((t0: /* change */ js.Array[scala.Double]) => onValuesChangeFinish(t0).runNow()))
    onValuesChangeStart.foreach(p => __obj.updateDynamic("onValuesChangeStart")(p.toJsFn))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (sliderOrientation != null) __obj.updateDynamic("sliderOrientation")(sliderOrientation.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMultiSlider.mod.MultiSliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMultiSlider.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMultiSlider.mod.MultiSliderProps])(children: _*)
  }
  @JSImport("react-native-multi-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

