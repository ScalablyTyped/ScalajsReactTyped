package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.recharts.AnonWidth
import typingsJapgolly.recharts.PartialMargin
import typingsJapgolly.recharts.rechartsStrings.bottom
import typingsJapgolly.recharts.rechartsStrings.center
import typingsJapgolly.recharts.rechartsStrings.left
import typingsJapgolly.recharts.rechartsStrings.middle
import typingsJapgolly.recharts.rechartsStrings.right
import typingsJapgolly.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  var align: js.UndefOr[left | center | right] = js.undefined
  var chartHeight: js.UndefOr[Double] = js.undefined
  var chartWidth: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[Element | ContentRenderer[LegendProps]] = js.undefined
  var formatter: js.UndefOr[LegendValueFormatter] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var margin: js.UndefOr[PartialMargin] = js.undefined
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.undefined
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    align: left | center | right = null,
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    content: Element | ContentRenderer[LegendProps] = null,
    formatter: (/* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => CallbackTo[js.Any] = null,
    height: Int | Double = null,
    iconSize: Int | Double = null,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: PartialMargin = null,
    onBBoxUpdate: /* box */ AnonWidth => Callback = null,
    onClick: /* repeated */ js.Any => Callback = null,
    onMouseEnter: /* repeated */ js.Any => Callback = null,
    onMouseLeave: /* repeated */ js.Any => Callback = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: top | middle | bottom = null,
    width: Int | Double = null,
    wrapperStyle: js.Object = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction3((t0: /* value */ js.UndefOr[
  /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any], t1: /* entry */ js.UndefOr[typingsJapgolly.recharts.mod.LegendPayload], t2: /* i */ js.UndefOr[scala.Double]) => formatter(t0, t1, t2).runNow()))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onBBoxUpdate != null) __obj.updateDynamic("onBBoxUpdate")(js.Any.fromFunction1((t0: /* box */ typingsJapgolly.recharts.AnonWidth) => onBBoxUpdate(t0).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClick(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMouseLeave(t0).runNow()))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
}

