package typingsJapgolly.evernote.mod.Errors

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Errors.EDAMSystemException")
@js.native
class EDAMSystemException () extends Error {
  var errorCode: EDAMErrorCode = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var rateLimitDuration: Double = js.native
}

