package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLSelectElement
import typingsJapgolly.atMaterialDashUiCore.Anon_Node
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.NativeSelectInputProps
import typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default
import typingsJapgolly.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeSelectInput {
  def apply(
    IconComponent: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | Anon_Node => Callback = null,
    name: String = null,
    onChange: (/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node) => Callback = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard | outlined | filled = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NativeSelectInputProps, default, Unit, NativeSelectInputProps] = {
    val __obj = js.Dynamic.literal()
  
      if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLSelectElement | typingsJapgolly.atMaterialDashUiCore.Anon_Node) => inputRef(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLSelectElement], t1: /* child */ japgolly.scalajs.react.raw.React.Node) => onChange(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.NativeSelectInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default](js.constructorOf[typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.nativeSelectNativeSelectInputMod.NativeSelectInputProps])(children: _*)
  }
}

