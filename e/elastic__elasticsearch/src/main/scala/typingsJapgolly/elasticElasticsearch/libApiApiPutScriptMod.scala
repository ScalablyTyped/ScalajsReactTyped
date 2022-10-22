package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.PutScriptRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.PutScriptResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiPutScriptMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/put_script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: PutScriptRequest): js.Promise[PutScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(params: PutScriptRequest, options: TransportRequestOptions): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest): js.Promise[PutScriptResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PutScriptResponse]]
  inline def default(
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.PutScriptRequest,
    options: TransportRequestOptions
  ): js.Promise[PutScriptResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PutScriptResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
