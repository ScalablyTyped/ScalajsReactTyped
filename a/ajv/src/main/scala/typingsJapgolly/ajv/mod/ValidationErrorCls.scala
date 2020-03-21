package typingsJapgolly.ajv.mod

import typingsJapgolly.ajv.ajvBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ajv", "ValidationError")
@js.native
class ValidationErrorCls protected ()
  extends typingsJapgolly.ajv.mod.AjvErrors.ValidationError {
  def this(errors: js.Array[ErrorObject]) = this()
  /* CompleteClass */
  override var ajv: `true` = js.native
  /* CompleteClass */
  override var errors: js.Array[ErrorObject] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var validation: `true` = js.native
}

