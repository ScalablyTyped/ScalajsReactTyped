package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.WaitingPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofWaitingPopup extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: WaitingPopup
}
object TypeofWaitingPopup {
  
  inline def apply(Locale: Any, fn: WaitingPopup): TypeofWaitingPopup = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofWaitingPopup]
  }
  
  extension [Self <: TypeofWaitingPopup](x: Self) {
    
    inline def setFn(value: WaitingPopup): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
