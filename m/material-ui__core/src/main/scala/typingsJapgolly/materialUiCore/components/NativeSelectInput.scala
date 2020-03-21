package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLSelectElement
import typingsJapgolly.materialUiCore.AnonNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.materialUiCore.nativeSelectInputMod.NativeSelectInputProps
import typingsJapgolly.materialUiCore.nativeSelectInputMod.default
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NativeSelectInput {
  def apply(
    IconComponent: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | AnonNode => Callback = null,
    name: String = null,
    onChange: (/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node) => Callback = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard | outlined | filled = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NativeSelectInputProps, default, Unit, NativeSelectInputProps] = {
    val __obj = js.Dynamic.literal()
  
      if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLSelectElement | typingsJapgolly.materialUiCore.AnonNode) => inputRef(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLSelectElement], t1: /* child */ japgolly.scalajs.react.raw.React.Node) => onChange(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.nativeSelectInputMod.NativeSelectInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.nativeSelectInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.nativeSelectInputMod.NativeSelectInputProps])(children: _*)
  }
  @JSImport("@material-ui/core/NativeSelect/NativeSelectInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

