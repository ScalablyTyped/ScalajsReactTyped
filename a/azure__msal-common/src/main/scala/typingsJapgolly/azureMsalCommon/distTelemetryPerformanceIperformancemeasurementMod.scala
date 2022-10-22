package typingsJapgolly.azureMsalCommon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryPerformanceIperformancemeasurementMod {
  
  trait IPerformanceMeasurement extends StObject {
    
    def endMeasurement(): Unit
    
    def flushMeasurement(): Double | Null
    
    def startMeasurement(): Unit
  }
  object IPerformanceMeasurement {
    
    inline def apply(endMeasurement: Callback, flushMeasurement: CallbackTo[Double | Null], startMeasurement: Callback): IPerformanceMeasurement = {
      val __obj = js.Dynamic.literal(endMeasurement = endMeasurement.toJsFn, flushMeasurement = flushMeasurement.toJsFn, startMeasurement = startMeasurement.toJsFn)
      __obj.asInstanceOf[IPerformanceMeasurement]
    }
    
    extension [Self <: IPerformanceMeasurement](x: Self) {
      
      inline def setEndMeasurement(value: Callback): Self = StObject.set(x, "endMeasurement", value.toJsFn)
      
      inline def setFlushMeasurement(value: CallbackTo[Double | Null]): Self = StObject.set(x, "flushMeasurement", value.toJsFn)
      
      inline def setStartMeasurement(value: Callback): Self = StObject.set(x, "startMeasurement", value.toJsFn)
    }
  }
}
