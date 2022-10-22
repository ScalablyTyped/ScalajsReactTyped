package typingsJapgolly.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyboardCapabilities extends StObject {
  
  var keyboardPresent: Double
}
object IKeyboardCapabilities {
  
  inline def apply(keyboardPresent: Double): IKeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyboardCapabilities]
  }
  
  extension [Self <: IKeyboardCapabilities](x: Self) {
    
    inline def setKeyboardPresent(value: Double): Self = StObject.set(x, "keyboardPresent", value.asInstanceOf[js.Any])
  }
}
