package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Opens the given URI.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction extends js.Object {
  /**
    * Required. The HTTP or HTTPS scheme URI.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction {
  @scala.inline
  def apply(uri: String = null): SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction]
  }
}

