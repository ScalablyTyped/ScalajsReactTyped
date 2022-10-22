package typingsJapgolly.next.anon

import typingsJapgolly.next.nextStrings.`edge-server`
import typingsJapgolly.next.nextStrings.client
import typingsJapgolly.next.nextStrings.server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeServer extends StObject {
  
  val client: typingsJapgolly.next.nextStrings.client
  
  val edgeServer: `edge-server`
  
  val server: typingsJapgolly.next.nextStrings.server
}
object EdgeServer {
  
  inline def apply(): EdgeServer = {
    val __obj = js.Dynamic.literal(client = "client", edgeServer = "edge-server", server = "server")
    __obj.asInstanceOf[EdgeServer]
  }
  
  extension [Self <: EdgeServer](x: Self) {
    
    inline def setClient(value: client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setEdgeServer(value: `edge-server`): Self = StObject.set(x, "edgeServer", value.asInstanceOf[js.Any])
    
    inline def setServer(value: server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
