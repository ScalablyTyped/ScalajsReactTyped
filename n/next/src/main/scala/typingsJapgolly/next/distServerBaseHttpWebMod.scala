package typingsJapgolly.next

import org.scalajs.dom.ReadableStream
import org.scalajs.dom.Request
import org.scalajs.dom.Response
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextRequest
import typingsJapgolly.next.distServerBaseHttpMod.BaseNextResponse
import typingsJapgolly.std.TransformStream
import typingsJapgolly.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerBaseHttpWebMod {
  
  @JSImport("next/dist/server/base-http/web", "WebNextRequest")
  @js.native
  open class WebNextRequest protected () extends BaseNextRequest[ReadableStream[Any] | Null] {
    def this(request: Request) = this()
    
    var request: Request = js.native
  }
  
  @JSImport("next/dist/server/base-http/web", "WebNextResponse")
  @js.native
  open class WebNextResponse () extends BaseNextResponse[WritableStream[Any]] {
    def this(transformStream: TransformStream[Any, Any]) = this()
    
    /* private */ var _sent: Any = js.native
    
    /* private */ var headers: Any = js.native
    
    /* private */ var response: Any = js.native
    
    /* private */ var sendPromise: Any = js.native
    
    /* private */ var sendResolve: Any = js.native
    
    /* private */ var textBody: Any = js.native
    
    def toResponse(): js.Promise[Response] = js.native
    
    var transformStream: TransformStream[Any, Any] = js.native
  }
}
