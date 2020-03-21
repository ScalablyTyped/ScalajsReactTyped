package typingsJapgolly.dbJs.DbJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescableQuery[T] extends js.Object {
  def desc(): DescQuery[T]
}

object DescableQuery {
  @scala.inline
  def apply[T](desc: CallbackTo[DescQuery[T]]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("desc")(desc.toJsFn)
    __obj.asInstanceOf[DescableQuery[T]]
  }
}

