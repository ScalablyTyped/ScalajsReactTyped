package typingsJapgolly.onfleetNodeOnfleet

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskCompleted extends WebhookTriggerType {
  var triggerId: `3`
  var triggerName: TaskCompleted
}

object AnonTriggerNameTaskCompleted {
  @scala.inline
  def apply(triggerId: `3`, triggerName: TaskCompleted): AnonTriggerNameTaskCompleted = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskCompleted]
  }
}

