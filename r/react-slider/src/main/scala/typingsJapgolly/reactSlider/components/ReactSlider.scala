package typingsJapgolly.reactSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSlider.AnonIndex
import typingsJapgolly.reactSlider.AnonValue
import typingsJapgolly.reactSlider.mod.ReactSliderProps
import typingsJapgolly.reactSlider.mod.^
import typingsJapgolly.reactSlider.reactSliderStrings.horizontal
import typingsJapgolly.reactSlider.reactSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSlider {
  def apply(
    ariaLabel: String | js.Array[String] = null,
    ariaValuetext: String | (js.Function1[/* value */ AnonIndex, String]) = null,
    className: String = null,
    defaultValue: Double | js.Array[Double] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    min: Int | Double = null,
    minDistance: Int | Double = null,
    onAfterChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Callback = null,
    onBeforeChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Callback = null,
    onChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Callback = null,
    onSliderClick: /* value */ Double => Callback = null,
    orientation: horizontal | vertical = null,
    pageFn: /* step */ Double => CallbackTo[Double] = null,
    pearling: js.UndefOr[Boolean] = js.undefined,
    renderThumb: (/* props */ js.Object, /* state */ AnonIndex) => CallbackTo[Element] = null,
    renderTrack: (/* props */ js.Object, /* state */ AnonValue) => CallbackTo[Element] = null,
    snapDragDisabled: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    thumbActiveClassName: String = null,
    thumbClassName: String = null,
    trackClassName: String = null,
    value: Double | js.Array[Double] = null,
    withTracks: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactSliderProps, ^, Unit, ReactSliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValuetext != null) __obj.updateDynamic("ariaValuetext")(ariaValuetext.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minDistance != null) __obj.updateDynamic("minDistance")(minDistance.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null]) => onAfterChange(t0).runNow()))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null]) => onBeforeChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null]) => onChange(t0).runNow()))
    if (onSliderClick != null) __obj.updateDynamic("onSliderClick")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onSliderClick(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageFn != null) __obj.updateDynamic("pageFn")(js.Any.fromFunction1((t0: /* step */ scala.Double) => pageFn(t0).runNow()))
    if (!js.isUndefined(pearling)) __obj.updateDynamic("pearling")(pearling.asInstanceOf[js.Any])
    if (renderThumb != null) __obj.updateDynamic("renderThumb")(js.Any.fromFunction2((t0: /* props */ js.Object, t1: /* state */ typingsJapgolly.reactSlider.AnonIndex) => renderThumb(t0, t1).runNow()))
    if (renderTrack != null) __obj.updateDynamic("renderTrack")(js.Any.fromFunction2((t0: /* props */ js.Object, t1: /* state */ typingsJapgolly.reactSlider.AnonValue) => renderTrack(t0, t1).runNow()))
    if (!js.isUndefined(snapDragDisabled)) __obj.updateDynamic("snapDragDisabled")(snapDragDisabled.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (thumbActiveClassName != null) __obj.updateDynamic("thumbActiveClassName")(thumbActiveClassName.asInstanceOf[js.Any])
    if (thumbClassName != null) __obj.updateDynamic("thumbClassName")(thumbClassName.asInstanceOf[js.Any])
    if (trackClassName != null) __obj.updateDynamic("trackClassName")(trackClassName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(withTracks)) __obj.updateDynamic("withTracks")(withTracks.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSlider.mod.ReactSliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSlider.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSlider.mod.ReactSliderProps])(children: _*)
  }
  @JSImport("react-slider", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

