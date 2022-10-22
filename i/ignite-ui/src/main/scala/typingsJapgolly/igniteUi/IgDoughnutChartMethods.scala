package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgDoughnutChartMethods extends StObject {
  
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
  
  inline def apply(
    addSeries: js.Object => Callback,
    destroy: Callback,
    exportVisualData: CallbackTo[js.Object],
    flush: Callback,
    getCenterCoordinates: CallbackTo[js.Object],
    getData: String => js.Object,
    getHoleRadius: CallbackTo[Double],
    removeSeries: js.Object => Callback,
    updateSeries: js.Object => Callback
  ): IgDoughnutChartMethods = {
    val __obj = js.Dynamic.literal(addSeries = js.Any.fromFunction1((t0: js.Object) => addSeries(t0).runNow()), destroy = destroy.toJsFn, exportVisualData = exportVisualData.toJsFn, flush = flush.toJsFn, getCenterCoordinates = getCenterCoordinates.toJsFn, getData = js.Any.fromFunction1(getData), getHoleRadius = getHoleRadius.toJsFn, removeSeries = js.Any.fromFunction1((t0: js.Object) => removeSeries(t0).runNow()), updateSeries = js.Any.fromFunction1((t0: js.Object) => updateSeries(t0).runNow()))
    __obj.asInstanceOf[IgDoughnutChartMethods]
  }
  
  extension [Self <: IgDoughnutChartMethods](x: Self) {
    
    inline def setAddSeries(value: js.Object => Callback): Self = StObject.set(x, "addSeries", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExportVisualData(value: CallbackTo[js.Object]): Self = StObject.set(x, "exportVisualData", value.toJsFn)
    
    inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
    
    inline def setGetCenterCoordinates(value: CallbackTo[js.Object]): Self = StObject.set(x, "getCenterCoordinates", value.toJsFn)
    
    inline def setGetData(value: String => js.Object): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setGetHoleRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getHoleRadius", value.toJsFn)
    
    inline def setRemoveSeries(value: js.Object => Callback): Self = StObject.set(x, "removeSeries", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setUpdateSeries(value: js.Object => Callback): Self = StObject.set(x, "updateSeries", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
