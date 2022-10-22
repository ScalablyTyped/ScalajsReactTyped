package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A data series represents the object that has all the knowledge to be rendered as a visual data series. */
trait XDataSeries
  extends StObject
     with XInterface {
  
  /**
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getDataPointByIndex(nIndex: Double): XPropertySet
  
  /** all data point formatting are cleared */
  def resetAllDataPoints(): Unit
  
  /**
    * the formatting of the specified data point is cleared
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    */
  def resetDataPoint(nIndex: Double): Unit
}
object XDataSeries {
  
  inline def apply(
    acquire: Callback,
    getDataPointByIndex: Double => XPropertySet,
    queryInterface: `type` => Any,
    release: Callback,
    resetAllDataPoints: Callback,
    resetDataPoint: Double => Callback
  ): XDataSeries = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDataPointByIndex = js.Any.fromFunction1(getDataPointByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetAllDataPoints = resetAllDataPoints.toJsFn, resetDataPoint = js.Any.fromFunction1((t0: Double) => resetDataPoint(t0).runNow()))
    __obj.asInstanceOf[XDataSeries]
  }
  
  extension [Self <: XDataSeries](x: Self) {
    
    inline def setGetDataPointByIndex(value: Double => XPropertySet): Self = StObject.set(x, "getDataPointByIndex", js.Any.fromFunction1(value))
    
    inline def setResetAllDataPoints(value: Callback): Self = StObject.set(x, "resetAllDataPoints", value.toJsFn)
    
    inline def setResetDataPoint(value: Double => Callback): Self = StObject.set(x, "resetDataPoint", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
