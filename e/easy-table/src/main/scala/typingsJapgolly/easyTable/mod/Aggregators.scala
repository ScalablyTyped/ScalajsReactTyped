package typingsJapgolly.easyTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregators extends js.Object {
  /**
    * Average reduction
    */
  var avg: js.Any
  /**
    * Sum reduction
    */
  var sum: js.Any
  /**
    * Create a printer which formats the value with `printer`,
    * adds the `prefix` to it and right aligns the whole thing
    *
    * @param {String} prefix
    * @param {Function} printer
    * @returns {printer}
    */
  def printer[T](prefix: String, printer: CellPrinter[T]): CellPrinter[T]
}

object Aggregators {
  @scala.inline
  def apply(
    avg: js.Any,
    printer: (String, CellPrinter[js.Any]) => CallbackTo[CellPrinter[js.Any]],
    sum: js.Any
  ): Aggregators = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.updateDynamic("printer")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.easyTable.mod.CellPrinter[js.Any]) => printer(t0, t1).runNow()))
    __obj.asInstanceOf[Aggregators]
  }
}

