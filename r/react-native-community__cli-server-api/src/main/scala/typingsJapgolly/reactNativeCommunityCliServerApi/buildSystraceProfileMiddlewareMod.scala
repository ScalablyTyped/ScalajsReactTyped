package typingsJapgolly.reactNativeCommunityCliServerApi

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.reactNativeCommunityCliServerApi.anon.RawBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSystraceProfileMiddlewareMod {
  
  @JSImport("@react-native-community/cli-server-api/build/systraceProfileMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(req: IncomingMessage & RawBody, res: ServerResponse[IncomingMessage]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
