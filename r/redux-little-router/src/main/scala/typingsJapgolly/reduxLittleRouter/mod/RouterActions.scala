package typingsJapgolly.reduxLittleRouter.mod

import typingsJapgolly.reduxLittleRouter.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait RouterActions extends StObject
object RouterActions {
  
  inline def BlockAction(
    payload: (/* location */ Location, /* action */ js.UndefOr[HistoryAction]) => String,
    `type`: /* "ROUTER_BLOCK" */ String
  ): typingsJapgolly.reduxLittleRouter.mod.BlockAction = {
    val __obj = js.Dynamic.literal(payload = js.Any.fromFunction2(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.BlockAction]
  }
  
  inline def GoAction(payload: Double, `type`: /* "ROUTER_GO" */ String): typingsJapgolly.reduxLittleRouter.mod.GoAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.GoAction]
  }
  
  inline def GoBackAction(`type`: /* "ROUTER_GO_BACK" */ String): typingsJapgolly.reduxLittleRouter.mod.GoBackAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.GoBackAction]
  }
  
  inline def GoForwardAction(`type`: /* "ROUTER_GO_FORWARD" */ String): typingsJapgolly.reduxLittleRouter.mod.GoForwardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.GoForwardAction]
  }
  
  inline def LocationChangedAction(payload: Location, `type`: /* "ROUTER_LOCATION_CHANGED" */ String): typingsJapgolly.reduxLittleRouter.mod.LocationChangedAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.LocationChangedAction]
  }
  
  inline def PushAction(payload: Location, `type`: /* "ROUTER_PUSH" */ String): typingsJapgolly.reduxLittleRouter.mod.PushAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.PushAction]
  }
  
  inline def ReplaceAction(payload: Location, `type`: /* "ROUTER_REPLACE" */ String): typingsJapgolly.reduxLittleRouter.mod.ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.ReplaceAction]
  }
  
  inline def ReplaceRoutesAction(payload: Options, `type`: /* "ROUTER_REPLACE_ROUTES" */ String): typingsJapgolly.reduxLittleRouter.mod.ReplaceRoutesAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.ReplaceRoutesAction]
  }
  
  inline def UnblockAction(`type`: /* "ROUTER_UNBLOCK" */ String): typingsJapgolly.reduxLittleRouter.mod.UnblockAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.UnblockAction]
  }
}
