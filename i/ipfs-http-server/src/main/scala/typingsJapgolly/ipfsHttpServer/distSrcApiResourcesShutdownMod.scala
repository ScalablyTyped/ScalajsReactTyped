package typingsJapgolly.ipfsHttpServer

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesShutdownMod {
  
  object shutdownResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/shutdown", "shutdownResource")
    @js.native
    val ^ : js.Any = js.native
    
    inline def handler(_request: Request, h: ResponseToolkit): ResponseObject = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(_request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[ResponseObject]
  }
}
