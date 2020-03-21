package typingsJapgolly.immer

import japgolly.scalajs.react.Callback
import typingsJapgolly.immer.mod.ImmerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFreeze extends js.Object {
  var autoFreeze: js.UndefOr[Boolean] = js.undefined
  var onAssign: js.UndefOr[
    js.Function3[/* state */ ImmerState[_], /* prop */ String, /* value */ js.Any, Unit]
  ] = js.undefined
  var onCopy: js.UndefOr[js.Function1[/* state */ ImmerState[_], Unit]] = js.undefined
  var onDelete: js.UndefOr[js.Function2[/* state */ ImmerState[_], /* prop */ String, Unit]] = js.undefined
  var useProxies: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoFreeze {
  @scala.inline
  def apply(
    autoFreeze: js.UndefOr[Boolean] = js.undefined,
    onAssign: (/* state */ ImmerState[js.Any], /* prop */ String, /* value */ js.Any) => Callback = null,
    onCopy: /* state */ ImmerState[js.Any] => Callback = null,
    onDelete: (/* state */ ImmerState[js.Any], /* prop */ String) => Callback = null,
    useProxies: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoFreeze = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFreeze)) __obj.updateDynamic("autoFreeze")(autoFreeze.asInstanceOf[js.Any])
    if (onAssign != null) __obj.updateDynamic("onAssign")(js.Any.fromFunction3((t0: /* state */ typingsJapgolly.immer.mod.ImmerState[js.Any], t1: /* prop */ java.lang.String, t2: /* value */ js.Any) => onAssign(t0, t1, t2).runNow()))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.immer.mod.ImmerState[js.Any]) => onCopy(t0).runNow()))
    if (onDelete != null) __obj.updateDynamic("onDelete")(js.Any.fromFunction2((t0: /* state */ typingsJapgolly.immer.mod.ImmerState[js.Any], t1: /* prop */ java.lang.String) => onDelete(t0, t1).runNow()))
    if (!js.isUndefined(useProxies)) __obj.updateDynamic("useProxies")(useProxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFreeze]
  }
}

