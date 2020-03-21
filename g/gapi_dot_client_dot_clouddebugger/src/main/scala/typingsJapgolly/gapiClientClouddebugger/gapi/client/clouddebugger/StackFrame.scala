package typingsJapgolly.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * Set of arguments passed to this function.
    * Note that this might not be populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[Variable]] = js.undefined
  /** Demangled function name at the call site. */
  var function: js.UndefOr[String] = js.undefined
  /**
    * Set of local variables at the stack frame location.
    * Note that this might not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[Variable]] = js.undefined
  /** Source location of the call site. */
  var location: js.UndefOr[SourceLocation] = js.undefined
}

object StackFrame {
  @scala.inline
  def apply(
    arguments: js.Array[Variable] = null,
    function: String = null,
    locals: js.Array[Variable] = null,
    location: SourceLocation = null
  ): StackFrame = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrame]
  }
}

