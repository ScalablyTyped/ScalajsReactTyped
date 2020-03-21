package typingsJapgolly.electronNotify.mod

import typingsJapgolly.electronNotify.electronNotifyStrings.click
import typingsJapgolly.electronNotify.electronNotifyStrings.close
import typingsJapgolly.electronNotify.electronNotifyStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloseNotificationEvent extends js.Object {
  var event: close | show | click
  var id: Double
}

object ICloseNotificationEvent {
  @scala.inline
  def apply(event: close | show | click, id: Double): ICloseNotificationEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICloseNotificationEvent]
  }
}

