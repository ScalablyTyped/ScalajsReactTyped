package typingsJapgolly.knex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForeignConstraintBuilder extends js.Object {
  def references(columnName: String): ReferencingColumnBuilder
}

object ForeignConstraintBuilder {
  @scala.inline
  def apply(references: String => CallbackTo[ReferencingColumnBuilder]): ForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("references")(js.Any.fromFunction1((t0: java.lang.String) => references(t0).runNow()))
    __obj.asInstanceOf[ForeignConstraintBuilder]
  }
}

