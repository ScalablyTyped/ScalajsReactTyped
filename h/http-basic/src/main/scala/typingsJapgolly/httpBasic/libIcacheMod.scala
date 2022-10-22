package typingsJapgolly.httpBasic

import typingsJapgolly.httpBasic.anon.PickCachedResponseheaders
import typingsJapgolly.httpBasic.libCachedResponseMod.CachedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcacheMod {
  
  @js.native
  trait ICache extends StObject {
    
    def getResponse(
      url: String,
      cb: js.Function2[/* err */ js.Error | Null, /* response */ CachedResponse | Null, Unit]
    ): Unit = js.native
    
    def invalidateResponse(url: String, cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    
    def setResponse(url: String): Unit = js.native
    def setResponse(url: String, response: CachedResponse): Unit = js.native
    
    var updateResponseHeaders: js.UndefOr[js.Function2[/* url */ String, /* response */ PickCachedResponseheaders, Unit]] = js.native
  }
}
