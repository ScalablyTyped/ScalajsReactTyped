package typingsJapgolly.reduxDoghouse.mod

import typingsJapgolly.redux.mod.ActionCreator
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxDoghouse.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindScopedActionFactories")
@js.native
object bindScopedActionFactories extends js.Object {
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S], bindFn: FnCall): A = js.native
}

