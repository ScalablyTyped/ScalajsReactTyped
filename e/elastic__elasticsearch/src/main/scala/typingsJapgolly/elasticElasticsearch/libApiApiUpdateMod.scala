package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.UpdateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.UpdateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiUpdateMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument]): js.Promise[UpdateResponse[TDocumentR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](params: UpdateRequest[TDocument, TPartialDocument], options: TransportRequestOptions): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument]
  ): js.Promise[UpdateResponse[TDocumentR]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  inline def default[TDocument, TPartialDocument, TDocumentR](
    params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateRequest[TDocument, TPartialDocument],
    options: TransportRequestOptions
  ): js.Promise[UpdateResponse[TDocumentR]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateResponse[TDocumentR]]]
  
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
