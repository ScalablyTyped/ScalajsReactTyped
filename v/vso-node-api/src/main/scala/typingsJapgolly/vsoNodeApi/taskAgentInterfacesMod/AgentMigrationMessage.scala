package typingsJapgolly.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentMigrationMessage extends js.Object {
  var accessToken: String
}

object AgentMigrationMessage {
  @scala.inline
  def apply(accessToken: String): AgentMigrationMessage = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentMigrationMessage]
  }
}

