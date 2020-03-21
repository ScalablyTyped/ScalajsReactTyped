package typingsJapgolly.zchatBrowser.mod.ChatEvent

import typingsJapgolly.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.PANEL_TEMPLATE_CAROUSEL
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.QUICK_REPLIES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.zchatBrowser.AnonMsg
  - typingsJapgolly.zchatBrowser.AnonButtons
  - typingsJapgolly.zchatBrowser.AnonItems
  - typingsJapgolly.zchatBrowser.AnonType
*/
trait StructuredMessage extends js.Object

object StructuredMessage {
  @scala.inline
  def AnonMsg(msg: String, quick_replies: js.Array[Button], `type`: QUICK_REPLIES): StructuredMessage = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], quick_replies = quick_replies.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def AnonButtons(buttons: js.Array[Button], panel: Panel, `type`: PANEL_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def AnonItems(items: js.Array[PanelTemplate], `type`: PANEL_TEMPLATE_CAROUSEL): StructuredMessage = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
  @scala.inline
  def AnonType(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): StructuredMessage = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredMessage]
  }
}

