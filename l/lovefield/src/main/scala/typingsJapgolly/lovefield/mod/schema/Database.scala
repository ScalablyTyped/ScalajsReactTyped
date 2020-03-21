package typingsJapgolly.lovefield.mod.schema

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database extends js.Object {
  def name(): String
  def pragma(): DatabasePragma
  def table(tableName: String): Table
  def tables(): js.Array[Table]
  def version(): Double
}

object Database {
  @scala.inline
  def apply(
    name: CallbackTo[String],
    pragma: CallbackTo[DatabasePragma],
    table: String => CallbackTo[Table],
    tables: CallbackTo[js.Array[Table]],
    version: CallbackTo[Double]
  ): Database = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.toJsFn)
    __obj.updateDynamic("pragma")(pragma.toJsFn)
    __obj.updateDynamic("table")(js.Any.fromFunction1((t0: java.lang.String) => table(t0).runNow()))
    __obj.updateDynamic("tables")(tables.toJsFn)
    __obj.updateDynamic("version")(version.toJsFn)
    __obj.asInstanceOf[Database]
  }
}

