package typingsJapgolly.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidateWindowParameterProperties extends js.Object {
  /**
    * Optional.
    * Text that is shown at the bottom of the candidate window.
    */
  var auxiliaryText: js.UndefOr[String] = js.undefined
  /**
    * Optional.
    * True to display the auxiliary text, false to hide it.
    */
  var auxiliaryTextVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * True to show the cursor, false to hide it.
    */
  var cursorVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * The number of candidates to display per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * Optional.
    * True if the candidate window should be rendered vertical, false to make it horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * True to show the Candidate window, false to hide it.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional.
    * Where to display the candidate window.
    * @since Chrome 28.
    */
  var windowPosition: js.UndefOr[String] = js.undefined
}

object CandidateWindowParameterProperties {
  @scala.inline
  def apply(
    auxiliaryText: String = null,
    auxiliaryTextVisible: js.UndefOr[Boolean] = js.undefined,
    cursorVisible: js.UndefOr[Boolean] = js.undefined,
    pageSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    windowPosition: String = null
  ): CandidateWindowParameterProperties = {
    val __obj = js.Dynamic.literal()
    if (auxiliaryText != null) __obj.updateDynamic("auxiliaryText")(auxiliaryText.asInstanceOf[js.Any])
    if (!js.isUndefined(auxiliaryTextVisible)) __obj.updateDynamic("auxiliaryTextVisible")(auxiliaryTextVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorVisible)) __obj.updateDynamic("cursorVisible")(cursorVisible.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (windowPosition != null) __obj.updateDynamic("windowPosition")(windowPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateWindowParameterProperties]
  }
}

