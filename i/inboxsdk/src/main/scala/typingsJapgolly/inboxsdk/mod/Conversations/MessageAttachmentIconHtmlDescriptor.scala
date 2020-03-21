package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconHtmlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconHtml: String
}

object MessageAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(
    iconHtml: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[MessageAttachmentIconHtmlDescriptor]
  }
}

