package typingsJapgolly.nodeSql2.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQuery extends Executable {
  def ifNotExists(): Executable
}

object CreateQuery {
  @scala.inline
  def apply(ifNotExists: CallbackTo[Executable], toQuery: CallbackTo[QueryLike]): CreateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ifNotExists")(ifNotExists.toJsFn)
    __obj.updateDynamic("toQuery")(toQuery.toJsFn)
    __obj.asInstanceOf[CreateQuery]
  }
}

