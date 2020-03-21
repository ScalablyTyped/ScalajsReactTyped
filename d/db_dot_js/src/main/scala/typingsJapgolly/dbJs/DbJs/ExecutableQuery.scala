package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]]
}

object ExecutableQuery {
  @scala.inline
  def apply[T](execute: CallbackTo[js.Promise[js.Array[T]]]): ExecutableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute.toJsFn)
    __obj.asInstanceOf[ExecutableQuery[T]]
  }
}

