package typingsJapgolly.objection.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnNameMappers extends js.Object {
  def format(json: Pojo): Pojo
  def parse(json: Pojo): Pojo
}

object ColumnNameMappers {
  @scala.inline
  def apply(format: Pojo => CallbackTo[Pojo], parse: Pojo => CallbackTo[Pojo]): ColumnNameMappers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: typingsJapgolly.objection.mod.Pojo) => format(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: typingsJapgolly.objection.mod.Pojo) => parse(t0).runNow()))
    __obj.asInstanceOf[ColumnNameMappers]
  }
}

