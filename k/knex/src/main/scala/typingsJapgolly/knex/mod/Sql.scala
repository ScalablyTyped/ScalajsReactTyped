package typingsJapgolly.knex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sql extends js.Object {
  var bindings: js.Array[Value]
  var method: String
  var options: js.Any
  var sql: String
  def toNative(): SqlNative
}

object Sql {
  @scala.inline
  def apply(
    bindings: js.Array[Value],
    method: String,
    options: js.Any,
    sql: String,
    toNative: CallbackTo[SqlNative]
  ): Sql = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.updateDynamic("toNative")(toNative.toJsFn)
    __obj.asInstanceOf[Sql]
  }
}

