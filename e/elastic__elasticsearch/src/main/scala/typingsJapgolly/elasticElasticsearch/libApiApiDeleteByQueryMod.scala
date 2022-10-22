package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.DeleteByQueryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.DeleteByQueryResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDeleteByQueryMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/delete_by_query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(params: DeleteByQueryRequest, options: TransportRequestOptions): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  
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
