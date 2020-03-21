package typingsJapgolly.easyTable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnFormat[T] extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var printer: js.UndefOr[CellPrinter[T]] = js.undefined
}

object ColumnFormat {
  @scala.inline
  def apply[T](name: String = null, printer: (T, /* width */ Double) => CallbackTo[String] = null): ColumnFormat[T] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (printer != null) __obj.updateDynamic("printer")(js.Any.fromFunction2((t0: T, t1: /* width */ scala.Double) => printer(t0, t1).runNow()))
    __obj.asInstanceOf[ColumnFormat[T]]
  }
}

