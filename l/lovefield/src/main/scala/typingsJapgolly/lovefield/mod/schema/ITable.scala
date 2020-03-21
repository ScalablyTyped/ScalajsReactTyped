package typingsJapgolly.lovefield.mod.schema

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lovefield.mod.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITable extends js.Object {
  def as(name: String): Table
  def createRow(value: js.Object): Row
  def getName(): String
}

object ITable {
  @scala.inline
  def apply(
    as: String => CallbackTo[Table],
    createRow: js.Object => CallbackTo[Row],
    getName: CallbackTo[String]
  ): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("as")(js.Any.fromFunction1((t0: java.lang.String) => as(t0).runNow()))
    __obj.updateDynamic("createRow")(js.Any.fromFunction1((t0: js.Object) => createRow(t0).runNow()))
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.asInstanceOf[ITable]
  }
}

