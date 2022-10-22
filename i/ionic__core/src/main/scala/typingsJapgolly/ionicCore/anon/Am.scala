package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Am extends StObject {
  
  var am: Boolean
  
  var hours: js.Array[Double]
  
  var minutes: js.Array[Double]
  
  var pm: Boolean
}
object Am {
  
  inline def apply(am: Boolean, hours: js.Array[Double], minutes: js.Array[Double], pm: Boolean): Am = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Am]
  }
  
  extension [Self <: Am](x: Self) {
    
    inline def setAm(value: Boolean): Self = StObject.set(x, "am", value.asInstanceOf[js.Any])
    
    inline def setHours(value: js.Array[Double]): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursVarargs(value: Double*): Self = StObject.set(x, "hours", js.Array(value*))
    
    inline def setMinutes(value: js.Array[Double]): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesVarargs(value: Double*): Self = StObject.set(x, "minutes", js.Array(value*))
    
    inline def setPm(value: Boolean): Self = StObject.set(x, "pm", value.asInstanceOf[js.Any])
  }
}
