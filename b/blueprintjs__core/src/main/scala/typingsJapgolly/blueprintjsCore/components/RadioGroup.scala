package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsCore.propsMod.IOptionProps
import typingsJapgolly.blueprintjsCore.radioGroupMod.IRadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioGroup {
  def apply(
    onChange: ReactEventFrom[HTMLInputElement] => Callback,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    options: js.Array[IOptionProps] = null,
    selectedValue: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IRadioGroupProps, 
    typingsJapgolly.blueprintjsCore.mod.RadioGroup, 
    Unit, 
    IRadioGroupProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.radioGroupMod.IRadioGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.RadioGroup](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.radioGroupMod.IRadioGroupProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "RadioGroup")
  @js.native
  object componentImport extends js.Object
  
}

