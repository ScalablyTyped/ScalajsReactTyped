package typingsJapgolly.grommet

import typingsJapgolly.grommet.grommetStrings.fadeIn
import typingsJapgolly.grommet.grommetStrings.fadeOut
import typingsJapgolly.grommet.grommetStrings.jiggle
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.pulse
import typingsJapgolly.grommet.grommetStrings.slideDown
import typingsJapgolly.grommet.grommetStrings.slideLeft
import typingsJapgolly.grommet.grommetStrings.slideRight
import typingsJapgolly.grommet.grommetStrings.slideUp
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.zoomIn
import typingsJapgolly.grommet.grommetStrings.zoomOut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.undefined
  var `type`: js.UndefOr[
    fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut
  ] = js.undefined
}

object AnonDelay {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    size: xsmall | small | medium | large | xlarge = null,
    `type`: fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut = null
  ): AnonDelay = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelay]
  }
}

