package typingsJapgolly.reduxDoghouse

import typingsJapgolly.redux.mod.ActionCreatorsMapObject
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = js.native
}

