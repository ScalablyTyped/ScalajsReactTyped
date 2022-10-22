package typingsJapgolly.fbt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtHookRegistrations extends StObject {
  
  var errorListener: js.UndefOr[js.Function1[/* context */ FbtErrorContext, Any]] = js.undefined
  
  var getFbsResult: js.UndefOr[js.Function1[/* input */ FbtResolvedPayload, Any]] = js.undefined
  
  var getFbtResult: js.UndefOr[js.Function1[/* input */ FbtResolvedPayload, Any]] = js.undefined
  
  var getTranslatedInput: js.UndefOr[js.Function1[/* input */ FbtRuntimeCallInput, Any]] = js.undefined
  
  var getViewerContext: js.UndefOr[js.Function0[IntlViewerContext]] = js.undefined
  
  var logImpression: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.undefined
  
  var onTranslationOverride: js.UndefOr[js.Function1[/* hash */ String, Unit]] = js.undefined
}
object FbtHookRegistrations {
  
  inline def apply(): FbtHookRegistrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FbtHookRegistrations]
  }
  
  extension [Self <: FbtHookRegistrations](x: Self) {
    
    inline def setErrorListener(value: /* context */ FbtErrorContext => Any): Self = StObject.set(x, "errorListener", js.Any.fromFunction1(value))
    
    inline def setErrorListenerUndefined: Self = StObject.set(x, "errorListener", js.undefined)
    
    inline def setGetFbsResult(value: /* input */ FbtResolvedPayload => Any): Self = StObject.set(x, "getFbsResult", js.Any.fromFunction1(value))
    
    inline def setGetFbsResultUndefined: Self = StObject.set(x, "getFbsResult", js.undefined)
    
    inline def setGetFbtResult(value: /* input */ FbtResolvedPayload => Any): Self = StObject.set(x, "getFbtResult", js.Any.fromFunction1(value))
    
    inline def setGetFbtResultUndefined: Self = StObject.set(x, "getFbtResult", js.undefined)
    
    inline def setGetTranslatedInput(value: /* input */ FbtRuntimeCallInput => Any): Self = StObject.set(x, "getTranslatedInput", js.Any.fromFunction1(value))
    
    inline def setGetTranslatedInputUndefined: Self = StObject.set(x, "getTranslatedInput", js.undefined)
    
    inline def setGetViewerContext(value: CallbackTo[IntlViewerContext]): Self = StObject.set(x, "getViewerContext", value.toJsFn)
    
    inline def setGetViewerContextUndefined: Self = StObject.set(x, "getViewerContext", js.undefined)
    
    inline def setLogImpression(value: /* hash */ String => Callback): Self = StObject.set(x, "logImpression", js.Any.fromFunction1((t0: /* hash */ String) => value(t0).runNow()))
    
    inline def setLogImpressionUndefined: Self = StObject.set(x, "logImpression", js.undefined)
    
    inline def setOnTranslationOverride(value: /* hash */ String => Callback): Self = StObject.set(x, "onTranslationOverride", js.Any.fromFunction1((t0: /* hash */ String) => value(t0).runNow()))
    
    inline def setOnTranslationOverrideUndefined: Self = StObject.set(x, "onTranslationOverride", js.undefined)
  }
}
