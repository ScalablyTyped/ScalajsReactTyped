package typingsJapgolly.ipfsHttpGateway

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResourcesGatewayMod {
  
  object Gateway {
    
    @JSImport("ipfs-http-gateway/dist/src/resources/gateway", "Gateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def afterHandler(request: Request, h: ResponseToolkit): js.Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("afterHandler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Symbol]
    
    /**
      * @param {import('../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
  }
}
