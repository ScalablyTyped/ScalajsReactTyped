package typingsJapgolly.datatablesNetFixedheader.DataTables

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedHeaderApi extends js.Object {
  /**
    * Recalculate the position of the DataTable on the page and adjust the fixed element as appropriate.
    */
  def adjust(): Api
  /**
    * Disable the fixed elements
    */
  def disable(): Api
  /**
    * Enable / disable the fixed elements
    */
  def enable(enable: Boolean): Api
  /**
    * Get the fixed footer's offset.
    */
  def footerOffset(offset: Double): Api
  /**
    * Get the fixed header's offset.
    */
  def headerOffset(offset: Double): Api
}

object FixedHeaderApi {
  @scala.inline
  def apply(
    adjust: CallbackTo[Api],
    disable: CallbackTo[Api],
    enable: Boolean => CallbackTo[Api],
    footerOffset: Double => CallbackTo[Api],
    headerOffset: Double => CallbackTo[Api]
  ): FixedHeaderApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjust")(adjust.toJsFn)
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: scala.Boolean) => enable(t0).runNow()))
    __obj.updateDynamic("footerOffset")(js.Any.fromFunction1((t0: scala.Double) => footerOffset(t0).runNow()))
    __obj.updateDynamic("headerOffset")(js.Any.fromFunction1((t0: scala.Double) => headerOffset(t0).runNow()))
    __obj.asInstanceOf[FixedHeaderApi]
  }
}

