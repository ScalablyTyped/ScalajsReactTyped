package typingsJapgolly.reduxBootstrap

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.reduxBootstrap.dtsInterfacesInterfacesMod.interfaces.DevToolsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsStoreConfigureStoreMod {
  
  @JSImport("redux-bootstrap/dts/store/configure_store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    middlewares: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]],
    enhancers: js.Array[StoreEnhancer[Any, js.Object]],
    rootReducer: Reducer[Any, AnyAction],
    initialState: Any,
    devToolsOptions: DevToolsOptions
  ): Store[Any, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(middlewares.asInstanceOf[js.Any], enhancers.asInstanceOf[js.Any], rootReducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], devToolsOptions.asInstanceOf[js.Any])).asInstanceOf[Store[Any, AnyAction]]
}
