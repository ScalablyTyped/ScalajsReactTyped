package typingsJapgolly.reduxForm.mod

import typingsJapgolly.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "stopSubmit")
@js.native
object stopSubmit extends js.Object {
  def apply(form: String): FormAction = js.native
  def apply(form: String, errors: FormErrors[_, _]): FormAction = js.native
}

