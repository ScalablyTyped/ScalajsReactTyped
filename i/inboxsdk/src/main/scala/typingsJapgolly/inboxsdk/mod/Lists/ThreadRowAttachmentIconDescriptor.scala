package typingsJapgolly.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.mod.Lists.ThreadRowAttachmentIconUrlDescriptor
  - typingsJapgolly.inboxsdk.mod.Lists.ThreadRowAttachmentIconHtmlDescriptor
*/
trait ThreadRowAttachmentIconDescriptor extends js.Object

object ThreadRowAttachmentIconDescriptor {
  @scala.inline
  def ThreadRowAttachmentIconUrlDescriptor(iconUrl: String, iconClass: String = null, tooltip: String = null): ThreadRowAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptor]
  }
  @scala.inline
  def ThreadRowAttachmentIconHtmlDescriptor(iconHtml: String, tooltip: String = null): ThreadRowAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptor]
  }
}

