package typingsJapgolly.expoDevServer

import typingsJapgolly.expoDevServer.anon.AttachToServer
import typingsJapgolly.expoDevServer.anon.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMiddlewareDevServerMiddlewareMod {
  
  @JSImport("@expo/dev-server/build/middleware/devServerMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDevServerMiddleware(projectRoot: String, hasWatchFoldersPortLogger: Logger): AttachToServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createDevServerMiddleware")(projectRoot.asInstanceOf[js.Any], hasWatchFoldersPortLogger.asInstanceOf[js.Any])).asInstanceOf[AttachToServer]
}
