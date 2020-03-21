package typingsJapgolly.reduxStorage.mod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-storage", "reducer")
@js.native
object reducer extends js.Object {
  def apply[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = js.native
  def apply[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = js.native
}

