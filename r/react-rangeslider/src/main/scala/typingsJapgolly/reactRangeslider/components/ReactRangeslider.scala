package typingsJapgolly.reactRangeslider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRangeslider.mod.SliderProps
import typingsJapgolly.reactRangeslider.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactRangeslider {
  def apply(
    value: Double,
    disabled: js.UndefOr[Boolean] = js.undefined,
    format: /* value */ Double => CallbackTo[js.UndefOr[String | Double]] = null,
    handleLabel: String = null,
    labels: NumberDictionary[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Callback = null,
    onChangeComplete: /* value */ Double => Callback = null,
    onChangeStart: /* value */ Double => Callback = null,
    orientation: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    tooltip: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, default, Unit, SliderProps] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* value */ scala.Double) => format(t0).runNow()))
    if (handleLabel != null) __obj.updateDynamic("handleLabel")(handleLabel.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
    if (onChangeComplete != null) __obj.updateDynamic("onChangeComplete")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChangeComplete(t0).runNow()))
    if (onChangeStart != null) __obj.updateDynamic("onChangeStart")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChangeStart(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRangeslider.mod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRangeslider.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRangeslider.mod.SliderProps])(children: _*)
  }
  @JSImport("react-rangeslider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

