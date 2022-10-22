package typingsJapgolly.johnnyFive.mod

import typingsJapgolly.johnnyFive.johnnyFiveStrings.NC
import typingsJapgolly.johnnyFive.johnnyFiveStrings.NO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchOption extends StObject {
  
  var pin: Double | String
  
  var `type`: js.UndefOr[NO | NC] = js.undefined
}
object SwitchOption {
  
  inline def apply(pin: Double | String): SwitchOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchOption]
  }
  
  extension [Self <: SwitchOption](x: Self) {
    
    inline def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setType(value: NO | NC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
