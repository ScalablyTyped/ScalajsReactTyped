package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatRenderAttachmentsOptionsAttachments extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
}

object ChatRenderAttachmentsOptionsAttachments {
  @scala.inline
  def apply(content: js.Any = null, contentType: String = null): ChatRenderAttachmentsOptionsAttachments = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRenderAttachmentsOptionsAttachments]
  }
}

