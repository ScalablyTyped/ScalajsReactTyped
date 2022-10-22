package typingsJapgolly.awsSdkNodeHttpHandler

import typingsJapgolly.awsSdkNodeHttpHandler.anon.HandlerProtocol
import typingsJapgolly.awsSdkNodeHttpHandler.anon.Response
import typingsJapgolly.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequest
import typingsJapgolly.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponse
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesTransferMod.RequestHandler
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeHttpHandlerMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist-types/node-http-handler", "NodeHttpHandler")
  @js.native
  open class NodeHttpHandler ()
    extends StObject
       with RequestHandler[HttpRequest, HttpResponse, HttpHandlerOptions] {
    def this(options: NodeHttpHandlerOptions) = this()
    def this(options: Provider[NodeHttpHandlerOptions | Unit]) = this()
    
    /* private */ var config: Any = js.native
    
    /* private */ val configProvider: Any = js.native
    
    @JSName("destroy")
    def destroy_MNodeHttpHandler(): Unit = js.native
    
    def handle(request: typingsJapgolly.awsSdkProtocolHttp.mod.HttpRequest): js.Promise[Response] = js.native
    def handle(request: typingsJapgolly.awsSdkProtocolHttp.mod.HttpRequest, hasAbortSignal: HttpHandlerOptions): js.Promise[Response] = js.native
    
    @JSName("metadata")
    val metadata_NodeHttpHandler: HandlerProtocol = js.native
    
    /* private */ var resolveDefaultConfig: Any = js.native
  }
  
  trait NodeHttpHandlerOptions extends StObject {
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      */
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var httpAgent: js.UndefOr[Agent] = js.undefined
    
    var httpsAgent: js.UndefOr[typingsJapgolly.node.httpsMod.Agent] = js.undefined
    
    /**
      * The maximum time in milliseconds that a socket may remain idle before it
      * is closed.
      */
    var socketTimeout: js.UndefOr[Double] = js.undefined
  }
  object NodeHttpHandlerOptions {
    
    inline def apply(): NodeHttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeHttpHandlerOptions]
    }
    
    extension [Self <: NodeHttpHandlerOptions](x: Self) {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setHttpAgent(value: Agent): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setHttpsAgent(value: typingsJapgolly.node.httpsMod.Agent): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
    }
  }
}
