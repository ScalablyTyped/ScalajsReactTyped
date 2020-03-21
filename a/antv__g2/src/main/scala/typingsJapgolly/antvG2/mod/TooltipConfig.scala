package typingsJapgolly.antvG2.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvG2.AnonStyle
import typingsJapgolly.antvG2.antvG2Booleans.`false`
import typingsJapgolly.antvG2.antvG2Booleans.`true`
import typingsJapgolly.antvG2.antvG2Strings.bottom
import typingsJapgolly.antvG2.antvG2Strings.click
import typingsJapgolly.antvG2.antvG2Strings.default
import typingsJapgolly.antvG2.antvG2Strings.left
import typingsJapgolly.antvG2.antvG2Strings.mini
import typingsJapgolly.antvG2.antvG2Strings.mousemove
import typingsJapgolly.antvG2.antvG2Strings.none
import typingsJapgolly.antvG2.antvG2Strings.right
import typingsJapgolly.antvG2.antvG2Strings.top
import typingsJapgolly.antvG2.mod.Styles.background
import typingsJapgolly.antvG2.mod.Styles.text
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.antvG2.mod.HtmlTooltipConfig
  - typingsJapgolly.antvG2.mod.CanvasTooltipConfig
  - typingsJapgolly.antvG2.mod.MiniTooltipConfig
*/
trait TooltipConfig extends js.Object

object TooltipConfig {
  @scala.inline
  def HtmlTooltipConfig(
    containerTpl: String = null,
    crosshairs: AnonStyle = null,
    enterable: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Boolean] = js.undefined,
    `g2-tooltip`: Record[String, _] = null,
    `g2-tooltip-list`: Record[String, _] = null,
    `g2-tooltip-list-item`: Record[String, _] = null,
    `g2-tooltip-marker`: Record[String, _] = null,
    `g2-tooltip-title`: Record[String, _] = null,
    `g2-tooltip-value`: Record[String, _] = null,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    htmlContent: (/* title */ String, /* items */ js.Array[TooltipItem]) => CallbackTo[String] = null,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    itemTpl: String = null,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    triggerOn: mousemove | click | none = null,
    `type`: default = null,
    useHtml: `true` = null
  ): TooltipConfig = {
    val __obj = js.Dynamic.literal()
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(enterable)) __obj.updateDynamic("enterable")(enterable.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (`g2-tooltip` != null) __obj.updateDynamic("g2-tooltip")(`g2-tooltip`.asInstanceOf[js.Any])
    if (`g2-tooltip-list` != null) __obj.updateDynamic("g2-tooltip-list")(`g2-tooltip-list`.asInstanceOf[js.Any])
    if (`g2-tooltip-list-item` != null) __obj.updateDynamic("g2-tooltip-list-item")(`g2-tooltip-list-item`.asInstanceOf[js.Any])
    if (`g2-tooltip-marker` != null) __obj.updateDynamic("g2-tooltip-marker")(`g2-tooltip-marker`.asInstanceOf[js.Any])
    if (`g2-tooltip-title` != null) __obj.updateDynamic("g2-tooltip-title")(`g2-tooltip-title`.asInstanceOf[js.Any])
    if (`g2-tooltip-value` != null) __obj.updateDynamic("g2-tooltip-value")(`g2-tooltip-value`.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (htmlContent != null) __obj.updateDynamic("htmlContent")(js.Any.fromFunction2((t0: /* title */ java.lang.String, t1: /* items */ js.Array[typingsJapgolly.antvG2.mod.TooltipItem]) => htmlContent(t0, t1).runNow()))
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (useHtml != null) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipConfig]
  }
  @scala.inline
  def CanvasTooltipConfig(
    useHtml: `false`,
    boardStyle: background = null,
    crosshairs: AnonStyle = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    itemGap: Int | Double = null,
    nameStyle: text = null,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleStyle: text = null,
    triggerOn: mousemove | click | none = null,
    `type`: default = null,
    valueStyle: text = null
  ): TooltipConfig = {
    val __obj = js.Dynamic.literal(useHtml = useHtml.asInstanceOf[js.Any])
    if (boardStyle != null) __obj.updateDynamic("boardStyle")(boardStyle.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (nameStyle != null) __obj.updateDynamic("nameStyle")(nameStyle.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipConfig]
  }
  @scala.inline
  def MiniTooltipConfig(
    `type`: mini,
    boardStyle: background = null,
    crosshairs: AnonStyle = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    hideMarkers: js.UndefOr[Boolean] = js.undefined,
    inPlot: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    position: left | right | top | bottom = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    triangleHeight: Int | Double = null,
    triangleWidth: Int | Double = null,
    triggerOn: mousemove | click | none = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    valueStyle: text = null
  ): TooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (boardStyle != null) __obj.updateDynamic("boardStyle")(boardStyle.asInstanceOf[js.Any])
    if (crosshairs != null) __obj.updateDynamic("crosshairs")(crosshairs.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMarkers)) __obj.updateDynamic("hideMarkers")(hideMarkers.asInstanceOf[js.Any])
    if (!js.isUndefined(inPlot)) __obj.updateDynamic("inPlot")(inPlot.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triangleHeight != null) __obj.updateDynamic("triangleHeight")(triangleHeight.asInstanceOf[js.Any])
    if (triangleWidth != null) __obj.updateDynamic("triangleWidth")(triangleWidth.asInstanceOf[js.Any])
    if (triggerOn != null) __obj.updateDynamic("triggerOn")(triggerOn.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipConfig]
  }
}

