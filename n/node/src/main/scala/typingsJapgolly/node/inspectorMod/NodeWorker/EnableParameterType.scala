package typingsJapgolly.node.inspectorMod.NodeWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableParameterType extends js.Object {
  /**
    * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
    * message to run them.
    */
  var waitForDebuggerOnStart: Boolean
}

object EnableParameterType {
  @scala.inline
  def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
    val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnableParameterType]
  }
}

