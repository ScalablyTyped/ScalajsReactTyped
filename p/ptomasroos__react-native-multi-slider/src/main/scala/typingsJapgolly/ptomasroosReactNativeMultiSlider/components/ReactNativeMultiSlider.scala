package typingsJapgolly.ptomasroosReactNativeMultiSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ptomasroosReactNativeMultiSlider.AnonBorderRadius
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MarkerProps
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MultiSliderProps
import typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.default
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeMultiSlider {
  def apply(
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    containerStyle: ViewStyle = null,
    customMarker: ComponentType[MarkerProps] = null,
    customMarkerLeft: ComponentType[MarkerProps] = null,
    customMarkerRight: ComponentType[MarkerProps] = null,
    enabledOne: js.UndefOr[Boolean] = js.undefined,
    enabledTwo: js.UndefOr[Boolean] = js.undefined,
    isMarkersSeparated: js.UndefOr[Boolean] = js.undefined,
    markerContainerStyle: ViewStyle = null,
    markerOffsetX: Int | Double = null,
    markerOffsetY: Int | Double = null,
    markerStyle: ViewStyle = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onToggleOne: js.UndefOr[Callback] = js.undefined,
    onToggleTwo: js.UndefOr[Callback] = js.undefined,
    onValuesChange: /* values */ js.Array[Double] => Callback = null,
    onValuesChangeFinish: /* values */ js.Array[Double] => Callback = null,
    onValuesChangeStart: js.UndefOr[Callback] = js.undefined,
    optionsArray: js.Array[Double] = null,
    pressedMarkerStyle: ViewStyle = null,
    selectedStyle: ViewStyle = null,
    sliderLength: Int | Double = null,
    snapped: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    touchDimensions: AnonBorderRadius = null,
    trackStyle: ViewStyle = null,
    unselectedStyle: ViewStyle = null,
    valuePrefix: String = null,
    valueSuffix: String = null,
    values: js.Array[Double] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MultiSliderProps, default, Unit, MultiSliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (customMarker != null) __obj.updateDynamic("customMarker")(customMarker.asInstanceOf[js.Any])
    if (customMarkerLeft != null) __obj.updateDynamic("customMarkerLeft")(customMarkerLeft.asInstanceOf[js.Any])
    if (customMarkerRight != null) __obj.updateDynamic("customMarkerRight")(customMarkerRight.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledOne)) __obj.updateDynamic("enabledOne")(enabledOne.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledTwo)) __obj.updateDynamic("enabledTwo")(enabledTwo.asInstanceOf[js.Any])
    if (!js.isUndefined(isMarkersSeparated)) __obj.updateDynamic("isMarkersSeparated")(isMarkersSeparated.asInstanceOf[js.Any])
    if (markerContainerStyle != null) __obj.updateDynamic("markerContainerStyle")(markerContainerStyle.asInstanceOf[js.Any])
    if (markerOffsetX != null) __obj.updateDynamic("markerOffsetX")(markerOffsetX.asInstanceOf[js.Any])
    if (markerOffsetY != null) __obj.updateDynamic("markerOffsetY")(markerOffsetY.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    onToggleOne.foreach(p => __obj.updateDynamic("onToggleOne")(p.toJsFn))
    onToggleTwo.foreach(p => __obj.updateDynamic("onToggleTwo")(p.toJsFn))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onValuesChange(t0).runNow()))
    if (onValuesChangeFinish != null) __obj.updateDynamic("onValuesChangeFinish")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onValuesChangeFinish(t0).runNow()))
    onValuesChangeStart.foreach(p => __obj.updateDynamic("onValuesChangeStart")(p.toJsFn))
    if (optionsArray != null) __obj.updateDynamic("optionsArray")(optionsArray.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle.asInstanceOf[js.Any])
    if (sliderLength != null) __obj.updateDynamic("sliderLength")(sliderLength.asInstanceOf[js.Any])
    if (!js.isUndefined(snapped)) __obj.updateDynamic("snapped")(snapped.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (touchDimensions != null) __obj.updateDynamic("touchDimensions")(touchDimensions.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (unselectedStyle != null) __obj.updateDynamic("unselectedStyle")(unselectedStyle.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix.asInstanceOf[js.Any])
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MultiSliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.ptomasroosReactNativeMultiSlider.mod.MultiSliderProps])(children: _*)
  }
  @JSImport("@ptomasroos/react-native-multi-slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

