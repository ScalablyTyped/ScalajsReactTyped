package typingsJapgolly.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddMeasurementToCache extends StObject {
  
  /**
    * Should be called whenever there is a new measurement associated with a given data object.
    * If the data has a cacheKey, store that measurement in the measurementsCache.
    */
  def addMeasurementToCache(data: Any, measurement: Double): scala.Unit
  
  /**
    * Checks if the provided data has a cacheKey. If it has a cacheKey and there is a
    * corresponding entry in the measurementsCache, then it will return that value.
    * Returns undefined otherwise.
    */
  def getCachedMeasurement(data: Any): js.UndefOr[Double]
}
object AddMeasurementToCache {
  
  inline def apply(
    addMeasurementToCache: (Any, Double) => japgolly.scalajs.react.Callback,
    getCachedMeasurement: Any => js.UndefOr[Double]
  ): AddMeasurementToCache = {
    val __obj = js.Dynamic.literal(addMeasurementToCache = js.Any.fromFunction2((t0: Any, t1: Double) => (addMeasurementToCache(t0, t1)).runNow()), getCachedMeasurement = js.Any.fromFunction1(getCachedMeasurement))
    __obj.asInstanceOf[AddMeasurementToCache]
  }
  
  extension [Self <: AddMeasurementToCache](x: Self) {
    
    inline def setAddMeasurementToCache(value: (Any, Double) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "addMeasurementToCache", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGetCachedMeasurement(value: Any => js.UndefOr[Double]): Self = StObject.set(x, "getCachedMeasurement", js.Any.fromFunction1(value))
  }
}
