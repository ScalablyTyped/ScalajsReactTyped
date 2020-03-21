package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconUrlDescriptor
  - typingsJapgolly.inboxsdk.mod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends js.Object

object MessageAttachmentIconDescriptor {
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(
    iconUrl: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(
    iconHtml: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
}

