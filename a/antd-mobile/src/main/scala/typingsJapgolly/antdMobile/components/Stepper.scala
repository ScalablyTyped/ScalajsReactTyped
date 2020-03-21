package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.stepperMod.StepProps
import typingsJapgolly.antdMobile.stepperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stepper {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downStyle: js.Object = null,
    inputStyle: js.Object = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onChange: /* value */ js.Any => Callback = null,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    showNumber: js.UndefOr[Boolean] = js.undefined,
    step: Double | String = null,
    upStyle: js.Object = null,
    value: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepProps, default, Unit, StepProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (downStyle != null) __obj.updateDynamic("downStyle")(downStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (upStyle != null) __obj.updateDynamic("upStyle")(upStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.stepperMod.StepProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.stepperMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.stepperMod.StepProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/stepper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

