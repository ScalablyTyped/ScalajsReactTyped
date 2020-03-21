package typingsJapgolly.reduxStateSync.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-state-sync", "createStateSyncMiddleware")
@js.native
object createStateSyncMiddleware extends js.Object {
  def apply(): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
  def apply(config: Config): Middleware[js.Object, _, Dispatch[AnyAction]] = js.native
}

