package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionContextCreatedEventDataType extends js.Object {
  /**
    * A newly created execution context.
    */
  var context: ExecutionContextDescription
}

object ExecutionContextCreatedEventDataType {
  @scala.inline
  def apply(context: ExecutionContextDescription): ExecutionContextCreatedEventDataType = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecutionContextCreatedEventDataType]
  }
}

