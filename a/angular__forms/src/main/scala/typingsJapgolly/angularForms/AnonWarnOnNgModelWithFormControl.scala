package typingsJapgolly.angularForms

import typingsJapgolly.angularForms.angularFormsStrings.always
import typingsJapgolly.angularForms.angularFormsStrings.never
import typingsJapgolly.angularForms.angularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWarnOnNgModelWithFormControl extends js.Object {
  /** @deprecated as of v6 */ var warnOnNgModelWithFormControl: never | once | always
}

object AnonWarnOnNgModelWithFormControl {
  @scala.inline
  def apply(warnOnNgModelWithFormControl: never | once | always): AnonWarnOnNgModelWithFormControl = {
    val __obj = js.Dynamic.literal(warnOnNgModelWithFormControl = warnOnNgModelWithFormControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWarnOnNgModelWithFormControl]
  }
}

