package typingsJapgolly.semanticUiForm

import typingsJapgolly.semanticUiForm.semanticUiFormStrings.blur
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.change
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'on'> */
trait PickImplon extends js.Object {
  var on: submit | blur | change
}

object PickImplon {
  @scala.inline
  def apply(on: submit | blur | change): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplon]
  }
}

