package typingsJapgolly.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a location in the source code.
  */
@js.native
trait SchemaSourceLocation extends js.Object {
  /**
    * Column within a line. The first column in a line as the value `1`. Agents
    * that do not support setting breakpoints on specific columns ignore this
    * field.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * Line inside the file. The first line in the file has the value `1`.
    */
  var line: js.UndefOr[Double] = js.native
  /**
    * Path to the source file within the source context of the target binary.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaSourceLocation {
  @scala.inline
  def apply(column: Int | Double = null, line: Int | Double = null, path: String = null): SchemaSourceLocation = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceLocation]
  }
}

