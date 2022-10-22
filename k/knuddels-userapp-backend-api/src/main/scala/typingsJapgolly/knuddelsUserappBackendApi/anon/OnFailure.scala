package typingsJapgolly.knuddelsUserappBackendApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappBackendApi.mod.global.ExternalServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFailure extends StObject {
  
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}
object OnFailure {
  
  inline def apply(): OnFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFailure]
  }
  
  extension [Self <: OnFailure](x: Self) {
    
    inline def setOnFailure(
      value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback
    ): Self = StObject.set(x, "onFailure", js.Any.fromFunction2((t0: /* responseData */ String, t1: /* externalServerResponse */ ExternalServerResponse) => (value(t0, t1)).runNow()))
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(
      value: (/* responseData */ String, /* externalServerResponse */ ExternalServerResponse) => Callback
    ): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* responseData */ String, t1: /* externalServerResponse */ ExternalServerResponse) => (value(t0, t1)).runNow()))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
