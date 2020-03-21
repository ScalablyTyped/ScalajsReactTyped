package typingsJapgolly.reduxPromise.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-promise", "ReduxPromise")
@js.native
object ReduxPromise extends js.Object {
  type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
}

