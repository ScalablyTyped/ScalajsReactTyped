package typingsJapgolly.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageToWorkerParameterType extends js.Object {
  var message: String
  /**
    * Identifier of the session.
    */
  var sessionId: SessionID
}

object SendMessageToWorkerParameterType {
  @scala.inline
  def apply(message: String, sessionId: SessionID): SendMessageToWorkerParameterType = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessageToWorkerParameterType]
  }
}

