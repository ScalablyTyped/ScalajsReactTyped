package typingsJapgolly.reduxTestkit.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.reduxTestkit.AnonFlush
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-testkit", "FlushThunks")
@js.native
object FlushThunks extends js.Object {
  def createMiddleware(): (Middleware[js.Object, _, Dispatch[AnyAction]]) with AnonFlush = js.native
}

