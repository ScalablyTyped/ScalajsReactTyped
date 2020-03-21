package typingsJapgolly.exceljs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsvReadOptions extends js.Object {
  var dateFormats: js.Array[String]
  def map(value: js.Any, index: Double): js.Any
}

object CsvReadOptions {
  @scala.inline
  def apply(dateFormats: js.Array[String], map: (js.Any, Double) => CallbackTo[js.Any]): CsvReadOptions = {
    val __obj = js.Dynamic.literal(dateFormats = dateFormats.asInstanceOf[js.Any])
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => map(t0, t1).runNow()))
    __obj.asInstanceOf[CsvReadOptions]
  }
}

