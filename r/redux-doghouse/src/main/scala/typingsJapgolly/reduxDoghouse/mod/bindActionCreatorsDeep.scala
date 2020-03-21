package typingsJapgolly.reduxDoghouse.mod

import typingsJapgolly.redux.mod.ActionCreator
import typingsJapgolly.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "bindActionCreatorsDeep")
@js.native
object bindActionCreatorsDeep extends js.Object {
  def apply[A /* <: ActionCreator[_] */, S](actionFactories: A, dispatch: Dispatch[S]): A = js.native
}

