package typingsJapgolly.expoDevServer

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareSuppressErrorMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/suppressErrorMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def suppressRemoteDebuggingErrorMiddleware(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("suppressRemoteDebuggingErrorMiddleware")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
