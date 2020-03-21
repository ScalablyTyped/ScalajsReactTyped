package typingsJapgolly.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorItem extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var message: String
  var options: js.UndefOr[ValidationOptions] = js.undefined
  var path: js.Array[String]
  var `type`: String
}

object ValidationErrorItem {
  @scala.inline
  def apply(
    message: String,
    path: js.Array[String],
    `type`: String,
    context: Context = null,
    options: ValidationOptions = null
  ): ValidationErrorItem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationErrorItem]
  }
}

