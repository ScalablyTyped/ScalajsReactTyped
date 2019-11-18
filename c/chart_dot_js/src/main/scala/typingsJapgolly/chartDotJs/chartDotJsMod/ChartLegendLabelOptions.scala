package typingsJapgolly.chartDotJs.chartDotJsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendLabelOptions extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function2[/* legendItem */ ChartLegendLabelItem, /* data */ ChartData, _]] = js.undefined
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[String] = js.undefined
  var generateLabels: js.UndefOr[js.Function1[/* chart */ Chart, js.Array[ChartLegendLabelItem]]] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var usePointStyle: js.UndefOr[Boolean] = js.undefined
}

object ChartLegendLabelOptions {
  @scala.inline
  def apply(
    boxWidth: Int | Double = null,
    filter: (/* legendItem */ ChartLegendLabelItem, /* data */ ChartData) => CallbackTo[_] = null,
    fontColor: ChartColor = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: String = null,
    generateLabels: /* chart */ Chart => CallbackTo[js.Array[ChartLegendLabelItem]] = null,
    padding: Int | Double = null,
    usePointStyle: js.UndefOr[Boolean] = js.undefined
  ): ChartLegendLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* legendItem */ typingsJapgolly.chartDotJs.chartDotJsMod.ChartLegendLabelItem, t1: /* data */ typingsJapgolly.chartDotJs.chartDotJsMod.ChartData) => filter(t0, t1).runNow()))
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (generateLabels != null) __obj.updateDynamic("generateLabels")(js.Any.fromFunction1((t0: /* chart */ typingsJapgolly.chartDotJs.chartDotJsMod.Chart) => generateLabels(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(usePointStyle)) __obj.updateDynamic("usePointStyle")(usePointStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendLabelOptions]
  }
}

