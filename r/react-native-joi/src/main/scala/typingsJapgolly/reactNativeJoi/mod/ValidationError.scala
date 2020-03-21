package typingsJapgolly.reactNativeJoi.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends Error
     with JoiObject {
  var _object: js.Any
  var details: js.Array[ValidationErrorItem]
  def annotate(): String
}

object ValidationError {
  @scala.inline
  def apply(
    _object: js.Any,
    annotate: CallbackTo[String],
    details: js.Array[ValidationErrorItem],
    isJoi: Boolean,
    message: String,
    name: String,
    stack: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(_object = _object.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], isJoi = isJoi.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("annotate")(annotate.toJsFn)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

