package typingsJapgolly.reactDashRouter

import typingsJapgolly.history.historyMod.History
import typingsJapgolly.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_History[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.Anon_History with js.Any */] extends js.Object {
  var history: History[LocationState]
  var route: Anon_Location[Params]
}

object Anon_History {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.reactDashRouter.reactDashRouterStrings.Anon_History with js.Any */](history: History[LocationState], route: Anon_Location[Params]): Anon_History[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_History[Params]]
  }
}

