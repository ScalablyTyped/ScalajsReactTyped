package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkflowid extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var workflow_id: AnonRequired
}

object AnonWorkflowid {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, workflow_id: AnonRequired): AnonWorkflowid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWorkflowid]
  }
}

