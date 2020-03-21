package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDoughnutChartMethods extends js.Object {
  /**
  	 * Adds a new series to the doughnut chart.
  	 *
  	 * @param seriesObj The series object to be added.
  	 */
  def addSeries(seriesObj: js.Object): Unit
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit
  /**
  	 * Returns information about how the doughnut chart is rendered.
  	 */
  def exportVisualData(): js.Object
  /**
  	 * Causes all of the series that have pending changes e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit
  /**
  	 * Returns the center of the doughnut chart.
  	 */
  def getCenterCoordinates(): js.Object
  /**
  	 * Returns data source of the series.
  	 *
  	 * @param series Optional. The series name. If not provided an array of series data sources is returned.
  	 */
  def getData(series: String): js.Object
  /**
  	 * Returns the radius of the chart's hole.
  	 */
  def getHoleRadius(): Double
  /**
  	 * Removes the specified series from the doughnut chart.
  	 *
  	 * @param seriesObj The series object identifying the series to be removed.
  	 */
  def removeSeries(seriesObj: js.Object): Unit
  /**
  	 * Updates the series with the specified name with the specified new property values.
  	 *
  	 * @param value The series object identifying the series to be updated.
  	 */
  def updateSeries(value: js.Object): Unit
}

object IgDoughnutChartMethods {
  @scala.inline
  def apply(
    addSeries: js.Object => Callback,
    destroy: Callback,
    exportVisualData: CallbackTo[js.Object],
    flush: Callback,
    getCenterCoordinates: CallbackTo[js.Object],
    getData: String => CallbackTo[js.Object],
    getHoleRadius: CallbackTo[Double],
    removeSeries: js.Object => Callback,
    updateSeries: js.Object => Callback
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addSeries")(js.Any.fromFunction1((t0: js.Object) => addSeries(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("exportVisualData")(exportVisualData.toJsFn)
    __obj.updateDynamic("flush")(flush.toJsFn)
    __obj.updateDynamic("getCenterCoordinates")(getCenterCoordinates.toJsFn)
    __obj.updateDynamic("getData")(js.Any.fromFunction1((t0: java.lang.String) => getData(t0).runNow()))
    __obj.updateDynamic("getHoleRadius")(getHoleRadius.toJsFn)
    __obj.updateDynamic("removeSeries")(js.Any.fromFunction1((t0: js.Object) => removeSeries(t0).runNow()))
    __obj.updateDynamic("updateSeries")(js.Any.fromFunction1((t0: js.Object) => updateSeries(t0).runNow()))
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
}

