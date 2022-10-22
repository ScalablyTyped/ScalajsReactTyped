package typingsJapgolly.activexOutlook.anon

import typingsJapgolly.activexOutlook.Outlook.OlShiftState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyCode extends StObject {
  
  val KeyCode: Double
  
  val Shift: OlShiftState
}
object KeyCode {
  
  inline def apply(KeyCode: Double, Shift: OlShiftState): KeyCode = {
    val __obj = js.Dynamic.literal(KeyCode = KeyCode.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  
  extension [Self <: KeyCode](x: Self) {
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "KeyCode", value.asInstanceOf[js.Any])
    
    inline def setShift(value: OlShiftState): Self = StObject.set(x, "Shift", value.asInstanceOf[js.Any])
  }
}
