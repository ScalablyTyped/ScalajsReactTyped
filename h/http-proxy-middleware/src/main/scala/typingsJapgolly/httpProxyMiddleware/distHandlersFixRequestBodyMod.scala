package typingsJapgolly.httpProxyMiddleware

import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHandlersFixRequestBodyMod {
  
  @JSImport("http-proxy-middleware/dist/handlers/fix-request-body", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixRequestBody(proxyReq: ClientRequest, req: IncomingMessage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fixRequestBody")(proxyReq.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
