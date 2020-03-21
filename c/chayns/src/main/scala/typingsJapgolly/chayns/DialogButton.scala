package typingsJapgolly.chayns

import typingsJapgolly.chayns.chayns.dialog.buttonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.dialog
  * interfaces
  */
// chayns.dialog.confirm()
trait DialogButton extends js.Object {
  var buttonType: typingsJapgolly.chayns.chayns.dialog.buttonType
  var text: String
}

object DialogButton {
  @scala.inline
  def apply(buttonType: buttonType, text: String): DialogButton = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DialogButton]
  }
}

