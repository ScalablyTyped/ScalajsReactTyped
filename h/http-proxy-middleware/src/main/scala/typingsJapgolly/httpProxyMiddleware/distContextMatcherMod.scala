package typingsJapgolly.httpProxyMiddleware

import typingsJapgolly.httpProxyMiddleware.distTypesMod.Filter
import typingsJapgolly.httpProxyMiddleware.distTypesMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextMatcherMod {
  
  @JSImport("http-proxy-middleware/dist/context-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `match`(context: Filter, uri: String, req: Request): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(context.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
