package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMouseEventHandlerParams extends js.Object {
  var event: ReactMouseEventFrom[Element]
  var index: Double
  var rowData: js.Any
}

object RowMouseEventHandlerParams {
  @scala.inline
  def apply(event: ReactMouseEventFrom[Element], index: Double, rowData: js.Any): RowMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowMouseEventHandlerParams]
  }
}

