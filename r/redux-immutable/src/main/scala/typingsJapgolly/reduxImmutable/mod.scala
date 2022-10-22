package typingsJapgolly.reduxImmutable

import typingsJapgolly.immutable.mod.Collection.Indexed
import typingsJapgolly.immutable.mod.Collection.Keyed
import typingsJapgolly.immutable.mod.Record.Factory
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
  inline def combineReducers[S](reducers: ReducersMapObject[S, Any], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, AnyAction]]
  inline def combineReducers[S, T /* <: js.Object */](reducers: ReducersMapObject[S, Any], getDefaultState: Factory[T]): Reducer[S, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, AnyAction]]
  
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, A]]
  inline def combineReducers_SA[S, A /* <: Action[Any] */](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, A]]
  
  inline def combineReducers_SAT[S, A /* <: Action[Any] */, T](reducers: ReducersMapObject[S, A]): Reducer[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, A]]
  inline def combineReducers_SAT[S, A /* <: Action[Any] */, T](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Keyed[T, S]]): Reducer[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any], getDefaultState.asInstanceOf[js.Any])).asInstanceOf[Reducer[S, A]]
  
  inline def combineReducers_ST[S, T /* <: js.Object */](reducers: ReducersMapObject[S, Any]): Reducer[S, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineReducers")(reducers.asInstanceOf[js.Any]).asInstanceOf[Reducer[S, AnyAction]]
}
