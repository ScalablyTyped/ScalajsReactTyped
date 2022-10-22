package typingsJapgolly.qIo

import typingsJapgolly.q.mod.Promise
import typingsJapgolly.qIo.QioHTTP.Request
import typingsJapgolly.qIo.QioHTTP.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("q-io/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeRequest(request: Request): Request = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")(request.asInstanceOf[js.Any]).asInstanceOf[Request]
  inline def normalizeRequest(url: String): Request = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRequest")(url.asInstanceOf[js.Any]).asInstanceOf[Request]
  
  inline def normalizeResponse(response: Response): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Response]
  
  inline def read(request: Request): Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(request.asInstanceOf[js.Any]).asInstanceOf[Promise[String]]
  inline def read(url: String): Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(url.asInstanceOf[js.Any]).asInstanceOf[Promise[String]]
  
  inline def request(request: Request): Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(request.asInstanceOf[js.Any]).asInstanceOf[Promise[Response]]
  inline def request(url: String): Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[Promise[Response]]
}
