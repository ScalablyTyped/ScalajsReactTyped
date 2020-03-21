package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.inputMod.HTMLInputProps
import typingsJapgolly.antdMobile.inputMod.InputProps
import typingsJapgolly.antdMobile.inputMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Input {
  def apply(
    HTMLInputProps: HTMLInputProps = null,
    onBlur: /* value */ js.UndefOr[String] => Callback = null,
    onFocus: /* value */ js.UndefOr[String] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InputProps, default, Unit, InputProps] = {
    val __obj = js.Dynamic.literal()
  
      if (HTMLInputProps != null) js.Dynamic.global.Object.assign(__obj, HTMLInputProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => onFocus(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.inputMod.InputProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.inputMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.inputMod.InputProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/input-item/Input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

