package typingsJapgolly.amapJsApiMap3d.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Lights {
  
  trait AmbientLight extends StObject {
    
    def setColor(color: js.Tuple3[Double, Double, Double]): Unit
    
    def setIntensity(intensity: Double): Unit
  }
  object AmbientLight {
    
    inline def apply(setColor: js.Tuple3[Double, Double, Double] => Callback, setIntensity: Double => Callback): AmbientLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => setColor(t0).runNow()), setIntensity = js.Any.fromFunction1((t0: Double) => setIntensity(t0).runNow()))
      __obj.asInstanceOf[AmbientLight]
    }
    
    extension [Self <: AmbientLight](x: Self) {
      
      inline def setSetColor(value: js.Tuple3[Double, Double, Double] => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => value(t0).runNow()))
      
      inline def setSetIntensity(value: Double => Callback): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait DirectionLight extends StObject {
    
    def setColor(direction: js.Tuple3[Double, Double, Double]): Unit
    
    def setDirection(direction: js.Tuple3[Double, Double, Double]): Unit
    
    def setIntensity(intensity: Double): Unit
    
    def update(): Unit
  }
  object DirectionLight {
    
    inline def apply(
      setColor: js.Tuple3[Double, Double, Double] => Callback,
      setDirection: js.Tuple3[Double, Double, Double] => Callback,
      setIntensity: Double => Callback,
      update: Callback
    ): DirectionLight = {
      val __obj = js.Dynamic.literal(setColor = js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => setColor(t0).runNow()), setDirection = js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => setDirection(t0).runNow()), setIntensity = js.Any.fromFunction1((t0: Double) => setIntensity(t0).runNow()), update = update.toJsFn)
      __obj.asInstanceOf[DirectionLight]
    }
    
    extension [Self <: DirectionLight](x: Self) {
      
      inline def setSetColor(value: js.Tuple3[Double, Double, Double] => Callback): Self = StObject.set(x, "setColor", js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => value(t0).runNow()))
      
      inline def setSetDirection(value: js.Tuple3[Double, Double, Double] => Callback): Self = StObject.set(x, "setDirection", js.Any.fromFunction1((t0: js.Tuple3[Double, Double, Double]) => value(t0).runNow()))
      
      inline def setSetIntensity(value: Double => Callback): Self = StObject.set(x, "setIntensity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
}
