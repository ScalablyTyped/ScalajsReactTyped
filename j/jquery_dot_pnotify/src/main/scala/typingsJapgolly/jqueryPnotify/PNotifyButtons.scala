package typingsJapgolly.jqueryPnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNotifyButtons extends js.Object {
  /**
    * The classes to use for button icons. Leave them null to use the classes from the styling you're using.
    */
  var classes: js.UndefOr[AnonCloser] = js.undefined
  /**
    * Provide a button for the user to manually close the notice.
    */
  var closer: js.UndefOr[Boolean] = js.undefined
  /**
    * Only show the closer button on hover.
    */
  var closer_hover: js.UndefOr[Boolean] = js.undefined
  /**
    * The various displayed text, helps facilitating internationalization.
    */
  var labels: js.UndefOr[AnonClose] = js.undefined
  /**
    * Show the buttons even when the nonblock module is in use.
    */
  var show_on_nonblock: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide a button for the user to manually stick the notice.
    */
  var sticker: js.UndefOr[Boolean] = js.undefined
  /**
    * Only show the sticker button on hover.
    */
  var sticker_hover: js.UndefOr[Boolean] = js.undefined
}

object PNotifyButtons {
  @scala.inline
  def apply(
    classes: AnonCloser = null,
    closer: js.UndefOr[Boolean] = js.undefined,
    closer_hover: js.UndefOr[Boolean] = js.undefined,
    labels: AnonClose = null,
    show_on_nonblock: js.UndefOr[Boolean] = js.undefined,
    sticker: js.UndefOr[Boolean] = js.undefined,
    sticker_hover: js.UndefOr[Boolean] = js.undefined
  ): PNotifyButtons = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(closer)) __obj.updateDynamic("closer")(closer.asInstanceOf[js.Any])
    if (!js.isUndefined(closer_hover)) __obj.updateDynamic("closer_hover")(closer_hover.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(show_on_nonblock)) __obj.updateDynamic("show_on_nonblock")(show_on_nonblock.asInstanceOf[js.Any])
    if (!js.isUndefined(sticker)) __obj.updateDynamic("sticker")(sticker.asInstanceOf[js.Any])
    if (!js.isUndefined(sticker_hover)) __obj.updateDynamic("sticker_hover")(sticker_hover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PNotifyButtons]
  }
}

