package typingsJapgolly.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageListSelectItem extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  var info: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageListSelectItem {
  @scala.inline
  def apply(
    description: String = null,
    image: GoogleCloudDialogflowV2IntentMessageImage = null,
    info: GoogleCloudDialogflowV2IntentMessageSelectItemInfo = null,
    title: String = null
  ): GoogleCloudDialogflowV2IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageListSelectItem]
  }
}

