package typingsJapgolly.rotJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerSpeedMod {
  
  @JSImport("rot-js/lib/scheduler/speed", JSImport.Default)
  @js.native
  open class default[T /* <: SpeedActor */] () extends Speed[T]
  
  @js.native
  trait Speed[T /* <: SpeedActor */]
    extends typingsJapgolly.rotJs.libSchedulerSchedulerMod.default[T] {
    
    def add(item: T, repeat: Boolean, time: Double): this.type = js.native
  }
  
  trait SpeedActor extends StObject {
    
    def getSpeed(): Double
  }
  object SpeedActor {
    
    inline def apply(getSpeed: CallbackTo[Double]): SpeedActor = {
      val __obj = js.Dynamic.literal(getSpeed = getSpeed.toJsFn)
      __obj.asInstanceOf[SpeedActor]
    }
    
    extension [Self <: SpeedActor](x: Self) {
      
      inline def setGetSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "getSpeed", value.toJsFn)
    }
  }
}
