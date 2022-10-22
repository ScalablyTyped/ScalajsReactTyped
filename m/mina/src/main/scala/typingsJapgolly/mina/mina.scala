package typingsJapgolly.mina

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mina {
  
  @js.native
  trait AnimationDescriptor extends StObject {
    
    var b: Double = js.native
    
    var dur: Double = js.native
    
    def duration(): Double = js.native
    def duration(newDuration: Double): Unit = js.native
    
    def easing(input: Double): Double = js.native
    
    var end: Double = js.native
    
    def get(): Double = js.native
    
    var id: String = js.native
    
    def pause(): Unit = js.native
    
    def resume(): Unit = js.native
    
    var s: Double = js.native
    
    def set(slave: Double): Double = js.native
    
    var spd: Double = js.native
    
    def speed(): Double = js.native
    def speed(newSpeed: Double): Unit = js.native
    
    var start: Double = js.native
    
    def status(): Double = js.native
    def status(newStatus: Double): Unit = js.native
    
    def stop(): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  trait MinaAnimation extends StObject {
    
    def duration(): Double
    
    def easing(): Double
    
    var id: String
    
    def speed(): Double
    
    def status(): Double
    
    def stop(): Unit
  }
  object MinaAnimation {
    
    inline def apply(
      duration: CallbackTo[Double],
      easing: CallbackTo[Double],
      id: String,
      speed: CallbackTo[Double],
      status: CallbackTo[Double],
      stop: Callback
    ): MinaAnimation = {
      val __obj = js.Dynamic.literal(duration = duration.toJsFn, easing = easing.toJsFn, id = id.asInstanceOf[js.Any], speed = speed.toJsFn, status = status.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[MinaAnimation]
    }
    
    extension [Self <: MinaAnimation](x: Self) {
      
      inline def setDuration(value: CallbackTo[Double]): Self = StObject.set(x, "duration", value.toJsFn)
      
      inline def setEasing(value: CallbackTo[Double]): Self = StObject.set(x, "easing", value.toJsFn)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "speed", value.toJsFn)
      
      inline def setStatus(value: CallbackTo[Double]): Self = StObject.set(x, "status", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
