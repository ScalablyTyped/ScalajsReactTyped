package typingsJapgolly.baseui

import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemAny extends js.Object {
  var event: Event_ | KeyboardEvent
  var item: js.Any
}

object AnonItemAny {
  @scala.inline
  def apply(event: Event_ | KeyboardEvent, item: js.Any): AnonItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemAny]
  }
}

