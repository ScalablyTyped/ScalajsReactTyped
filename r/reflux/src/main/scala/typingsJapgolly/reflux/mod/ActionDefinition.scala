package typingsJapgolly.reflux.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionDefinition extends ActionParameters {
  var actionName: js.UndefOr[String] = js.undefined
}

object ActionDefinition {
  @scala.inline
  def apply(
    actionName: String = null,
    asyncResult: js.UndefOr[Boolean] = js.undefined,
    children: js.Array[String] = null,
    preEmit: /* repeated */ js.Any => CallbackTo[js.UndefOr[js.Array[js.Any]]] = null,
    shouldEmit: /* repeated */ js.Any => CallbackTo[Boolean] = null,
    sync: js.UndefOr[Boolean] = js.undefined
  ): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncResult)) __obj.updateDynamic("asyncResult")(asyncResult.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preEmit != null) __obj.updateDynamic("preEmit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => preEmit(t0).runNow()))
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => shouldEmit(t0).runNow()))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionDefinition]
  }
}

