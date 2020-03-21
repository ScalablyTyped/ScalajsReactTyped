package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonOriginalEventEventValue
import typingsJapgolly.primereact.sliderMod.SliderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  def apply(
    ariaLabelledBy: String = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* e */ AnonOriginalEventEventValue => Callback = null,
    onSlideEnd: /* e */ AnonOriginalEventEventValue => Callback = null,
    orientation: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Object = null,
    tabIndex: String = null,
    value: Double | (js.Tuple2[Double, Double]) = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, typingsJapgolly.primereact.primereactSliderMod.Slider, Unit, SliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEventEventValue) => onChange(t0).runNow()))
    if (onSlideEnd != null) __obj.updateDynamic("onSlideEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonOriginalEventEventValue) => onSlideEnd(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.sliderMod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactSliderMod.Slider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.sliderMod.SliderProps])(children: _*)
  }
  @JSImport("primereact/slider", "Slider")
  @js.native
  object componentImport extends js.Object
  
}

