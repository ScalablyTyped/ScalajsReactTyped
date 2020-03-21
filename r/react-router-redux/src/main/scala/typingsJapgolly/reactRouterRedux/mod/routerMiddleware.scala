package typingsJapgolly.reactRouterRedux.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-redux", "routerMiddleware")
@js.native
object routerMiddleware extends js.Object {
  def apply(history: History[LocationState]): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

