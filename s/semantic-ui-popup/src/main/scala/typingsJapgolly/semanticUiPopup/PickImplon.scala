package typingsJapgolly.semanticUiPopup

import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.click
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.focus
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.hover
import typingsJapgolly.semanticUiPopup.semanticUiPopupStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'on'> */
trait PickImplon extends js.Object {
  var on: focus | click | hover | manual
}

object PickImplon {
  @scala.inline
  def apply(on: focus | click | hover | manual): PickImplon = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplon]
  }
}

