package typingsJapgolly.reduxBootstrap

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.reduxBootstrap.interfacesMod.interfaces.DevToolsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Namespace)
@js.native
object configureStoreMod extends js.Object {
  def default(
    middlewares: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[_, js.Object]],
    rootReducer: Reducer[_, AnyAction],
    initialState: js.Any,
    devToolsOptions: DevToolsOptions
  ): Store[_, AnyAction] = js.native
}

