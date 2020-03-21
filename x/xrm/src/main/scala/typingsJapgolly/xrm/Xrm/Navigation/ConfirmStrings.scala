package typingsJapgolly.xrm.Xrm.Navigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmStrings extends js.Object {
  /**
    * (Optional) The cancel button label. If you do not specify the cancel button label, Cancel is used as the button label.
    */
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The confirm button label.If you do not specify the button label, OK is used as the button label.
    */
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  /**
    * (Optional) The subtitle to be displayed in the confirmation dialog.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  /**
    * The message to be displyed in the alert dialog.
    */
  var text: String
  /**
    * (Optional) The title to be displyed in the confirmation dialog.
    */
  var title: js.UndefOr[String] = js.undefined
}

object ConfirmStrings {
  @scala.inline
  def apply(
    text: String,
    cancelButtonLabel: String = null,
    confirmButtonLabel: String = null,
    subtitle: String = null,
    title: String = null
  ): ConfirmStrings = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (cancelButtonLabel != null) __obj.updateDynamic("cancelButtonLabel")(cancelButtonLabel.asInstanceOf[js.Any])
    if (confirmButtonLabel != null) __obj.updateDynamic("confirmButtonLabel")(confirmButtonLabel.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmStrings]
  }
}

