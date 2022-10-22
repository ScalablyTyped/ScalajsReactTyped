package typingsJapgolly.ky

import org.scalajs.dom.AbortController
import org.scalajs.dom.Request
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.ky.anon.FnCall
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionUtilsTimeMod {
  
  @JSImport("ky/distribution/utils/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def timeout(request: Request, abortController: AbortController, options: TimeoutOptions): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(request.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  inline def timeout(request: Request, abortController: Unit, options: TimeoutOptions): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(request.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  trait TimeoutOptions extends StObject {
    
    def fetch(input: URL): js.Promise[Response]
    def fetch(input: URL, init: RequestInit): js.Promise[Response]
    def fetch(input: RequestInfo): js.Promise[Response]
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response]
    @JSName("fetch")
    var fetch_Original: FnCall
    
    var timeout: Double
  }
  object TimeoutOptions {
    
    inline def apply(fetch: FnCall, timeout: Double): TimeoutOptions = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeoutOptions]
    }
    
    extension [Self <: TimeoutOptions](x: Self) {
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
