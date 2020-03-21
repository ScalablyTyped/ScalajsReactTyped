package typingsJapgolly.reduxDoghouse.mod

import typingsJapgolly.redux.mod.ActionCreator
import typingsJapgolly.redux.mod.ActionCreatorsMapObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-doghouse", "ScopedActionFactory")
@js.native
class ScopedActionFactory[A /* <: ActionCreator[_] | ActionCreatorsMapObject[_] */] protected () extends js.Object {
  def this(actionCreator: A) = this()
  def scope(id: String): A = js.native
  def scope(id: Double): A = js.native
}

