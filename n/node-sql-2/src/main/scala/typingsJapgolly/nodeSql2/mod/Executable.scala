package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executable extends js.Object {
  def toQuery(): QueryLike
}

object Executable {
  @scala.inline
  def apply(toQuery: CallbackTo[QueryLike]): Executable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.asInstanceOf[Executable]
  }
}

