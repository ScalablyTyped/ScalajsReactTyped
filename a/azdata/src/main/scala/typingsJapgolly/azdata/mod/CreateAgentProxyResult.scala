package typingsJapgolly.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAgentProxyResult extends ResultStatus {
  var proxy: AgentProxyInfo
  var step: AgentJobStepInfo
}

object CreateAgentProxyResult {
  @scala.inline
  def apply(errorMessage: String, proxy: AgentProxyInfo, step: AgentJobStepInfo, success: Boolean): CreateAgentProxyResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAgentProxyResult]
  }
}

