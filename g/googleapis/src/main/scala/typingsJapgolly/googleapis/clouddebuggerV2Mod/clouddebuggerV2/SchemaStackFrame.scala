package typingsJapgolly.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a stack frame context.
  */
@js.native
trait SchemaStackFrame extends js.Object {
  /**
    * Set of arguments passed to this function. Note that this might not be
    * populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Demangled function name at the call site.
    */
  var function: js.UndefOr[String] = js.native
  /**
    * Set of local variables at the stack frame location. Note that this might
    * not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[SchemaVariable]] = js.native
  /**
    * Source location of the call site.
    */
  var location: js.UndefOr[SchemaSourceLocation] = js.native
}

object SchemaStackFrame {
  @scala.inline
  def apply(
    arguments: js.Array[SchemaVariable] = null,
    function: String = null,
    locals: js.Array[SchemaVariable] = null,
    location: SchemaSourceLocation = null
  ): SchemaStackFrame = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStackFrame]
  }
}

