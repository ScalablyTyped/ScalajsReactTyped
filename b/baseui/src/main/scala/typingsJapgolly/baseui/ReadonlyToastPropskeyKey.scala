package typingsJapgolly.baseui

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.baseuiStrings.`inline`
import typingsJapgolly.baseui.baseuiStrings.info
import typingsJapgolly.baseui.baseuiStrings.negative
import typingsJapgolly.baseui.baseuiStrings.positive
import typingsJapgolly.baseui.baseuiStrings.toast
import typingsJapgolly.baseui.baseuiStrings.warning
import typingsJapgolly.baseui.toastMod.ToastOverrides
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.ToastProps> & {  key  :react.react.Key} */
trait ReadonlyToastPropskeyKey extends js.Object {
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  val children: js.UndefOr[(js.Function1[/* args */ AnonDismiss, Node]) | Node] = js.undefined
  val closeable: js.UndefOr[Boolean] = js.undefined
  val `data-baseweb`: js.UndefOr[String] = js.undefined
  val key: js.UndefOr[Key] = js.undefined
  val kind: js.UndefOr[info | positive | warning | negative] = js.undefined
  val notificationType: js.UndefOr[`inline` | toast] = js.undefined
  val onBlur: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  val onClose: js.UndefOr[js.Function0[_]] = js.undefined
  val onFocus: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  val onMouseEnter: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  val onMouseLeave: js.UndefOr[js.Function1[/* e */ Event_, _]] = js.undefined
  val overrides: js.UndefOr[ToastOverrides] = js.undefined
}

object ReadonlyToastPropskeyKey {
  @scala.inline
  def apply(
    autoHideDuration: Int | Double = null,
    children: (js.Function1[/* args */ AnonDismiss, Node]) | Node = null,
    closeable: js.UndefOr[Boolean] = js.undefined,
    `data-baseweb`: String = null,
    key: Key = null,
    kind: info | positive | warning | negative = null,
    notificationType: `inline` | toast = null,
    onBlur: /* e */ Event_ => CallbackTo[js.Any] = null,
    onClose: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    onFocus: /* e */ Event_ => CallbackTo[js.Any] = null,
    onMouseEnter: /* e */ Event_ => CallbackTo[js.Any] = null,
    onMouseLeave: /* e */ Event_ => CallbackTo[js.Any] = null,
    overrides: ToastOverrides = null
  ): ReadonlyToastPropskeyKey = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeable)) __obj.updateDynamic("closeable")(closeable.asInstanceOf[js.Any])
    if (`data-baseweb` != null) __obj.updateDynamic("data-baseweb")(`data-baseweb`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationType != null) __obj.updateDynamic("notificationType")(notificationType.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onBlur(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onFocus(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onMouseLeave(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToastPropskeyKey]
  }
}

