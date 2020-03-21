package typingsJapgolly.reactRadioGroup.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactRadioGroup.mod.Omit
import typingsJapgolly.reactRadioGroup.mod.RadioGroup.RadioGroupProps
import typingsJapgolly.reactRadioGroup.mod.RadioGroup.^
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.onChange
import typingsJapgolly.reactRadioGroup.reactRadioGroupStrings.role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[_] = null,
    ClassAttributes: ClassAttributes[_] = null,
    Component: ReactType[Omit[HTMLProps[_], onChange | role]] = null,
    onChange: /* value */ js.Any => Callback = null,
    selectedValue: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadioGroupProps, ^, Unit, RadioGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRadioGroup.mod.RadioGroup.RadioGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRadioGroup.mod.RadioGroup.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRadioGroup.mod.RadioGroup.RadioGroupProps])(children: _*)
  }
  @JSImport("react-radio-group", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
}

