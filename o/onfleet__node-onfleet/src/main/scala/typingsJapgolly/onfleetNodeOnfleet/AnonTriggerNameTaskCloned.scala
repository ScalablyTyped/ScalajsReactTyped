package typingsJapgolly.onfleetNodeOnfleet

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTriggerNameTaskCloned extends WebhookTriggerType {
  var triggerId: `13`
  var triggerName: TaskCloned
}

object AnonTriggerNameTaskCloned {
  @scala.inline
  def apply(triggerId: `13`, triggerName: TaskCloned): AnonTriggerNameTaskCloned = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTriggerNameTaskCloned]
  }
}

