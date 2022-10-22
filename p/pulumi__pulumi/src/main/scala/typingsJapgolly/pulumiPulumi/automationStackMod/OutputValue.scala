package typingsJapgolly.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputValue extends StObject {
  
  var secret: Boolean
  
  var value: Any
}
object OutputValue {
  
  inline def apply(secret: Boolean, value: Any): OutputValue = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputValue]
  }
  
  extension [Self <: OutputValue](x: Self) {
    
    inline def setSecret(value: Boolean): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
