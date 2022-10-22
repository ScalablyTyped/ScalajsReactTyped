package typingsJapgolly.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PingOption extends StObject {
  
  var freq: js.UndefOr[Double] = js.undefined
  
  var pin: Double | String
  
  var pulse: js.UndefOr[Double] = js.undefined
}
object PingOption {
  
  inline def apply(pin: Double | String): PingOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingOption]
  }
  
  extension [Self <: PingOption](x: Self) {
    
    inline def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
    
    inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPulse(value: Double): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    inline def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
  }
}
