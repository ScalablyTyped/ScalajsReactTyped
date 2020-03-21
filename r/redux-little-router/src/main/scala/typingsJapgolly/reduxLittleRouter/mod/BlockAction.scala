package typingsJapgolly.reduxLittleRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_BLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockAction extends RouterActions {
  var payload: BlockCallback
  var `type`: ROUTER_BLOCK
}

object BlockAction {
  @scala.inline
  def apply(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => CallbackTo[String],
    `type`: ROUTER_BLOCK
  ): BlockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payload")(js.Any.fromFunction2((t0: /* location */ typingsJapgolly.reduxLittleRouter.mod.Location, t1: /* action */ js.UndefOr[typingsJapgolly.reduxLittleRouter.mod.HistoryAction]) => payload(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockAction]
  }
}

