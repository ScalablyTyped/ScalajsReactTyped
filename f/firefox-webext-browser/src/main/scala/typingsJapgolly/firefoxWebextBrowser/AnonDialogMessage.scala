package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDialogMessage extends js.Object {
  /** The message to display to a user when being asked to confirm removal of the extension. */
  var dialogMessage: js.UndefOr[String] = js.undefined
  /** Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false. */
  var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
}

object AnonDialogMessage {
  @scala.inline
  def apply(dialogMessage: String = null, showConfirmDialog: js.UndefOr[Boolean] = js.undefined): AnonDialogMessage = {
    val __obj = js.Dynamic.literal()
    if (dialogMessage != null) __obj.updateDynamic("dialogMessage")(dialogMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfirmDialog)) __obj.updateDynamic("showConfirmDialog")(showConfirmDialog.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDialogMessage]
  }
}

