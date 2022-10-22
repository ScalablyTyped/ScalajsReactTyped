package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pulse extends StObject {
  
  def pulse(value: Double, duration: Double): js.Promise[Boolean]
}
object Pulse {
  
  inline def apply(pulse: (Double, Double) => js.Promise[Boolean]): Pulse = {
    val __obj = js.Dynamic.literal(pulse = js.Any.fromFunction2(pulse))
    __obj.asInstanceOf[Pulse]
  }
  
  extension [Self <: Pulse](x: Self) {
    
    inline def setPulse(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "pulse", js.Any.fromFunction2(value))
  }
}
