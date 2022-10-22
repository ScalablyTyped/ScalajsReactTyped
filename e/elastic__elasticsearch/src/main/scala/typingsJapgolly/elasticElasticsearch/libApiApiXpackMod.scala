package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.XpackInfoRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.XpackInfoResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.XpackUsageRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.XpackUsageResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiXpackMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/xpack", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Xpack {
    def this(transport: Transport) = this()
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
  
  @js.native
  trait Xpack extends StObject {
    
    def info(): js.Promise[XpackInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptions): js.Promise[XpackInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptions): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackInfoResponse] = js.native
    def info(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest): js.Promise[XpackInfoResponse] = js.native
    def info(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[XpackInfoResponse] = js.native
    def info(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[XpackInfoResponse] = js.native
    
    var transport: Transport = js.native
    
    def usage(): js.Promise[XpackUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptions): js.Promise[XpackUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptions): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackUsageResponse] = js.native
    def usage(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest): js.Promise[XpackUsageResponse] = js.native
    def usage(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptions
    ): js.Promise[XpackUsageResponse] = js.native
    def usage(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[XpackUsageResponse] = js.native
  }
}
