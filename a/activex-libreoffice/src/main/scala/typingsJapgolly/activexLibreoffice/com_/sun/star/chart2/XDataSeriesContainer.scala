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

trait XDataSeriesContainer
  extends StObject
     with XInterface {
  
  /** retrieve all data series */
  var DataSeries: SafeArray[XDataSeries]
  
  /**
    * add a data series to the data series container
    * @throws IllegalArgumentException If the given data series is already contained in the data series container.
    */
  def addDataSeries(aDataSeries: XDataSeries): Unit
  
  /** retrieve all data series */
  def getDataSeries(): SafeArray[XDataSeries]
  
  /** removes one data series from the data series container. */
  def removeDataSeries(aDataSeries: XDataSeries): Unit
  
  /** set all data series */
  def setDataSeries(aDataSeries: SeqEquiv[XDataSeries]): Unit
}
object XDataSeriesContainer {
  
  inline def apply(
    DataSeries: SafeArray[XDataSeries],
    acquire: Callback,
    addDataSeries: XDataSeries => Callback,
    getDataSeries: CallbackTo[SafeArray[XDataSeries]],
    queryInterface: `type` => Any,
    release: Callback,
    removeDataSeries: XDataSeries => Callback,
    setDataSeries: SeqEquiv[XDataSeries] => Callback
  ): XDataSeriesContainer = {
    val __obj = js.Dynamic.literal(DataSeries = DataSeries.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDataSeries = js.Any.fromFunction1((t0: XDataSeries) => addDataSeries(t0).runNow()), getDataSeries = getDataSeries.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDataSeries = js.Any.fromFunction1((t0: XDataSeries) => removeDataSeries(t0).runNow()), setDataSeries = js.Any.fromFunction1((t0: SeqEquiv[XDataSeries]) => setDataSeries(t0).runNow()))
    __obj.asInstanceOf[XDataSeriesContainer]
  }
  
  extension [Self <: XDataSeriesContainer](x: Self) {
    
    inline def setAddDataSeries(value: XDataSeries => Callback): Self = StObject.set(x, "addDataSeries", js.Any.fromFunction1((t0: XDataSeries) => value(t0).runNow()))
    
    inline def setDataSeries(value: SafeArray[XDataSeries]): Self = StObject.set(x, "DataSeries", value.asInstanceOf[js.Any])
    
    inline def setGetDataSeries(value: CallbackTo[SafeArray[XDataSeries]]): Self = StObject.set(x, "getDataSeries", value.toJsFn)
    
    inline def setRemoveDataSeries(value: XDataSeries => Callback): Self = StObject.set(x, "removeDataSeries", js.Any.fromFunction1((t0: XDataSeries) => value(t0).runNow()))
    
    inline def setSetDataSeries(value: SeqEquiv[XDataSeries] => Callback): Self = StObject.set(x, "setDataSeries", js.Any.fromFunction1((t0: SeqEquiv[XDataSeries]) => value(t0).runNow()))
  }
}
