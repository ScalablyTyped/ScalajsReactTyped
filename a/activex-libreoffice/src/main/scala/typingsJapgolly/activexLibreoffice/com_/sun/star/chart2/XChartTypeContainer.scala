package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XChartTypeContainer
  extends StObject
     with XInterface {
  
  /** retrieve all chart types */
  var ChartTypes: SafeArray[XChartType]
  
  /**
    * add a chart type to the chart type container
    * @throws IllegalArgumentException If the given chart type is already contained in the chart type container.
    */
  def addChartType(aChartType: XChartType): Unit
  
  /** retrieve all chart types */
  def getChartTypes(): SafeArray[XChartType]
  
  /** removes one data series from the chart type container. */
  def removeChartType(aChartType: XChartType): Unit
  
  /** set all chart types */
  def setChartTypes(aChartTypes: SeqEquiv[XChartType]): Unit
}
object XChartTypeContainer {
  
  inline def apply(
    ChartTypes: SafeArray[XChartType],
    acquire: Callback,
    addChartType: XChartType => Callback,
    getChartTypes: CallbackTo[SafeArray[XChartType]],
    queryInterface: `type` => Any,
    release: Callback,
    removeChartType: XChartType => Callback,
    setChartTypes: SeqEquiv[XChartType] => Callback
  ): XChartTypeContainer = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addChartType = js.Any.fromFunction1((t0: XChartType) => addChartType(t0).runNow()), getChartTypes = getChartTypes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChartType = js.Any.fromFunction1((t0: XChartType) => removeChartType(t0).runNow()), setChartTypes = js.Any.fromFunction1((t0: SeqEquiv[XChartType]) => setChartTypes(t0).runNow()))
    __obj.asInstanceOf[XChartTypeContainer]
  }
  
  extension [Self <: XChartTypeContainer](x: Self) {
    
    inline def setAddChartType(value: XChartType => Callback): Self = StObject.set(x, "addChartType", js.Any.fromFunction1((t0: XChartType) => value(t0).runNow()))
    
    inline def setChartTypes(value: SafeArray[XChartType]): Self = StObject.set(x, "ChartTypes", value.asInstanceOf[js.Any])
    
    inline def setGetChartTypes(value: CallbackTo[SafeArray[XChartType]]): Self = StObject.set(x, "getChartTypes", value.toJsFn)
    
    inline def setRemoveChartType(value: XChartType => Callback): Self = StObject.set(x, "removeChartType", js.Any.fromFunction1((t0: XChartType) => value(t0).runNow()))
    
    inline def setSetChartTypes(value: SeqEquiv[XChartType] => Callback): Self = StObject.set(x, "setChartTypes", js.Any.fromFunction1((t0: SeqEquiv[XChartType]) => value(t0).runNow()))
  }
}
