package typingsJapgolly.winrtUwp.Windows.Devices.SmartCards

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a wait time for a requested smart card personal identification number (PIN) reset. */
trait SmartCardPinResetDeferral extends StObject {
  
  /** Returns a wait time completion for a smart card personal identification number (PIN) reset. */
  def complete(): Unit
}
object SmartCardPinResetDeferral {
  
  inline def apply(complete: Callback): SmartCardPinResetDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[SmartCardPinResetDeferral]
  }
  
  extension [Self <: SmartCardPinResetDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}
