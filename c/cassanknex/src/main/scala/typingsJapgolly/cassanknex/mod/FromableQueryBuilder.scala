package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromableQueryBuilder extends js.Object {
  def from(table: String): this.type
}

object FromableQueryBuilder {
  @scala.inline
  def apply(from: String => CallbackTo[FromableQueryBuilder]): FromableQueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(js.Any.fromFunction1((t0: java.lang.String) => from(t0).runNow()))
    __obj.asInstanceOf[FromableQueryBuilder]
  }
}

