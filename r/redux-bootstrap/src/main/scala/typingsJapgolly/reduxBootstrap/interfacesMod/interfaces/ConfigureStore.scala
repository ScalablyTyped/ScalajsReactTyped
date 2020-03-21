package typingsJapgolly.reduxBootstrap.interfacesMod.interfaces

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureStore
  extends js.Function {
  def apply(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    rootReducer: js.Object,
    initialState: js.Any
  ): Store[_, AnyAction] = js.native
}

