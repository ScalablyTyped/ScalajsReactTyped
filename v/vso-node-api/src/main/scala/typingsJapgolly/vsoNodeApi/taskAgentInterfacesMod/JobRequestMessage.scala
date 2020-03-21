package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobRequestMessage extends js.Object {
  var environment: JobEnvironment
  var jobId: String
  var jobName: String
  var messageType: String
  var plan: TaskOrchestrationPlanReference
  var timeline: TimelineReference
}

object JobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    timeline: TimelineReference
  ): JobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobRequestMessage]
  }
}

