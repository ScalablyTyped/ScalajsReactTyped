package typingsJapgolly.foundation.Foundation

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/alert_boxes.html
trait AlertOptions extends StObject {
  
  var callback: js.UndefOr[js.Function0[Any]] = js.undefined
}
object AlertOptions {
  
  inline def apply(): AlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertOptions]
  }
  
  extension [Self <: AlertOptions](x: Self) {
    
    inline def setCallback(value: CallbackTo[Any]): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
