package typingsJapgolly.knuddelsUserappBackendApi.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.knuddelsUserappBackendApi.mod.global.ExternalServerResponse
import typingsJapgolly.knuddelsUserappBackendApi.mod.global.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[Json] = js.undefined
  
  var onFailure: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
  
  var onSuccess: js.UndefOr[
    js.Function2[/* responseData */ String, /* externalServerResponse */ ExternalServerResponse, Unit]
  ] = js.undefined
}
object Data {
  
  inline def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: Json): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
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
