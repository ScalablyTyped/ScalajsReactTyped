package typingsJapgolly.officeUiFabricReact.autofillAutofillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutofillState extends js.Object {
  var displayValue: js.UndefOr[String] = js.undefined
}

object IAutofillState {
  @scala.inline
  def apply(displayValue: String = null): IAutofillState = {
    val __obj = js.Dynamic.literal()
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutofillState]
  }
}

