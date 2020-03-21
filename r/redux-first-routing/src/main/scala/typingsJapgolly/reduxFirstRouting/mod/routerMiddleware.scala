package typingsJapgolly.reduxFirstRouting.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  def apply(history: History[LocationState]): Middleware[_, State, Dispatch[AnyAction]] = js.native
}

