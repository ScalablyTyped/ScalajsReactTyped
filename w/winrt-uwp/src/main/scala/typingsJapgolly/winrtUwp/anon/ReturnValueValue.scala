package typingsJapgolly.winrtUwp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnValueValue extends StObject {
  
  /** Returns true if the method succeeds, or false otherwise. */ var returnValue: Boolean
  
  /** The current value of the setting. The units depend on the setting. */ var value: Double
}
object ReturnValueValue {
  
  inline def apply(returnValue: Boolean, value: Double): ReturnValueValue = {
    val __obj = js.Dynamic.literal(returnValue = returnValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValueValue]
  }
  
  extension [Self <: ReturnValueValue](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
