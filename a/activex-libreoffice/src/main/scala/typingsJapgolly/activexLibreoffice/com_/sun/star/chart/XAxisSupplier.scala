package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Easier access to the different axes within a chart.
  * @since OOo 3.4
  */
trait XAxisSupplier
  extends StObject
     with XInterface {
  
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the primary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getAxis(nDimensionIndex: Double): XAxis
  
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the secondary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getSecondaryAxis(nDimensionIndex: Double): XAxis
}
object XAxisSupplier {
  
  inline def apply(
    acquire: Callback,
    getAxis: Double => XAxis,
    getSecondaryAxis: Double => XAxis,
    queryInterface: `type` => Any,
    release: Callback
  ): XAxisSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getAxis = js.Any.fromFunction1(getAxis), getSecondaryAxis = js.Any.fromFunction1(getSecondaryAxis), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAxisSupplier]
  }
  
  extension [Self <: XAxisSupplier](x: Self) {
    
    inline def setGetAxis(value: Double => XAxis): Self = StObject.set(x, "getAxis", js.Any.fromFunction1(value))
    
    inline def setGetSecondaryAxis(value: Double => XAxis): Self = StObject.set(x, "getSecondaryAxis", js.Any.fromFunction1(value))
  }
}
