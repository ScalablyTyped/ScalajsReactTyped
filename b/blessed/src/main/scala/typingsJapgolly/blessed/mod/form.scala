package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.FormElement
import typingsJapgolly.blessed.mod.Widgets.FormOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "form")
@js.native
object form extends js.Object {
  def apply[TFormData](): FormElement[TFormData] = js.native
  def apply[TFormData](options: FormOptions): FormElement[TFormData] = js.native
}

