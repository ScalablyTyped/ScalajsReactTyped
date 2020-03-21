package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewClickEvent extends js.Object {
  var attachmentCardView: AttachmentCardView
  def preventDefault(): Unit
}

object PreviewClickEvent {
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: Callback): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[PreviewClickEvent]
  }
}

