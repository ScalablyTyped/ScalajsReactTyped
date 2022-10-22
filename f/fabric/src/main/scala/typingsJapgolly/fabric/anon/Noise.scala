package typingsJapgolly.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noise extends StObject {
  
  /** @default 0 */
  var noise: Double
}
object Noise {
  
  inline def apply(noise: Double): Noise = {
    val __obj = js.Dynamic.literal(noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Noise]
  }
  
  extension [Self <: Noise](x: Self) {
    
    inline def setNoise(value: Double): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
  }
}
