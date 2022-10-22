package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomMinMaxConfig
  extends StObject
     with _EmitterOpOnEmitType {
  
  /**
    * The maximum value.
    */
  var max: Double
  
  /**
    * The minimum value.
    */
  var min: Double
}
object EmitterOpRandomMinMaxConfig {
  
  inline def apply(max: Double, min: Double): EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomMinMaxConfig]
  }
  
  extension [Self <: EmitterOpRandomMinMaxConfig](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
