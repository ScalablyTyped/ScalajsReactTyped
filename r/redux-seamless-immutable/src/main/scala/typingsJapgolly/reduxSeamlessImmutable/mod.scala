package typingsJapgolly.reduxSeamlessImmutable

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.seamlessImmutable.mod.Immutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-seamless-immutable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def combineReducers(reducers: SeamlessReducers): Reducer[_, AnyAction] = js.native
  def routerReducer[T /* <: Reducer[_, AnyAction] */](state: T, action: Action[_]): T = js.native
  def stateTransformer[T](state: Immutable[T, js.Object]): T = js.native
  type SeamlessReducers = StringDictionary[Reducer[js.Any, js.Any]]
}

