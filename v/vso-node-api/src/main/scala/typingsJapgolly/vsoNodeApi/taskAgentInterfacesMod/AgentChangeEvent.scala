package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentChangeEvent extends js.Object {
  var agent: TaskAgent
  var eventType: String
  var pool: TaskAgentPoolReference
  var poolId: Double
  var timeStamp: js.Date
}

object AgentChangeEvent {
  @scala.inline
  def apply(
    agent: TaskAgent,
    eventType: String,
    pool: TaskAgentPoolReference,
    poolId: Double,
    timeStamp: js.Date
  ): AgentChangeEvent = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentChangeEvent]
  }
}

