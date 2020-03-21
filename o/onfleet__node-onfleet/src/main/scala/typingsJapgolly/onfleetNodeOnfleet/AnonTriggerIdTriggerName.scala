package typingsJapgolly.onfleetNodeOnfleet

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerIdTriggerName extends WebhookTriggerType {
  var triggerId: `2`
  var triggerName: TaskArrival
}

object AnonTriggerIdTriggerName {
  @scala.inline
  def apply(triggerId: `2`, triggerName: TaskArrival): AnonTriggerIdTriggerName = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerIdTriggerName]
  }
}

