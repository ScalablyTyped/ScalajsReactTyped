package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderMouseEventHandlerParams extends js.Object {
  var columnData: js.Any
  var dataKey: String
  var event: ReactMouseEventFrom[Element]
}

object HeaderMouseEventHandlerParams {
  @scala.inline
  def apply(columnData: js.Any, dataKey: String, event: ReactMouseEventFrom[Element]): HeaderMouseEventHandlerParams = {
    val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderMouseEventHandlerParams]
  }
}

