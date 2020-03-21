package typingsJapgolly.fastCsv.columnFormatterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormatter extends js.Object {
  def format(col: String): String
}

object ColumnFormatter {
  @scala.inline
  def apply(format: String => CallbackTo[String]): ColumnFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: java.lang.String) => format(t0).runNow()))
    __obj.asInstanceOf[ColumnFormatter]
  }
}

