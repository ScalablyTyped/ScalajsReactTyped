package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropQuery extends Executable {
  def ifExists(): Executable
}

object DropQuery {
  @scala.inline
  def apply(ifExists: CallbackTo[Executable], toQuery: CallbackTo[QueryLike]): DropQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ifExists")(ifExists.toJsFn)
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.asInstanceOf[DropQuery]
  }
}

