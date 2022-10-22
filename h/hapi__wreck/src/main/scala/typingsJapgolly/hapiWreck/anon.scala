package typingsJapgolly.hapiWreck

import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Promise<node.http.IncomingMessage> & {  req :node.http.ClientRequest} */
  @js.native
  trait PromiseIncomingMessagereq extends StObject {
    
    /**
      * Attaches a callback for only the rejection of the Promise.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    /* standard es5 */
    def `catch`[TResult](): js.Promise[IncomingMessage | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[IncomingMessage | TResult] = js.native
    
    /**
      * Attaches a callback that is invoked when the Promise is settled (fulfilled or rejected). The
      * resolved value cannot be modified from the callback.
      * @param onfinally The callback to execute when the Promise is settled (fulfilled or rejected).
      * @returns A Promise for the completion of the callback.
      */
    /* standard es2018.promise */
    def `finally`(): js.Promise[IncomingMessage] = js.native
    def `finally`(onfinally: js.Function0[Unit]): js.Promise[IncomingMessage] = js.native
    
    var req: ClientRequest = js.native
    
    /**
      * Attaches callbacks for the resolution and/or rejection of the Promise.
      * @param onfulfilled The callback to execute when the Promise is resolved.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of which ever callback is executed.
      */
    /* standard es5 */
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
  
  trait Req extends StObject {
    
    var req: ClientRequest
    
    var res: js.UndefOr[IncomingMessage] = js.undefined
    
    var start: Double
    
    var url: URL_
  }
  object Req {
    
    inline def apply(req: ClientRequest, start: Double, url: URL_): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    extension [Self <: Req](x: Self) {
      
      inline def setReq(value: ClientRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: IncomingMessage): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
