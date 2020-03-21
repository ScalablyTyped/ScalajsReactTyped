package typingsJapgolly.onfleetNodeOnfleet.webhooksMod

import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`0`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`10`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`12`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`13`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`14`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`1`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`2`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`3`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`4`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`5`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`6`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`7`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`8`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetNumbers.`9`
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.SmsRecipientResponseMissed
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskArrival
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskAssigned
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCloned
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCompleted
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskCreated
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDelayed
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskDeleted
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskEta
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskFailed
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskStarted
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUnassigned
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.TaskUpdated
import typingsJapgolly.onfleetNodeOnfleet.webhooksMod.WebhookTriggerName.WorkerDuty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerId
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerName
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerIdTriggerName
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskCompleted
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskFailed
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameWorkerDuty
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskCreated
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskUpdated
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskDeleted
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskAssigned
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskUnassigned
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskDelayed
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameTaskCloned
  - typingsJapgolly.onfleetNodeOnfleet.AnonTriggerNameSmsRecipientResponseMissed
*/
trait WebhookTriggerType extends js.Object

object WebhookTriggerType {
  @scala.inline
  def AnonTriggerNameTaskAssigned(triggerId: `9`, triggerName: TaskAssigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCloned(triggerId: `13`, triggerName: TaskCloned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskDelayed(triggerId: `12`, triggerName: TaskDelayed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCreated(triggerId: `6`, triggerName: TaskCreated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskDeleted(triggerId: `8`, triggerName: TaskDeleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskUnassigned(triggerId: `10`, triggerName: TaskUnassigned): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerIdTriggerName(triggerId: `2`, triggerName: TaskArrival): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerName(triggerId: `1`, triggerName: TaskEta): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskUpdated(triggerId: `7`, triggerName: TaskUpdated): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskCompleted(triggerId: `3`, triggerName: TaskCompleted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameTaskFailed(triggerId: `4`, triggerName: TaskFailed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerId(triggerId: `0`, triggerName: TaskStarted): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameWorkerDuty(triggerId: `5`, triggerName: WorkerDuty): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
  @scala.inline
  def AnonTriggerNameSmsRecipientResponseMissed(triggerId: `14`, triggerName: SmsRecipientResponseMissed): WebhookTriggerType = {
    val __obj = js.Dynamic.literal(triggerId = triggerId.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookTriggerType]
  }
}

