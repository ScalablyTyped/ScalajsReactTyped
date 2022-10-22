package typingsJapgolly.chaiJquery

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fast extends StObject {
    
    var fast: Double
    
    var slow: Double
  }
  object Fast {
    
    inline def apply(fast: Double, slow: Double): Fast = {
      val __obj = js.Dynamic.literal(fast = fast.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fast]
    }
    
    extension [Self <: Fast](x: Self) {
      
      inline def setFast(value: Double): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      inline def setSlow(value: Double): Self = StObject.set(x, "slow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interval extends StObject {
    
    /**
      * The rate (in milliseconds) at which animations fire.
      */
    var interval: Double
    
    /**
      * Globally disable all animations.
      */
    var off: Boolean
    
    var speeds: Fast
    
    var step: Any
    
    def stop(): Unit
    
    def tick(): Unit
  }
  object Interval {
    
    inline def apply(interval: Double, off: Boolean, speeds: Fast, step: Any, stop: Callback, tick: Callback): Interval = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], speeds = speeds.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stop = stop.toJsFn, tick = tick.toJsFn)
      __obj.asInstanceOf[Interval]
    }
    
    extension [Self <: Interval](x: Self) {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setOff(value: Boolean): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      inline def setSpeeds(value: Fast): Self = StObject.set(x, "speeds", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Any): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setTick(value: Callback): Self = StObject.set(x, "tick", value.toJsFn)
    }
  }
}
