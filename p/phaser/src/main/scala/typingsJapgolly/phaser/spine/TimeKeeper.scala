package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeKeeper extends StObject {
  
  var delta: Double
  
  /* private */ var frameCount: Any
  
  /* private */ var frameTime: Any
  
  var framesPerSecond: Double
  
  /* private */ var lastTime: Any
  
  var maxDelta: Double
  
  var totalTime: Double
  
  def update(): Unit
}
object TimeKeeper {
  
  inline def apply(
    delta: Double,
    frameCount: Any,
    frameTime: Any,
    framesPerSecond: Double,
    lastTime: Any,
    maxDelta: Double,
    totalTime: Double,
    update: Callback
  ): TimeKeeper = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], framesPerSecond = framesPerSecond.asInstanceOf[js.Any], lastTime = lastTime.asInstanceOf[js.Any], maxDelta = maxDelta.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], update = update.toJsFn)
    __obj.asInstanceOf[TimeKeeper]
  }
  
  extension [Self <: TimeKeeper](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Any): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrameTime(value: Any): Self = StObject.set(x, "frameTime", value.asInstanceOf[js.Any])
    
    inline def setFramesPerSecond(value: Double): Self = StObject.set(x, "framesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setLastTime(value: Any): Self = StObject.set(x, "lastTime", value.asInstanceOf[js.Any])
    
    inline def setMaxDelta(value: Double): Self = StObject.set(x, "maxDelta", value.asInstanceOf[js.Any])
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
