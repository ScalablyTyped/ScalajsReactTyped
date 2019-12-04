package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libSliderMod.SliderMarks
import typingsJapgolly.antd.libSliderMod.SliderProps
import typingsJapgolly.antd.libSliderMod.SliderValue
import typingsJapgolly.antd.libSliderMod.default
import typingsJapgolly.antd.libTooltipMod.TooltipPlacement
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  def apply(
    className: String = null,
    defaultValue: SliderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    getTooltipPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    id: String = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: SliderMarks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ SliderValue => Callback = null,
    onChange: /* value */ SliderValue => Callback = null,
    prefixCls: String = null,
    range: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: CSSProperties = null,
    tipFormatter: /* value */ Double => CallbackTo[Node] = null,
    tooltipPlacement: TooltipPlacement = null,
    tooltipPrefixCls: String = null,
    tooltipVisible: js.UndefOr[Boolean] = js.undefined,
    value: SliderValue = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, default, Unit, SliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (getTooltipPopupContainer != null) __obj.updateDynamic("getTooltipPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getTooltipPopupContainer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.antd.libSliderMod.SliderValue) => onAfterChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.antd.libSliderMod.SliderValue) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ scala.Double) => tipFormatter(t0).runNow()))
    if (tooltipPlacement != null) __obj.updateDynamic("tooltipPlacement")(tooltipPlacement.asInstanceOf[js.Any])
    if (tooltipPrefixCls != null) __obj.updateDynamic("tooltipPrefixCls")(tooltipPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipVisible)) __obj.updateDynamic("tooltipVisible")(tooltipVisible.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libSliderMod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libSliderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libSliderMod.SliderProps])(children: _*)
  }
  @JSImport("antd/lib/slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

