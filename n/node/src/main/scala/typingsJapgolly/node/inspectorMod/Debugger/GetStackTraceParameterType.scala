package typingsJapgolly.node.inspectorMod.Debugger

import typingsJapgolly.node.inspectorMod.Runtime.StackTraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStackTraceParameterType extends js.Object {
  var stackTraceId: StackTraceId
}

object GetStackTraceParameterType {
  @scala.inline
  def apply(stackTraceId: StackTraceId): GetStackTraceParameterType = {
    val __obj = js.Dynamic.literal(stackTraceId = stackTraceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStackTraceParameterType]
  }
}

