package typingsJapgolly.feathersjsErrors.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "FeathersError")
@js.native
class FeathersError protected () extends Error {
  def this(msg: String, name: String, code: Double, className: String, data: js.Any) = this()
  def this(msg: js.Error, name: String, code: Double, className: String, data: js.Any) = this()
  val className: String = js.native
  val code: Double = js.native
  val data: js.Any = js.native
  val errors: js.Any = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  def toJSON(): FeathersErrorJSON = js.native
}

