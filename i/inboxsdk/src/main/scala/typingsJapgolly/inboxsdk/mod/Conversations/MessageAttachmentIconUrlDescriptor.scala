package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconUrlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconUrl: String
}

object MessageAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[MessageAttachmentIconUrlDescriptor]
  }
}

