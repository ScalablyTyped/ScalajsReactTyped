package typingsJapgolly.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachedFromWorkerEventDataType extends js.Object {
  /**
    * Detached session identifier.
    */
  var sessionId: SessionID
}

object DetachedFromWorkerEventDataType {
  @scala.inline
  def apply(sessionId: SessionID): DetachedFromWorkerEventDataType = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetachedFromWorkerEventDataType]
  }
}

