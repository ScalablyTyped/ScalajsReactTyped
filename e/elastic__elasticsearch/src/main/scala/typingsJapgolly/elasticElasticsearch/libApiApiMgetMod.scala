package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MgetResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMgetMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/mget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](): js.Promise[MgetResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  inline def default[TDocument](params: Unit, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  inline def default[TDocument](params: MgetRequest): js.Promise[MgetResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  inline def default[TDocument](params: MgetRequest, options: TransportRequestOptions): js.Promise[MgetResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  inline def default[TDocument](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest): js.Promise[MgetResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  inline def default[TDocument](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetRequest,
    options: TransportRequestOptions
  ): js.Promise[MgetResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MgetResponse[TDocument]]]
  
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
