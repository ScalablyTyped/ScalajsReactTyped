package typingsJapgolly.atMaterialDashUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSelectElement
import typingsJapgolly.atMaterialDashUiCore.Anon_NodeValue
import typingsJapgolly.atMaterialDashUiCore.PartialMenuProps
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.filled
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.outlined
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.standard
import typingsJapgolly.atMaterialDashUiCore.selectSelectInputMod.SelectInputProps
import typingsJapgolly.atMaterialDashUiCore.selectSelectInputMod.default
import typingsJapgolly.react.reactMod.HTMLAttributes
import typingsJapgolly.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectInput {
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean]),
    IconComponent: ReactType[_] = null,
    MenuProps: PartialMenuProps = null,
    SelectDisplayProps: HTMLAttributes[HTMLDivElement] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | Anon_NodeValue => Callback = null,
    name: String = null,
    onBlur: ReactFocusEventFrom[js.Any with Element] => Callback = null,
    onChange: (/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node) => Callback = null,
    onClose: /* event */ ReactEventFrom[js.Object with Element] => Callback = null,
    onFocus: ReactFocusEventFrom[js.Any with Element] => Callback = null,
    onOpen: /* event */ ReactEventFrom[js.Object with Element] => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderValue: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => CallbackTo[Node] = null,
    tabIndex: Int | Double = null,
    variant: standard | outlined | filled = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectInputProps, default, Unit, SelectInputProps] = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (MenuProps != null) __obj.updateDynamic("MenuProps")(MenuProps.asInstanceOf[js.Any])
    if (SelectDisplayProps != null) __obj.updateDynamic("SelectDisplayProps")(SelectDisplayProps.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLSelectElement | typingsJapgolly.atMaterialDashUiCore.Anon_NodeValue) => inputRef(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLSelectElement], t1: /* child */ japgolly.scalajs.react.raw.React.Node) => onChange(t0, t1).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClose(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Any with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onOpen(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderValue != null) __obj.updateDynamic("renderValue")(js.Any.fromFunction1((t0: /* value */ java.lang.String | scala.Double | scala.Boolean | (js.Array[java.lang.String | scala.Double | scala.Boolean])) => renderValue(t0).runNow()))
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atMaterialDashUiCore.selectSelectInputMod.SelectInputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atMaterialDashUiCore.selectSelectInputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atMaterialDashUiCore.selectSelectInputMod.SelectInputProps])(children: _*)
  }
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

