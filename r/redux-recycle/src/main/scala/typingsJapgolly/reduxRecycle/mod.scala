package typingsJapgolly.reduxRecycle

import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-recycle", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String]): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: A): Reducer[A, AnyAction] = js.native
  def default[A](reducer: Reducer[A, AnyAction], actions: js.Array[String], initialState: Reducer[A, AnyAction]): Reducer[A, AnyAction] = js.native
}

