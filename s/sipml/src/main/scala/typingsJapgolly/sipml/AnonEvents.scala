package typingsJapgolly.sipml

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipml.SIPml.Session.Event
import typingsJapgolly.sipml.SIPml.Session.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvents extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType]
  def listener(e: Event): Unit
}

object AnonEvents {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Callback): AnonEvents = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: typingsJapgolly.sipml.SIPml.Session.Event) => listener(t0).runNow()))
    __obj.asInstanceOf[AnonEvents]
  }
}

