package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ExplainRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.ExplainResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiExplainMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/explain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](params: ExplainRequest): js.Promise[ExplainResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExplainResponse[TDocument]]]
  inline def default[TDocument](params: ExplainRequest, options: TransportRequestOptions): js.Promise[ExplainResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExplainResponse[TDocument]]]
  inline def default[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest): js.Promise[ExplainResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExplainResponse[TDocument]]]
  inline def default[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExplainRequest,
    options: TransportRequestOptions
  ): js.Promise[ExplainResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExplainResponse[TDocument]]]
  
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
