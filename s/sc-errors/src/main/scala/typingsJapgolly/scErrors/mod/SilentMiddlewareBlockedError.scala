package typingsJapgolly.scErrors.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", "SilentMiddlewareBlockedError")
@js.native
class SilentMiddlewareBlockedError protected () extends Error {
  def this(message: String, `type`: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var `type`: String = js.native
}

