package typingsJapgolly.muiDatatables

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColIndex extends js.Object {
  var colIndex: Double
  var dataIndex: Double
  var event: ReactMouseEventFrom[Element]
  var rowIndex: Double
}

object AnonColIndex {
  @scala.inline
  def apply(colIndex: Double, dataIndex: Double, event: ReactMouseEventFrom[Element], rowIndex: Double): AnonColIndex = {
    val __obj = js.Dynamic.literal(colIndex = colIndex.asInstanceOf[js.Any], dataIndex = dataIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColIndex]
  }
}

