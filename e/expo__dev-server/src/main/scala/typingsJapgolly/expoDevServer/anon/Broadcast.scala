package typingsJapgolly.expoDevServer.anon

import typingsJapgolly.std.Record
import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcast extends StObject {
  
  def broadcast(method: String): Unit = js.native
  def broadcast(method: String, params: Record[String, Any]): Unit = js.native
  
  var server: Server[WebSocket] = js.native
}
