package typingsJapgolly.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDataCollectionByAgentIdsResponse extends js.Object {
  /**
    * Information about agents or the connector that were instructed to start collecting data. Information includes the agent/connector ID, a description of the operation performed, and whether the agent/connector configuration was updated.
    */
  var agentsConfigurationStatus: js.UndefOr[AgentConfigurationStatusList] = js.native
}

object StartDataCollectionByAgentIdsResponse {
  @scala.inline
  def apply(agentsConfigurationStatus: AgentConfigurationStatusList = null): StartDataCollectionByAgentIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (agentsConfigurationStatus != null) __obj.updateDynamic("agentsConfigurationStatus")(agentsConfigurationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataCollectionByAgentIdsResponse]
  }
}

