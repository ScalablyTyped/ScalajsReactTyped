package typingsJapgolly.reduxForm.reducerMod

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormReducer extends Reducer[FormStateMap, AnyAction] {
  def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
}

