package typingsJapgolly.materialUiPagination.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var current: Double
  var display: Double
  var total: Double
  def onChange(value: Double): Unit
}

object PaginationProps {
  @scala.inline
  def apply(current: Double, display: Double, onChange: Double => Callback, total: Double): PaginationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: scala.Double) => onChange(t0).runNow()))
    __obj.asInstanceOf[PaginationProps]
  }
}

