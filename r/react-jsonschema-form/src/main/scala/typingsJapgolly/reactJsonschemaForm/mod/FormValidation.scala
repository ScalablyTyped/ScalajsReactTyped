package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-jsonschema-form.react-jsonschema-form.FieldValidation & {[fieldName: string] : react-jsonschema-form.react-jsonschema-form.FieldValidation} */
trait FormValidation extends /* fieldName */ StringDictionary[FieldValidation] {
  var __errors: js.Array[FieldError]
  def addError(message: String): Unit
}

object FormValidation {
  @scala.inline
  def apply(
    __errors: js.Array[FieldError],
    addError: String => Callback,
    StringDictionary: /* fieldName */ StringDictionary[FieldValidation] = null
  ): FormValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors.asInstanceOf[js.Any])
    __obj.updateDynamic("addError")(js.Any.fromFunction1((t0: java.lang.String) => addError(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormValidation]
  }
}

