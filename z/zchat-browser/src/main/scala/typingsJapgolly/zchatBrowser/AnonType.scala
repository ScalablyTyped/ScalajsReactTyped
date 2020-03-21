package typingsJapgolly.zchatBrowser

import typingsJapgolly.zchatBrowser.mod.ChatEvent.Button
import typingsJapgolly.zchatBrowser.mod.ChatEvent.ListItem
import typingsJapgolly.zchatBrowser.mod.ChatEvent.StructuredMessage
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends StructuredMessage {
  var buttons: js.Array[Button]
  var items: js.Array[ListItem]
  var `type`: LIST_TEMPLATE
}

object AnonType {
  @scala.inline
  def apply(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): AnonType = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

