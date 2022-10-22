package typingsJapgolly.reactNativeCommunityCliServerApi

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIndexPageMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/indexPageMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    req: IncomingMessage,
    res: ServerResponse[IncomingMessage],
    next: js.Function1[/* err */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
