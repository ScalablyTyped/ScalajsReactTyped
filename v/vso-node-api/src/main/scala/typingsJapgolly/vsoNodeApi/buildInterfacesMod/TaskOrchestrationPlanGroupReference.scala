package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanGroupReference extends js.Object {
  /**
    * The name of the plan group.
    */
  var planGroup: String
  /**
    * The project ID.
    */
  var projectId: String
}

object TaskOrchestrationPlanGroupReference {
  @scala.inline
  def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
}

