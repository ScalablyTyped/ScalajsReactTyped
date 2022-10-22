package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lower extends StObject {
  
  var lower: Double
  
  var upper: Double
}
object Lower {
  
  inline def apply(lower: Double, upper: Double): Lower = {
    val __obj = js.Dynamic.literal(lower = lower.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lower]
  }
  
  extension [Self <: Lower](x: Self) {
    
    inline def setLower(value: Double): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
    
    inline def setUpper(value: Double): Self = StObject.set(x, "upper", value.asInstanceOf[js.Any])
  }
}
