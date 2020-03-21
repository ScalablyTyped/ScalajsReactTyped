package typingsJapgolly.sipml

import japgolly.scalajs.react.Callback
import typingsJapgolly.sipml.SIPml.Stack.Event
import typingsJapgolly.sipml.SIPml.Stack.EventSubscriptionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListener extends js.Object {
  var events: EventSubscriptionType | js.Array[EventSubscriptionType]
  def listener(e: Event): Unit
}

object AnonListener {
  @scala.inline
  def apply(events: EventSubscriptionType | js.Array[EventSubscriptionType], listener: Event => Callback): AnonListener = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("listener")(js.Any.fromFunction1((t0: typingsJapgolly.sipml.SIPml.Stack.Event) => listener(t0).runNow()))
    __obj.asInstanceOf[AnonListener]
  }
}

