package typingsJapgolly.rcPicker.uiUtilMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardConfig extends js.Object {
  var onCtrlLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onEnter: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onLeftRight: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onPageUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
  var onUpDown: js.UndefOr[(js.Function1[/* diff */ Double, Unit]) | Null] = js.undefined
}

object KeyboardConfig {
  @scala.inline
  def apply(
    onCtrlLeftRight: /* diff */ Double => Callback = null,
    onEnter: js.UndefOr[Callback] = js.undefined,
    onLeftRight: /* diff */ Double => Callback = null,
    onPageUpDown: /* diff */ Double => Callback = null,
    onUpDown: /* diff */ Double => Callback = null
  ): KeyboardConfig = {
    val __obj = js.Dynamic.literal()
    if (onCtrlLeftRight != null) __obj.updateDynamic("onCtrlLeftRight")(js.Any.fromFunction1((t0: /* diff */ scala.Double) => onCtrlLeftRight(t0).runNow()))
    onEnter.foreach(p => __obj.updateDynamic("onEnter")(p.toJsFn))
    if (onLeftRight != null) __obj.updateDynamic("onLeftRight")(js.Any.fromFunction1((t0: /* diff */ scala.Double) => onLeftRight(t0).runNow()))
    if (onPageUpDown != null) __obj.updateDynamic("onPageUpDown")(js.Any.fromFunction1((t0: /* diff */ scala.Double) => onPageUpDown(t0).runNow()))
    if (onUpDown != null) __obj.updateDynamic("onUpDown")(js.Any.fromFunction1((t0: /* diff */ scala.Double) => onUpDown(t0).runNow()))
    __obj.asInstanceOf[KeyboardConfig]
  }
}

