package typingsJapgolly.reactNotifyToast.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNotifyToast.mod.NotificationProps
import typingsJapgolly.reactNotifyToast.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_NotificationProps_580851021[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    options: Options = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[NotificationProps, ComponentRef, Unit, NotificationProps] = {
    val __obj = js.Dynamic.literal()
  
      if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNotifyToast.mod.NotificationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNotifyToast.mod.NotificationProps])(children: _*)
  }
}

