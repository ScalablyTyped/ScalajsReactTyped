package typingsJapgolly.knex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultikeyForeignConstraintBuilder extends js.Object {
  def references(columnNames: js.Array[String]): ReferencingColumnBuilder
}

object MultikeyForeignConstraintBuilder {
  @scala.inline
  def apply(references: js.Array[String] => CallbackTo[ReferencingColumnBuilder]): MultikeyForeignConstraintBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("references")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => references(t0).runNow()))
    __obj.asInstanceOf[MultikeyForeignConstraintBuilder]
  }
}

