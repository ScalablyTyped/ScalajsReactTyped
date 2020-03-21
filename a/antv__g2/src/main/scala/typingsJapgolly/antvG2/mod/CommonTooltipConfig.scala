package typingsJapgolly.antvG2.mod

import typingsJapgolly.antvG2.AnonStyle
import typingsJapgolly.antvG2.antvG2Strings.bottom
import typingsJapgolly.antvG2.antvG2Strings.click
import typingsJapgolly.antvG2.antvG2Strings.default
import typingsJapgolly.antvG2.antvG2Strings.left
import typingsJapgolly.antvG2.antvG2Strings.mini
import typingsJapgolly.antvG2.antvG2Strings.mousemove
import typingsJapgolly.antvG2.antvG2Strings.none
import typingsJapgolly.antvG2.antvG2Strings.right
import typingsJapgolly.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonTooltipConfig extends js.Object {
  var crosshairs: js.UndefOr[AnonStyle] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var hideMarkers: js.UndefOr[Boolean] = js.undefined
  var inPlot: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[left | right | top | bottom] = js.undefined
  var shared: js.UndefOr[Boolean] = js.undefined
  var showTitle: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var triggerOn: js.UndefOr[mousemove | click | none] = js.undefined
  var `type`: js.UndefOr[default | mini] = js.undefined
  var useHtml: js.UndefOr[Boolean] = js.undefined
}

object CommonTooltipConfig {
  @scala.inline
  def apply(
    crosshairs: AnonStyle = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    triggerOn: mousemove | click | none = null,
    `type`: default | mini = null,
    useHtml: js.UndefOr[Boolean] = js.undefined
  ): CommonTooltipConfig = {
    val __obj = js.Dynamic.literal()
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonTooltipConfig]
  }
}

