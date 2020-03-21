package typingsJapgolly.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formMod {
  type FormProps[FormData, P, ErrorType] = (typingsJapgolly.reduxForm.mod.Omit[
    typingsJapgolly.react.mod.FormHTMLAttributes[org.scalajs.dom.raw.HTMLFormElement], 
    typingsJapgolly.reduxForm.reduxFormStrings.onSubmit
  ]) with (typingsJapgolly.reduxForm.formMod.FormSubmitProp[FormData, P, ErrorType])
}
