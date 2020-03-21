package typingsJapgolly.reactVirtualKeyboard.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactVirtualKeyboard.mod.KeyboardProps
import typingsJapgolly.reactVirtualKeyboard.mod.ReactKeyboardOptions
import typingsJapgolly.reactVirtualKeyboard.mod.default
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactVirtualKeyboard {
  def apply(
    callbackParent: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    name: String = null,
    onAccepted: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    onChange: (/* event */ js.UndefOr[String | Event_], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    options: ReactKeyboardOptions = null,
    placeholder: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[KeyboardProps, default, Unit, KeyboardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (callbackParent != null) __obj.updateDynamic("callbackParent")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => callbackParent(t0, t1, t2).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => onAccepted(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[java.lang.String | typingsJapgolly.std.Event_], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => onChange(t0, t1, t2).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualKeyboard.mod.KeyboardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualKeyboard.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualKeyboard.mod.KeyboardProps])(children: _*)
  }
  @JSImport("react-virtual-keyboard", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

