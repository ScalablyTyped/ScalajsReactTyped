package typingsJapgolly.reapop.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reapop.mod.Notification
import typingsJapgolly.reapop.mod.NotificationSystemProps
import typingsJapgolly.reapop.mod.NotificationSystemTheme
import typingsJapgolly.reapop.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reapop {
  def apply(
    theme: NotificationSystemTheme,
    filter: /* notification */ Notification => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NotificationSystemProps, default, Unit, NotificationSystemProps] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
  
      if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* notification */ typingsJapgolly.reapop.mod.Notification) => filter(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reapop.mod.NotificationSystemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reapop.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reapop.mod.NotificationSystemProps])(children: _*)
  }
  @JSImport("reapop", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

