package typingsJapgolly.easyTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintColumnOptions[T] extends js.Object {
  /**
    * Printer to format column names
    */
  var namePrinter: js.UndefOr[CellPrinter[T]] = js.undefined
  /**
    * Column separation string
    */
  var separator: js.UndefOr[String] = js.undefined
}

object PrintColumnOptions {
  @scala.inline
  def apply[T](namePrinter: (T, /* width */ Double) => CallbackTo[String] = null, separator: String = null): PrintColumnOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (namePrinter != null) __obj.updateDynamic("namePrinter")(js.Any.fromFunction2((t0: T, t1: /* width */ scala.Double) => namePrinter(t0, t1).runNow()))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintColumnOptions[T]]
  }
}

