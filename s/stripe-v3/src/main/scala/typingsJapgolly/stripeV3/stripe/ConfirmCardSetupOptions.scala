package typingsJapgolly.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmCardSetupOptions extends StObject {
  
  /*
    * Set this to false if you want to handle next actions yourself, or if
    * you want to defer next action handling until later (e.g. for use in
    * the PaymentRequest API). Default is true.
    */
  var handleActions: js.UndefOr[Boolean] = js.undefined
}
object ConfirmCardSetupOptions {
  
  inline def apply(): ConfirmCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmCardSetupOptions]
  }
  
  extension [Self <: ConfirmCardSetupOptions](x: Self) {
    
    inline def setHandleActions(value: Boolean): Self = StObject.set(x, "handleActions", value.asInstanceOf[js.Any])
    
    inline def setHandleActionsUndefined: Self = StObject.set(x, "handleActions", js.undefined)
  }
}
