package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T]
}

object CountableQuery {
  @scala.inline
  def apply[T](count: CallbackTo[ExecutableQuery[T]]): CountableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.asInstanceOf[CountableQuery[T]]
  }
}

