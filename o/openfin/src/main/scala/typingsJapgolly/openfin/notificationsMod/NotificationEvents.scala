package typingsJapgolly.openfin.notificationsMod

import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.eventsBaseMod.RuntimeEvent
import typingsJapgolly.openfin.openfinStrings.click
import typingsJapgolly.openfin.openfinStrings.close
import typingsJapgolly.openfin.openfinStrings.error
import typingsJapgolly.openfin.openfinStrings.message
import typingsJapgolly.openfin.openfinStrings.notification
import typingsJapgolly.openfin.openfinStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEvents extends BaseEventMap {
  var click: RuntimeEvent[notification, typingsJapgolly.openfin.openfinStrings.click]
  var close: RuntimeEvent[notification, typingsJapgolly.openfin.openfinStrings.close]
  var error: RuntimeEvent[notification, typingsJapgolly.openfin.openfinStrings.error]
  var message: RuntimeEvent[notification, typingsJapgolly.openfin.openfinStrings.message]
  var show: RuntimeEvent[notification, typingsJapgolly.openfin.openfinStrings.show]
}

object NotificationEvents {
  @scala.inline
  def apply(
    click: RuntimeEvent[notification, click],
    close: RuntimeEvent[notification, close],
    error: RuntimeEvent[notification, error],
    listenerRemoved: String,
    message: RuntimeEvent[notification, message],
    newListener: String,
    show: RuntimeEvent[notification, show]
  ): NotificationEvents = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotificationEvents]
  }
}

