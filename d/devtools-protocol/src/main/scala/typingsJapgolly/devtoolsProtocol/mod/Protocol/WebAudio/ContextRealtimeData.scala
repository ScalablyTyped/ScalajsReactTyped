package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextRealtimeData extends StObject {
  
  /**
    * A running mean of callback interval.
    */
  var callbackIntervalMean: Double
  
  /**
    * A running variance of callback interval.
    */
  var callbackIntervalVariance: Double
  
  /**
    * The current context time in second in BaseAudioContext.
    */
  var currentTime: Double
  
  /**
    * The time spent on rendering graph divided by render quantum duration,
    * and multiplied by 100. 100 means the audio renderer reached the full
    * capacity and glitch may occur.
    */
  var renderCapacity: Double
}
object ContextRealtimeData {
  
  inline def apply(
    callbackIntervalMean: Double,
    callbackIntervalVariance: Double,
    currentTime: Double,
    renderCapacity: Double
  ): ContextRealtimeData = {
    val __obj = js.Dynamic.literal(callbackIntervalMean = callbackIntervalMean.asInstanceOf[js.Any], callbackIntervalVariance = callbackIntervalVariance.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], renderCapacity = renderCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextRealtimeData]
  }
  
  extension [Self <: ContextRealtimeData](x: Self) {
    
    inline def setCallbackIntervalMean(value: Double): Self = StObject.set(x, "callbackIntervalMean", value.asInstanceOf[js.Any])
    
    inline def setCallbackIntervalVariance(value: Double): Self = StObject.set(x, "callbackIntervalVariance", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setRenderCapacity(value: Double): Self = StObject.set(x, "renderCapacity", value.asInstanceOf[js.Any])
  }
}
