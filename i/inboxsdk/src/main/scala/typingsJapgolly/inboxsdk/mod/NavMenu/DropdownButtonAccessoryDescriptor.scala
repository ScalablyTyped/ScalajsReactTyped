package typingsJapgolly.inboxsdk.mod.NavMenu

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonAccessoryDescriptor extends js.Object {
  var buttonBackgroundColor: String
  var buttonForegroundColor: String
  var `type`: DROPDOWN_BUTTON
  def onClick(event: DropdownButtonClickEvent): Unit
}

object DropdownButtonAccessoryDescriptor {
  @scala.inline
  def apply(
    buttonBackgroundColor: String,
    buttonForegroundColor: String,
    onClick: DropdownButtonClickEvent => Callback,
    `type`: DROPDOWN_BUTTON
  ): DropdownButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.NavMenu.DropdownButtonClickEvent) => onClick(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
  }
}

