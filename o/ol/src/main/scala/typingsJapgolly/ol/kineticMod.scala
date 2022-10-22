package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kineticMod {
  
  @JSImport("ol/Kinetic", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Kinetic {
    def this(decay: Double, minVelocity: Double, delay: Double) = this()
    
    /**
      * FIXME empty description for jsdoc
      */
    /* CompleteClass */
    override def begin(): Unit = js.native
    
    /* CompleteClass */
    override def end(): Boolean = js.native
    
    /* CompleteClass */
    override def getAngle(): Double = js.native
    
    /* CompleteClass */
    override def getDistance(): Double = js.native
    
    /* CompleteClass */
    override def update(x: Double, y: Double): Unit = js.native
  }
  
  trait Kinetic extends StObject {
    
    /**
      * FIXME empty description for jsdoc
      */
    def begin(): Unit
    
    def end(): Boolean
    
    def getAngle(): Double
    
    def getDistance(): Double
    
    def update(x: Double, y: Double): Unit
  }
  object Kinetic {
    
    inline def apply(
      begin: Callback,
      end: CallbackTo[Boolean],
      getAngle: CallbackTo[Double],
      getDistance: CallbackTo[Double],
      update: (Double, Double) => Callback
    ): Kinetic = {
      val __obj = js.Dynamic.literal(begin = begin.toJsFn, end = end.toJsFn, getAngle = getAngle.toJsFn, getDistance = getDistance.toJsFn, update = js.Any.fromFunction2((t0: Double, t1: Double) => (update(t0, t1)).runNow()))
      __obj.asInstanceOf[Kinetic]
    }
    
    extension [Self <: Kinetic](x: Self) {
      
      inline def setBegin(value: Callback): Self = StObject.set(x, "begin", value.toJsFn)
      
      inline def setEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setGetAngle(value: CallbackTo[Double]): Self = StObject.set(x, "getAngle", value.toJsFn)
      
      inline def setGetDistance(value: CallbackTo[Double]): Self = StObject.set(x, "getDistance", value.toJsFn)
      
      inline def setUpdate(value: (Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
}
