package typingsJapgolly.iabVpaid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.iabVpaid.iab.vpaid.VpaidCreative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  /** VPAID entry point */
  var getVPAIDAd: js.UndefOr[js.Function0[VpaidCreative]] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setGetVPAIDAd(value: CallbackTo[VpaidCreative]): Self = StObject.set(x, "getVPAIDAd", value.toJsFn)
    
    inline def setGetVPAIDAdUndefined: Self = StObject.set(x, "getVPAIDAd", js.undefined)
  }
}
