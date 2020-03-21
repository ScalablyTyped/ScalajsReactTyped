package typingsJapgolly.reactNotificationSystem.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNotificationSystem.mod.Attributes
import typingsJapgolly.reactNotificationSystem.mod.Style
import typingsJapgolly.reactNotificationSystem.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationSystem {
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    style: Style | Boolean = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Attributes, ^, Unit, Attributes] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNotificationSystem.mod.Attributes, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNotificationSystem.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNotificationSystem.mod.Attributes])(children: _*)
  }
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

