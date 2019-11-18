package typingsJapgolly.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakpointResolvedEventDataType extends js.Object {
  /**
    * Breakpoint unique identifier.
    */
  var breakpointId: BreakpointId
  /**
    * Actual breakpoint location.
    */
  var location: Location
}

object BreakpointResolvedEventDataType {
  @scala.inline
  def apply(breakpointId: BreakpointId, location: Location): BreakpointResolvedEventDataType = {
    val __obj = js.Dynamic.literal(breakpointId = breakpointId.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BreakpointResolvedEventDataType]
  }
}

