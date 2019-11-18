package typingsJapgolly.reactDashRouter.reactDashRouterMod

import typingsJapgolly.history.historyMod.History
import typingsJapgolly.history.historyMod.Location
import typingsJapgolly.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteChildrenProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.RouteChildrenProps with js.Any */, S] extends js.Object {
  var history: History[LocationState]
  var location: Location[S]
  var `match`: typingsJapgolly.reactDashRouter.reactDashRouterMod.`match`[Params] | Null
}

object RouteChildrenProps {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.RouteChildrenProps with js.Any */, S](history: History[LocationState], location: Location[S], `match`: `match`[Params] = null): RouteChildrenProps[Params, S] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteChildrenProps[Params, S]]
  }
}

