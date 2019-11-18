package typingsJapgolly.reactDashRouter

import typingsJapgolly.history.historyMod.Location
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.Anon_Location with js.Any */] extends js.Object {
  var location: Location[LocationState]
  var `match`: typingsJapgolly.reactDashRouter.reactDashRouterMod.`match`[Params]
}

object Anon_Location {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.Anon_Location with js.Any */](location: Location[LocationState], `match`: `match`[Params]): Anon_Location[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Location[Params]]
  }
}

