package typingsJapgolly.reactNotificationSystemRedux.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNotificationSystem.mod.Notification
import typingsJapgolly.reactNotificationSystem.mod.Style
import typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsProps
import typingsJapgolly.reactNotificationSystemRedux.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationSystemRedux {
  def apply(
    allowHTML: js.UndefOr[Boolean] = js.undefined,
    noAnimation: js.UndefOr[Boolean] = js.undefined,
    notifications: js.Array[Notification] = null,
    style: Style | Boolean = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NotificationsProps, ^, Unit, NotificationsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowHTML)) __obj.updateDynamic("allowHTML")(allowHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    if (notifications != null) __obj.updateDynamic("notifications")(notifications.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNotificationSystemRedux.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNotificationSystemRedux.mod.NotificationsProps])(children: _*)
  }
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

