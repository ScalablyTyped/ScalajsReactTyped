package typingsJapgolly.commonErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-errors", "InvalidOperationError")
@js.native
class InvalidOperationError protected () extends ErrorConstructor {
  /**
    * @param message     any message
    * @param inner_error the Error instance that caused the current error.
    *                    Stack trace will be appended.
    */
  def this(message: String) = this()
  def this(message: String, inner_error: Error) = this()
}

