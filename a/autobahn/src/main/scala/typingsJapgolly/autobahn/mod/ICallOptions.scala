package typingsJapgolly.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICallOptions extends StObject {
  
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  
  var receive_progress: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ICallOptions {
  
  inline def apply(): ICallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICallOptions]
  }
  
  extension [Self <: ICallOptions](x: Self) {
    
    inline def setDisclose_me(value: Boolean): Self = StObject.set(x, "disclose_me", value.asInstanceOf[js.Any])
    
    inline def setDisclose_meUndefined: Self = StObject.set(x, "disclose_me", js.undefined)
    
    inline def setReceive_progress(value: Boolean): Self = StObject.set(x, "receive_progress", value.asInstanceOf[js.Any])
    
    inline def setReceive_progressUndefined: Self = StObject.set(x, "receive_progress", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
