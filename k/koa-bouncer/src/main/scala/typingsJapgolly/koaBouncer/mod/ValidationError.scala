package typingsJapgolly.koaBouncer.mod

import typingsJapgolly.koaBouncer.AnonKey
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", "ValidationError")
@js.native
class ValidationError protected () extends Error {
  def this(key: String, message: String) = this()
  var bouncer: AnonKey = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

