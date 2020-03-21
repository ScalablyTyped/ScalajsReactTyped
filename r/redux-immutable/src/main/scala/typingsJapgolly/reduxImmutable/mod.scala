package typingsJapgolly.reduxImmutable

import typingsJapgolly.immutable.Immutable.Collection.Indexed
import typingsJapgolly.immutable.Immutable.Collection.Keyed
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-immutable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Indexed[S]]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcardT[S, A /* <: Action[_] */, T](reducers: ReducersMapObject[S, A], getDefaultState: js.Function0[Keyed[T, S]]): Reducer[S, A] = js.native
}

