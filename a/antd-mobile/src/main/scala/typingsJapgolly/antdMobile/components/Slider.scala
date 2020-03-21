package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.sliderMod.SliderProps
import typingsJapgolly.antdMobile.sliderMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  def apply(
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    handleStyle: CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: NumberDictionary[String] = null,
    max: Int | Double = null,
    maximumTrackStyle: CSSProperties = null,
    min: Int | Double = null,
    minimumTrackStyle: CSSProperties = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Callback = null,
    onChange: /* value */ js.UndefOr[Double] => Callback = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[String] => CallbackTo[Node] = null,
    trackStyle: CSSProperties = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SliderProps, default, Unit, SliderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maximumTrackStyle != null) __obj.updateDynamic("maximumTrackStyle")(maximumTrackStyle.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minimumTrackStyle != null) __obj.updateDynamic("minimumTrackStyle")(minimumTrackStyle.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onAfterChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => tipFormatter(t0).runNow()))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.sliderMod.SliderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.sliderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.sliderMod.SliderProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/slider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

