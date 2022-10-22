package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlDeleteRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlDeleteResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlGetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlGetResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlGetStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlGetStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlSearchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EqlSearchResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiEqlMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/eql", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Eql {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Eql extends StObject {
    
    def delete(params: EqlDeleteRequest): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptions): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlDeleteResponse, Any]] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest): js.Promise[EqlDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlDeleteResponse, Any]] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlDeleteResponse] = js.native
    
    def get[TEvent](params: EqlGetRequest): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptions): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlGetResponse[TEvent], Any]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlGetResponse[TEvent], Any]] = js.native
    def get[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlGetResponse[TEvent]] = js.native
    
    def getStatus(params: EqlGetStatusRequest): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptions): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlGetStatusResponse, Any]] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlGetStatusResponse, Any]] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlGetStatusResponse] = js.native
    
    def search[TEvent](params: EqlSearchRequest): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptions): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlSearchResponse[TEvent], Any]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlSearchResponse[TEvent], Any]] = js.native
    def search[TEvent](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlSearchResponse[TEvent]] = js.native
    
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
