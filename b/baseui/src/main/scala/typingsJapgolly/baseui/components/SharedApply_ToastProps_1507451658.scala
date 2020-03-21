package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonDismiss
import typingsJapgolly.baseui.baseuiStrings.`inline`
import typingsJapgolly.baseui.baseuiStrings.info
import typingsJapgolly.baseui.baseuiStrings.negative
import typingsJapgolly.baseui.baseuiStrings.positive
import typingsJapgolly.baseui.baseuiStrings.toast
import typingsJapgolly.baseui.baseuiStrings.warning
import typingsJapgolly.baseui.toastMod.ToastOverrides
import typingsJapgolly.baseui.toastMod.ToastProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ToastProps_1507451658[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    autoHideDuration: Int | Double = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    kind: info | positive | warning | negative = null,
    notificationType: `inline` | toast = null,
    onBlur: /* e */ Event_ => CallbackTo[js.Any] = null,
    onClose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onFocus: /* e */ Event_ => CallbackTo[js.Any] = null,
    onMouseEnter: /* e */ Event_ => CallbackTo[js.Any] = null,
    onMouseLeave: /* e */ Event_ => CallbackTo[js.Any] = null,
    overrides: ToastOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* args */ AnonDismiss, Node]) | Node = null
  ): UnmountedWithRoot[ToastProps, ComponentRef, Unit, ToastProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onMouseLeave(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.toastMod.ToastProps, 
  japgolly.scalajs.react.Children.None, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.toastMod.ToastProps])
  }
}

