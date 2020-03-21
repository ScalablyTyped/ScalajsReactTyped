package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgent extends TaskAgentReference {
  /**
    * Gets the request which is currently assigned to this agent.
    */
  var assignedRequest: TaskAgentJobRequest
  /**
    * Gets or sets the authorization information for this agent.
    */
  var authorization: TaskAgentAuthorization
  /**
    * Gets the date on which this agent was created.
    */
  var createdOn: js.Date
  /**
    * Gets or sets the maximum job parallelism allowed on this host.
    */
  var maxParallelism: Double
  /**
    * Gets the pending update for this agent.
    */
  var pendingUpdate: TaskAgentUpdate
  var properties: js.Any
  /**
    * Gets the date on which the last connectivity status change occurred.
    */
  var statusChangedOn: js.Date
  var systemCapabilities: StringDictionary[String]
  var userCapabilities: StringDictionary[String]
}

object TaskAgent {
  @scala.inline
  def apply(
    _links: js.Any,
    assignedRequest: TaskAgentJobRequest,
    authorization: TaskAgentAuthorization,
    createdOn: js.Date,
    enabled: Boolean,
    id: Double,
    maxParallelism: Double,
    name: String,
    pendingUpdate: TaskAgentUpdate,
    properties: js.Any,
    status: TaskAgentStatus,
    statusChangedOn: js.Date,
    systemCapabilities: StringDictionary[String],
    userCapabilities: StringDictionary[String],
    version: String
  ): TaskAgent = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], assignedRequest = assignedRequest.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxParallelism = maxParallelism.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pendingUpdate = pendingUpdate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusChangedOn = statusChangedOn.asInstanceOf[js.Any], systemCapabilities = systemCapabilities.asInstanceOf[js.Any], userCapabilities = userCapabilities.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskAgent]
  }
}

