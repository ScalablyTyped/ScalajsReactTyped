package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.GraphExploreRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.GraphExploreResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiGraphMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/graph", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Graph {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Graph extends StObject {
    
    def explore(params: GraphExploreRequest): js.Promise[GraphExploreResponse] = js.native
    def explore(params: GraphExploreRequest, options: TransportRequestOptions): js.Promise[GraphExploreResponse] = js.native
    def explore(params: GraphExploreRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[GraphExploreResponse, Any]] = js.native
    def explore(params: GraphExploreRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[GraphExploreResponse] = js.native
    def explore(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphExploreRequest): js.Promise[GraphExploreResponse] = js.native
    def explore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphExploreRequest,
      options: TransportRequestOptions
    ): js.Promise[GraphExploreResponse] = js.native
    def explore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphExploreRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[GraphExploreResponse, Any]] = js.native
    def explore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.GraphExploreRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[GraphExploreResponse] = js.native
    
    var transport: Transport = js.native
  }
  
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
