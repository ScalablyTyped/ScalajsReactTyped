package typingsJapgolly.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageCardButton extends js.Object {
  var postback: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageCardButton {
  @scala.inline
  def apply(postback: String = null, text: String = null): GoogleCloudDialogflowV2IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCardButton]
  }
}

