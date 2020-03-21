package typingsJapgolly.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypes extends js.Object {
  /** An object that defines configuration options for polar chart series. */
  var CommonPolarChartSeries: js.UndefOr[dxPolarChartSeriesTypesCommonPolarChartSeries] = js.undefined
  /** An object defining a series of the area type. */
  var areapolarseries: js.UndefOr[dxPolarChartSeriesTypesAreapolarseries] = js.undefined
  /** An object defining a series of the bar type. */
  var barpolarseries: js.UndefOr[dxPolarChartSeriesTypesBarpolarseries] = js.undefined
  /** An object defining a series of the line type. */
  var linepolarseries: js.UndefOr[dxPolarChartSeriesTypesLinepolarseries] = js.undefined
  /** An object defining a series of the scatter type. */
  var scatterpolarseries: js.UndefOr[js.Any] = js.undefined
  /** An object defining a series of the stackedBar type. */
  var stackedbarpolarseries: js.UndefOr[dxPolarChartSeriesTypesStackedbarpolarseries] = js.undefined
}

object dxPolarChartSeriesTypes {
  @scala.inline
  def apply(
    CommonPolarChartSeries: dxPolarChartSeriesTypesCommonPolarChartSeries = null,
    areapolarseries: dxPolarChartSeriesTypesAreapolarseries = null,
    barpolarseries: dxPolarChartSeriesTypesBarpolarseries = null,
    linepolarseries: dxPolarChartSeriesTypesLinepolarseries = null,
    scatterpolarseries: js.Any = null,
    stackedbarpolarseries: dxPolarChartSeriesTypesStackedbarpolarseries = null
  ): dxPolarChartSeriesTypes = {
    val __obj = js.Dynamic.literal()
    if (CommonPolarChartSeries != null) __obj.updateDynamic("CommonPolarChartSeries")(CommonPolarChartSeries.asInstanceOf[js.Any])
    if (areapolarseries != null) __obj.updateDynamic("areapolarseries")(areapolarseries.asInstanceOf[js.Any])
    if (barpolarseries != null) __obj.updateDynamic("barpolarseries")(barpolarseries.asInstanceOf[js.Any])
    if (linepolarseries != null) __obj.updateDynamic("linepolarseries")(linepolarseries.asInstanceOf[js.Any])
    if (scatterpolarseries != null) __obj.updateDynamic("scatterpolarseries")(scatterpolarseries.asInstanceOf[js.Any])
    if (stackedbarpolarseries != null) __obj.updateDynamic("stackedbarpolarseries")(stackedbarpolarseries.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypes]
  }
}

