package typingsJapgolly.reactVirtualized.esColumnSizerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizedColumnProps extends js.Object {
  var adjustedWidth: Double
  var columnWidth: Double
  var registerChild: js.Any
  def getColumnWidth(): Double
}

object SizedColumnProps {
  @scala.inline
  def apply(
    adjustedWidth: Double,
    columnWidth: Double,
    getColumnWidth: CallbackTo[Double],
    registerChild: js.Any
  ): SizedColumnProps = {
    val __obj = js.Dynamic.literal(adjustedWidth = adjustedWidth.asInstanceOf[js.Any], columnWidth = columnWidth.asInstanceOf[js.Any], registerChild = registerChild.asInstanceOf[js.Any])
    __obj.updateDynamic("getColumnWidth")(getColumnWidth.toJsFn)
    __obj.asInstanceOf[SizedColumnProps]
  }
}

