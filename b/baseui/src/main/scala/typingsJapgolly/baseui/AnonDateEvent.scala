package typingsJapgolly.baseui

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateEvent extends js.Object {
  var date: js.Date
  var event: Event_
}

object AnonDateEvent {
  @scala.inline
  def apply(date: js.Date, event: Event_): AnonDateEvent = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDateEvent]
  }
}

