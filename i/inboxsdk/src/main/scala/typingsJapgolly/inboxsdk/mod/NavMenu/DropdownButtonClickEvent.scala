package typingsJapgolly.inboxsdk.mod.NavMenu

import typingsJapgolly.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownButtonClickEvent extends js.Object {
  var dropdown: DropdownView
}

object DropdownButtonClickEvent {
  @scala.inline
  def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropdownButtonClickEvent]
  }
}

