package typingsJapgolly.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPromptDisplayingEventUIParam extends js.Object {
  /**
  	 * Get a boolean indicating if the operation that triggered the prompt can be cancelled.
  	 */
  var canCancel: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Get a boolean indicating if a message will be displayed to the end user.
  	 */
  var displayMessage: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the exception for the error, if there was one.
  	 */
  var exception: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get or set the message that will be displayed.
  	 */
  var message: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the [action](ig.spreadsheet.SpreadsheetUserPromptTrigger) that caused the prompt to be displayed.
  	 */
  var trigger: js.UndefOr[String] = js.undefined
}

object UserPromptDisplayingEventUIParam {
  @scala.inline
  def apply(
    canCancel: js.UndefOr[Boolean] = js.undefined,
    displayMessage: js.UndefOr[Boolean] = js.undefined,
    exception: js.Any = null,
    message: String = null,
    owner: js.Any = null,
    trigger: String = null
  ): UserPromptDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canCancel)) __obj.updateDynamic("canCancel")(canCancel.asInstanceOf[js.Any])
    if (!js.isUndefined(displayMessage)) __obj.updateDynamic("displayMessage")(displayMessage.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPromptDisplayingEventUIParam]
  }
}

