package typingsJapgolly.itWs

import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReadyMod {
  
  @JSImport("it-ws/dist/src/ready", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socket: WebSocket): js.UndefOr[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socket.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
}
