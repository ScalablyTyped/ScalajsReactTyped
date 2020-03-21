package typingsJapgolly.solidReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.solidReact.mod.AuthButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AuthButton {
  def apply(
    login: String,
    logout: String,
    popup: String,
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AuthButtonProps, typingsJapgolly.solidReact.mod.AuthButton, Unit, AuthButtonProps] = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], logout = logout.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.solidReact.mod.AuthButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.solidReact.mod.AuthButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.solidReact.mod.AuthButtonProps])(children: _*)
  }
  @JSImport("@solid/react", "AuthButton")
  @js.native
  object componentImport extends js.Object
  
}

