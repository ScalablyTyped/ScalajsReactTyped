package typingsJapgolly.reduxForm.mod

import typingsJapgolly.reduxForm.actionsMod.FormAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form", "updateSyncWarnings")
@js.native
object updateSyncWarnings extends js.Object {
  def apply[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

