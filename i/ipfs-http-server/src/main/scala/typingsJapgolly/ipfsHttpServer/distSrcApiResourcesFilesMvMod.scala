package typingsJapgolly.ipfsHttpServer

import typingsJapgolly.hapiHapi.mod.Request
import typingsJapgolly.hapiHapi.mod.ResponseObject
import typingsJapgolly.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiResourcesFilesMvMod {
  
  object mvResource {
    
    @JSImport("ipfs-http-server/dist/src/api/resources/files/mv", "mvResource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {import('../../../types').Request} request
      * @param {import('@hapi/hapi').ResponseToolkit} h
      */
    inline def handler(request: Request, h: ResponseToolkit): js.Promise[ResponseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("handler")(request.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseObject]]
    
    object options {
      
      object validate {
        
        object options1 {
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files/mv", "mvResource.options.validate.options_1.allowUnknown")
          @js.native
          val allowUnknown: Boolean = js.native
          
          @JSImport("ipfs-http-server/dist/src/api/resources/files/mv", "mvResource.options.validate.options_1.stripUnknown")
          @js.native
          val stripUnknown: Boolean = js.native
        }
        
        @JSImport("ipfs-http-server/dist/src/api/resources/files/mv", "mvResource.options.validate.query")
        @js.native
        val query: Any = js.native
      }
    }
  }
}
