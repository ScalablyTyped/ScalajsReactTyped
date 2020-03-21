package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.baseui.dataTableMod.RowT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: ReactMouseEventFrom[HTMLButtonElement]
  var row: RowT
}

object AnonEvent {
  @scala.inline
  def apply(event: ReactMouseEventFrom[HTMLButtonElement], row: RowT): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

