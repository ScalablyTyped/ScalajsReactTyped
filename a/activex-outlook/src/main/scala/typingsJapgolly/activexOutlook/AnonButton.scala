package typingsJapgolly.activexOutlook

import typingsJapgolly.activexOutlook.Outlook.OlMouseButton
import typingsJapgolly.activexOutlook.Outlook.OlShiftState
import typingsJapgolly.activexStdole.stdole.OLE_XPOS_CONTAINER
import typingsJapgolly.activexStdole.stdole.OLE_YPOS_CONTAINER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButton extends js.Object {
  val Button: OlMouseButton
  val Shift: OlShiftState
  val X: OLE_XPOS_CONTAINER
  val Y: OLE_YPOS_CONTAINER
}

object AnonButton {
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): AnonButton = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonButton]
  }
}

