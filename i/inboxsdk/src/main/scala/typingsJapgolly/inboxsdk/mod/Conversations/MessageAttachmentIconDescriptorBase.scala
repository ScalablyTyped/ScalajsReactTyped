package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconDescriptorBase extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tooltip: String | HTMLElement
}

object MessageAttachmentIconDescriptorBase {
  @scala.inline
  def apply(
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
}

