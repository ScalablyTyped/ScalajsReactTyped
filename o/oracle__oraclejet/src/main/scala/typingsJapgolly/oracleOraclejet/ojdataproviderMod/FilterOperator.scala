package typingsJapgolly.oracleOraclejet.ojdataproviderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOperator[D] extends js.Object {
  var op: AttributeOperator | CompoundOperator
  def filter(data: js.Array[_]): js.Array[_]
}

object FilterOperator {
  @scala.inline
  def apply[D](filter: js.Array[js.Any] => CallbackTo[js.Array[js.Any]], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Array[js.Any]) => filter(t0).runNow()))
    __obj.asInstanceOf[FilterOperator[D]]
  }
}

