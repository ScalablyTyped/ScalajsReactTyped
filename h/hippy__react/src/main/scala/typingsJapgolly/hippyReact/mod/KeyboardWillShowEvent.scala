package typingsJapgolly.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardWillShowEvent extends StObject {
  
  var keyboardHeight: Double
}
object KeyboardWillShowEvent {
  
  inline def apply(keyboardHeight: Double): KeyboardWillShowEvent = {
    val __obj = js.Dynamic.literal(keyboardHeight = keyboardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardWillShowEvent]
  }
  
  extension [Self <: KeyboardWillShowEvent](x: Self) {
    
    inline def setKeyboardHeight(value: Double): Self = StObject.set(x, "keyboardHeight", value.asInstanceOf[js.Any])
  }
}
