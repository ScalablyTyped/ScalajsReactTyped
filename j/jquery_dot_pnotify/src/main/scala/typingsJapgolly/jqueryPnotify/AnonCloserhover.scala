package typingsJapgolly.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloserhover extends js.Object {
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.undefined
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.undefined
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.undefined
}

object AnonCloserhover {
  @scala.inline
  def apply(
    closer: js.UndefOr[Boolean] = js.undefined,
    closer_hover: js.UndefOr[Boolean] = js.undefined,
    sticker: js.UndefOr[Boolean] = js.undefined,
    sticker_hover: js.UndefOr[Boolean] = js.undefined
  ): AnonCloserhover = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closer)) __obj.updateDynamic("closer")(closer.asInstanceOf[js.Any])
    if (!js.isUndefined(closer_hover)) __obj.updateDynamic("closer_hover")(closer_hover.asInstanceOf[js.Any])
    if (!js.isUndefined(sticker)) __obj.updateDynamic("sticker")(sticker.asInstanceOf[js.Any])
    if (!js.isUndefined(sticker_hover)) __obj.updateDynamic("sticker_hover")(sticker_hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloserhover]
  }
}

