package typingsJapgolly.reduxForm

import typingsJapgolly.reduxForm.actionsMod.FormAction
import typingsJapgolly.reduxForm.mod.FormWarnings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallFormSyncWarningsWarning extends js.Object {
  def apply[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

