package typingsJapgolly.highchartsNg.mod._Global_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.highchartsNg.AnonCurrentMax
import typingsJapgolly.highchartsNg.AnonHeight
import typingsJapgolly.highchartsNg.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//Instantiated Chart
trait HighChartsNGChart extends HighChartsNGConfig {
  //This is a simple way to access all the Highcharts API that is not currently managed by this directive.
  def getHighcharts(): js.Any
}

object HighChartsNGChart {
  @scala.inline
  def apply(
    getHighcharts: CallbackTo[js.Any],
    options: Options,
    func: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any => Callback = null,
    loading: Boolean | String = null,
    noData: String = null,
    series: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IndividualSeriesOptions */ _
    ] = null,
    size: AnonHeight = null,
    title: AnonText = null,
    useHighStocks: js.UndefOr[Boolean] = js.undefined,
    xAxis: AnonCurrentMax = null
  ): HighChartsNGChart = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("getHighcharts")(getHighcharts.toJsFn)
    if (func != null) __obj.updateDynamic("func")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChartObject */ /* chart */ js.Any) => func(t0).runNow()))
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useHighStocks)) __obj.updateDynamic("useHighStocks")(useHighStocks.asInstanceOf[js.Any])
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighChartsNGChart]
  }
}

