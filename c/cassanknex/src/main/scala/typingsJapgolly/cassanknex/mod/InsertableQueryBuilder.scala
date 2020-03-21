package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertableQueryBuilder extends js.Object {
  def ifNotExists(): this.type
  def into(table: String): this.type
}

object InsertableQueryBuilder {
  @scala.inline
  def apply(
    ifNotExists: CallbackTo[InsertableQueryBuilder],
    into: String => CallbackTo[InsertableQueryBuilder]
  ): InsertableQueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ifNotExists")(ifNotExists.toJsFn)
    __obj.updateDynamic("into")(js.Any.fromFunction1((t0: java.lang.String) => into(t0).runNow()))
    __obj.asInstanceOf[InsertableQueryBuilder]
  }
}

