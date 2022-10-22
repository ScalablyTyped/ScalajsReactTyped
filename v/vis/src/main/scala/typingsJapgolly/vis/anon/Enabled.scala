package typingsJapgolly.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: Boolean
  
  var forceDirection: js.UndefOr[String | Boolean] = js.undefined
  
  var roundness: Double
  
  var `type`: String
}
object Enabled {
  
  inline def apply(enabled: Boolean, roundness: Double, `type`: String): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], roundness = roundness.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setForceDirection(value: String | Boolean): Self = StObject.set(x, "forceDirection", value.asInstanceOf[js.Any])
    
    inline def setForceDirectionUndefined: Self = StObject.set(x, "forceDirection", js.undefined)
    
    inline def setRoundness(value: Double): Self = StObject.set(x, "roundness", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
