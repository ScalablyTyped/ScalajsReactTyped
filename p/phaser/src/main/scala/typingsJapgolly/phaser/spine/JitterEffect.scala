package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JitterEffect
  extends StObject
     with VertexEffect {
  
  var jitterX: Double
  
  var jitterY: Double
}
object JitterEffect {
  
  inline def apply(
    begin: Skeleton => Callback,
    end: Callback,
    jitterX: Double,
    jitterY: Double,
    transform: (Vector2, Vector2, Color, Color) => Callback
  ): JitterEffect = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1((t0: Skeleton) => begin(t0).runNow()), end = end.toJsFn, jitterX = jitterX.asInstanceOf[js.Any], jitterY = jitterY.asInstanceOf[js.Any], transform = js.Any.fromFunction4((t0: Vector2, t1: Vector2, t2: Color, t3: Color) => (transform(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[JitterEffect]
  }
  
  extension [Self <: JitterEffect](x: Self) {
    
    inline def setJitterX(value: Double): Self = StObject.set(x, "jitterX", value.asInstanceOf[js.Any])
    
    inline def setJitterY(value: Double): Self = StObject.set(x, "jitterY", value.asInstanceOf[js.Any])
  }
}
