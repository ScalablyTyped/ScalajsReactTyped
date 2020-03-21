package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardNoPreviewOptions extends js.Object {
  var buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor]
  var description: String
  var fileIconImageUrl: String
  var foldColor: js.UndefOr[String] = js.undefined
  var iconThumbnailUrl: String
  var previewUrl: String
  var title: String
  def previewOnClick(event: PreviewClickEvent): Unit
}

object AttachmentCardNoPreviewOptions {
  @scala.inline
  def apply(
    buttons: js.Array[DownloadButtonDescriptor | CustomButtonDescriptor],
    description: String,
    fileIconImageUrl: String,
    iconThumbnailUrl: String,
    previewOnClick: PreviewClickEvent => Callback,
    previewUrl: String,
    title: String,
    foldColor: String = null
  ): AttachmentCardNoPreviewOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fileIconImageUrl = fileIconImageUrl.asInstanceOf[js.Any], iconThumbnailUrl = iconThumbnailUrl.asInstanceOf[js.Any], previewUrl = previewUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("previewOnClick")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Conversations.PreviewClickEvent) => previewOnClick(t0).runNow()))
    if (foldColor != null) __obj.updateDynamic("foldColor")(foldColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCardNoPreviewOptions]
  }
}

