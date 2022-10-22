package typingsJapgolly.hystrixjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricsFactory_ extends StObject {
  
  def getAllMetrics(): js.Array[CommandMetrics]
  
  def getOrCreate(config: MetricsProperties): CommandMetrics
  
  def resetCache(): Unit
}
object MetricsFactory_ {
  
  inline def apply(
    getAllMetrics: CallbackTo[js.Array[CommandMetrics]],
    getOrCreate: MetricsProperties => CommandMetrics,
    resetCache: Callback
  ): MetricsFactory_ = {
    val __obj = js.Dynamic.literal(getAllMetrics = getAllMetrics.toJsFn, getOrCreate = js.Any.fromFunction1(getOrCreate), resetCache = resetCache.toJsFn)
    __obj.asInstanceOf[MetricsFactory_]
  }
  
  extension [Self <: MetricsFactory_](x: Self) {
    
    inline def setGetAllMetrics(value: CallbackTo[js.Array[CommandMetrics]]): Self = StObject.set(x, "getAllMetrics", value.toJsFn)
    
    inline def setGetOrCreate(value: MetricsProperties => CommandMetrics): Self = StObject.set(x, "getOrCreate", js.Any.fromFunction1(value))
    
    inline def setResetCache(value: Callback): Self = StObject.set(x, "resetCache", value.toJsFn)
  }
}
