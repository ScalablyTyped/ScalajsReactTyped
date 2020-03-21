package typingsJapgolly.fineUploader.mod

import typingsJapgolly.fineUploader.coreMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIRetryOptions extends RetryOptions {
  /**
    * The text of the note that will optionally appear next to the item during automatic retry attempts.
    *
    * Ignored if `showAutoRetryNote` is false.
    *
    * @default `'Retrying {retryNum}/{maxAuto} ...'`
    */
  var autoRetryNote: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable a status message appearing next to the item during auto retry attempts
    *
    * @default `true`
    */
  var showAutoRetryNote: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable the showing of a button/link next to the failed item after all retry attempts have been exhausted.
    *
    * Clicking the button/link will force the uploader to make another attempt
    *
    * @default `false`
    */
  var showButton: js.UndefOr[Boolean] = js.undefined
}

object UIRetryOptions {
  @scala.inline
  def apply(
    autoAttemptDelay: Int | Double = null,
    autoRetryNote: String = null,
    enableAuto: js.UndefOr[Boolean] = js.undefined,
    maxAutoAttempts: Int | Double = null,
    preventRetryResponseProperty: String = null,
    showAutoRetryNote: js.UndefOr[Boolean] = js.undefined,
    showButton: js.UndefOr[Boolean] = js.undefined
  ): UIRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (autoAttemptDelay != null) __obj.updateDynamic("autoAttemptDelay")(autoAttemptDelay.asInstanceOf[js.Any])
    if (autoRetryNote != null) __obj.updateDynamic("autoRetryNote")(autoRetryNote.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAuto)) __obj.updateDynamic("enableAuto")(enableAuto.asInstanceOf[js.Any])
    if (maxAutoAttempts != null) __obj.updateDynamic("maxAutoAttempts")(maxAutoAttempts.asInstanceOf[js.Any])
    if (preventRetryResponseProperty != null) __obj.updateDynamic("preventRetryResponseProperty")(preventRetryResponseProperty.asInstanceOf[js.Any])
    if (!js.isUndefined(showAutoRetryNote)) __obj.updateDynamic("showAutoRetryNote")(showAutoRetryNote.asInstanceOf[js.Any])
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIRetryOptions]
  }
}

