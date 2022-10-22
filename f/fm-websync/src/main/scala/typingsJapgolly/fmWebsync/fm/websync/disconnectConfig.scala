package typingsJapgolly.fmWebsync.fm.websync

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait disconnectConfig
  extends StObject
     with baseRequestConfig {
  
  /**
    * The callback to invoke after onSuccess or onFailure. See disconnectCompleteArgs for callback argument details.
    */
  var onComplete: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the disconnect fails. See disconnectFailureArgs for callback argument details.
    */
  var onFailure: js.UndefOr[js.Function1[/* args */ baseFailureArgs, Unit]] = js.undefined
  
  /**
    * The callback to invoke if the disconnect succeeds. See disconnectSuccessArgs for callback argument details.
    */
  var onSuccess: js.UndefOr[js.Function1[/* args */ baseResponseArgs, Unit]] = js.undefined
}
object disconnectConfig {
  
  inline def apply(): disconnectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[disconnectConfig]
  }
  
  extension [Self <: disconnectConfig](x: Self) {
    
    inline def setOnComplete(value: /* args */ baseResponseArgs => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* args */ baseResponseArgs) => value(t0).runNow()))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnFailure(value: /* args */ baseFailureArgs => Callback): Self = StObject.set(x, "onFailure", js.Any.fromFunction1((t0: /* args */ baseFailureArgs) => value(t0).runNow()))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: /* args */ baseResponseArgs => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* args */ baseResponseArgs) => value(t0).runNow()))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
