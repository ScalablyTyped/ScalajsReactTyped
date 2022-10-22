package typingsJapgolly.knuddelsUserappBackendApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappBackendApi.mod.global.KnuddelTransferDisplayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayReasonText extends StObject {
  
  var displayReasonText: js.UndefOr[String] = js.undefined
  
  var onError: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var transferDisplayType: js.UndefOr[KnuddelTransferDisplayType] = js.undefined
}
object DisplayReasonText {
  
  inline def apply(): DisplayReasonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayReasonText]
  }
  
  extension [Self <: DisplayReasonText](x: Self) {
    
    inline def setDisplayReasonText(value: String): Self = StObject.set(x, "displayReasonText", value.asInstanceOf[js.Any])
    
    inline def setDisplayReasonTextUndefined: Self = StObject.set(x, "displayReasonText", js.undefined)
    
    inline def setOnError(value: /* message */ String => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: Callback): Self = StObject.set(x, "onSuccess", value.toJsFn)
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setTransferDisplayType(value: KnuddelTransferDisplayType): Self = StObject.set(x, "transferDisplayType", value.asInstanceOf[js.Any])
    
    inline def setTransferDisplayTypeUndefined: Self = StObject.set(x, "transferDisplayType", js.undefined)
  }
}
