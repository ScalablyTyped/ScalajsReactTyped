package typingsJapgolly.wordpressData.mod

import typingsJapgolly.redux.mod.ActionFromReducersMapObject
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.CombinedState
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.redux.mod.StateFromReducersMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "combineReducers")
@js.native
object combineReducers extends js.Object {
  def apply[M /* <: ReducersMapObject[_, _] */](reducers: M): Reducer[CombinedState[StateFromReducersMapObject[M]], ActionFromReducersMapObject[M]] = js.native
  def apply[S](reducers: ReducersMapObject[S, _]): Reducer[CombinedState[S], AnyAction] = js.native
}

