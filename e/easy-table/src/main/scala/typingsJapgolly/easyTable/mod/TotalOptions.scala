package typingsJapgolly.easyTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TotalOptions[T] extends js.Object {
  /**
    * Initial value for reduction
    */
  var init: js.UndefOr[T] = js.undefined
  /**
    * Printer to format the total cell
    */
  var printer: js.UndefOr[CellPrinter[T]] = js.undefined
  /**
    * reduce(acc, val, idx, length) function to compute the total value
    */
  var reduce: js.UndefOr[ReduceFunction[T]] = js.undefined
}

object TotalOptions {
  @scala.inline
  def apply[T](
    init: T = null,
    printer: (T, /* width */ Double) => CallbackTo[String] = null,
    reduce: (T, T, /* idx */ Double, /* length */ Double) => CallbackTo[T] = null
  ): TotalOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (printer != null) __obj.updateDynamic("printer")(js.Any.fromFunction2((t0: T, t1: /* width */ scala.Double) => printer(t0, t1).runNow()))
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction4((t0: T, t1: T, t2: /* idx */ scala.Double, t3: /* length */ scala.Double) => reduce(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[TotalOptions[T]]
  }
}

