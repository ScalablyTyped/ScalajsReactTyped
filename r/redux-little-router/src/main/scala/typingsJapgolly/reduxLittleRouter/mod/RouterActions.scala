package typingsJapgolly.reduxLittleRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reduxLittleRouter.AnonOptions
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_BLOCK
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO_BACK
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_GO_FORWARD
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_LOCATION_CHANGED
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_PUSH
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_REPLACE_ROUTES
import typingsJapgolly.reduxLittleRouter.reduxLittleRouterStrings.ROUTER_UNBLOCK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reduxLittleRouter.mod.LocationChangedAction
  - typingsJapgolly.reduxLittleRouter.mod.PushAction
  - typingsJapgolly.reduxLittleRouter.mod.ReplaceAction
  - typingsJapgolly.reduxLittleRouter.mod.GoAction
  - typingsJapgolly.reduxLittleRouter.mod.GoBackAction
  - typingsJapgolly.reduxLittleRouter.mod.GoForwardAction
  - typingsJapgolly.reduxLittleRouter.mod.BlockAction
  - typingsJapgolly.reduxLittleRouter.mod.UnblockAction
  - typingsJapgolly.reduxLittleRouter.mod.ReplaceRoutesAction
*/
trait RouterActions extends js.Object

object RouterActions {
  @scala.inline
  def GoForwardAction(`type`: ROUTER_GO_FORWARD): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceRoutesAction(payload: AnonOptions, `type`: ROUTER_REPLACE_ROUTES): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def PushAction(payload: Location, `type`: ROUTER_PUSH): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def LocationChangedAction(payload: Location, `type`: ROUTER_LOCATION_CHANGED): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => CallbackTo[String],
    `type`: ROUTER_BLOCK
  ): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("payload")(js.Any.fromFunction2((t0: /* location */ typingsJapgolly.reduxLittleRouter.mod.Location, t1: /* action */ js.UndefOr[typingsJapgolly.reduxLittleRouter.mod.HistoryAction]) => payload(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoAction(payload: Double, `type`: ROUTER_GO): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def UnblockAction(`type`: ROUTER_UNBLOCK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def GoBackAction(`type`: ROUTER_GO_BACK): RouterActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
  @scala.inline
  def ReplaceAction(payload: Location, `type`: ROUTER_REPLACE): RouterActions = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterActions]
  }
}

