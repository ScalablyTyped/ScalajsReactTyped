package typingsJapgolly.reactJsonschemaForm

import typingsJapgolly.reactJsonschemaForm.mod.AjvError
import typingsJapgolly.reactJsonschemaForm.mod.ErrorSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorSchema extends js.Object {
  var errorSchema: ErrorSchema
  var errors: js.Array[AjvError]
}

object AnonErrorSchema {
  @scala.inline
  def apply(errorSchema: ErrorSchema, errors: js.Array[AjvError]): AnonErrorSchema = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorSchema]
  }
}

