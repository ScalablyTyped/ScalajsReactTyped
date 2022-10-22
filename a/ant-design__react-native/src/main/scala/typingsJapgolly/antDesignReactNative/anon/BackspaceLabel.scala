package typingsJapgolly.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackspaceLabel extends StObject {
  
  /** 退格 */
  var backspaceLabel: String
  
  /** 收起键盘 */
  var cancelKeyboardLabel: String
  
  /** 确定 */
  var confirmLabel: String
}
object BackspaceLabel {
  
  inline def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): BackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackspaceLabel]
  }
  
  extension [Self <: BackspaceLabel](x: Self) {
    
    inline def setBackspaceLabel(value: String): Self = StObject.set(x, "backspaceLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelKeyboardLabel(value: String): Self = StObject.set(x, "cancelKeyboardLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmLabel(value: String): Self = StObject.set(x, "confirmLabel", value.asInstanceOf[js.Any])
  }
}
