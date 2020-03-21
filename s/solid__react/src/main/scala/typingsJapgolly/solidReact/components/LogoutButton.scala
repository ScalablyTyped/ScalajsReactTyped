package typingsJapgolly.solidReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.solidReact.AnonClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LogoutButton {
  def apply(
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonClassName, typingsJapgolly.solidReact.mod.LogoutButton, Unit, AnonClassName] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.solidReact.AnonClassName, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.solidReact.mod.LogoutButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.solidReact.AnonClassName])(children: _*)
  }
  @JSImport("@solid/react", "LogoutButton")
  @js.native
  object componentImport extends js.Object
  
}

