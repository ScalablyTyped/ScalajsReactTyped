package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTimeBased
  extends StObject
     with XInterface {
  
  def setRange(start: Double, end: Double): Unit
  
  /**
    * point is the zero based index into the time based array
    * @returns FALSE if the point is outside of the supported array
    */
  def setToPointInTime(point: Double): Boolean
  
  /** @returns FALSE if the data wrapped around */
  def switchToNext(wrap: Boolean): Boolean
}
object XTimeBased {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setRange: (Double, Double) => Callback,
    setToPointInTime: Double => Boolean,
    switchToNext: Boolean => Boolean
  ): XTimeBased = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setRange = js.Any.fromFunction2((t0: Double, t1: Double) => (setRange(t0, t1)).runNow()), setToPointInTime = js.Any.fromFunction1(setToPointInTime), switchToNext = js.Any.fromFunction1(switchToNext))
    __obj.asInstanceOf[XTimeBased]
  }
  
  extension [Self <: XTimeBased](x: Self) {
    
    inline def setSetRange(value: (Double, Double) => Callback): Self = StObject.set(x, "setRange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetToPointInTime(value: Double => Boolean): Self = StObject.set(x, "setToPointInTime", js.Any.fromFunction1(value))
    
    inline def setSwitchToNext(value: Boolean => Boolean): Self = StObject.set(x, "switchToNext", js.Any.fromFunction1(value))
  }
}
