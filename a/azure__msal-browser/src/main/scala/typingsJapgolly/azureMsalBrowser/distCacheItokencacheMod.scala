package typingsJapgolly.azureMsalBrowser

import japgolly.scalajs.react.Callback
import typingsJapgolly.azureMsalBrowser.distCacheTokenCacheMod.LoadTokenOptions
import typingsJapgolly.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
import typingsJapgolly.azureMsalCommon.distResponseExternalTokenResponseMod.ExternalTokenResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheItokencacheMod {
  
  trait ITokenCache extends StObject {
    
    /** API to side-load tokens to MSAL cache */
    def loadExternalTokens(request: SilentRequest, response: ExternalTokenResponse, options: LoadTokenOptions): Unit
  }
  object ITokenCache {
    
    inline def apply(loadExternalTokens: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => Callback): ITokenCache = {
      val __obj = js.Dynamic.literal(loadExternalTokens = js.Any.fromFunction3((t0: SilentRequest, t1: ExternalTokenResponse, t2: LoadTokenOptions) => (loadExternalTokens(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ITokenCache]
    }
    
    extension [Self <: ITokenCache](x: Self) {
      
      inline def setLoadExternalTokens(value: (SilentRequest, ExternalTokenResponse, LoadTokenOptions) => Callback): Self = StObject.set(x, "loadExternalTokens", js.Any.fromFunction3((t0: SilentRequest, t1: ExternalTokenResponse, t2: LoadTokenOptions) => (value(t0, t1, t2)).runNow()))
    }
  }
}
