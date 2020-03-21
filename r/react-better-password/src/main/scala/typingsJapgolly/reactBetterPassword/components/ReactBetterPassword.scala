package typingsJapgolly.reactBetterPassword.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBetterPassword.mod.PasswordProps
import typingsJapgolly.reactBetterPassword.mod.default
import typingsJapgolly.reactBetterPassword.reactBetterPasswordStrings.Bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBetterPassword {
  def apply(
    className: String = null,
    mask: Bullet | String = null,
    onChange: /* value */ String => Callback = null,
    placeholder: String = null,
    show: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PasswordProps, default, Unit, PasswordProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBetterPassword.mod.PasswordProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBetterPassword.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBetterPassword.mod.PasswordProps])(children: _*)
  }
  @JSImport("react-better-password", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

