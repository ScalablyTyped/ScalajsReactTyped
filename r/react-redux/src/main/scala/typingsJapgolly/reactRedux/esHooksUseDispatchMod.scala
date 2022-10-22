package typingsJapgolly.reactRedux

import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactRedux.esComponentsContextMod.ReactReduxContextValue
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDispatchMod {
  
  @JSImport("react-redux/es/hooks/useDispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDispatchHook[S, A /* <: Action[Any] */](): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")().asInstanceOf[js.Function0[Dispatch[A]]]
  inline def createDispatchHook[S, A /* <: Action[Any] */](context: Context[ReactReduxContextValue[S, A]]): js.Function0[Dispatch[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatchHook")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Dispatch[A]]]
  
  inline def useDispatch[AppDispatch /* <: Dispatch[AnyAction] */](): AppDispatch = ^.asInstanceOf[js.Dynamic].applyDynamic("useDispatch")().asInstanceOf[AppDispatch]
}
