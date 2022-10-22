package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MsearchResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMsearchMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/msearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TAggregations](params: MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptions): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  
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
