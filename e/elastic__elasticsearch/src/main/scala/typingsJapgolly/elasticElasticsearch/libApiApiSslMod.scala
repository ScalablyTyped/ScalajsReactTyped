package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SslCertificatesRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SslCertificatesResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSslMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ssl", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ssl {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ssl extends StObject {
    
    def certificates(): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: Unit, options: TransportRequestOptions): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SslCertificatesResponse, Any]] = js.native
    def certificates(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: SslCertificatesRequest): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: SslCertificatesRequest, options: TransportRequestOptions): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: SslCertificatesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SslCertificatesResponse, Any]] = js.native
    def certificates(params: SslCertificatesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SslCertificatesResponse] = js.native
    def certificates(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SslCertificatesRequest): js.Promise[SslCertificatesResponse] = js.native
    def certificates(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SslCertificatesRequest,
      options: TransportRequestOptions
    ): js.Promise[SslCertificatesResponse] = js.native
    def certificates(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SslCertificatesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SslCertificatesResponse, Any]] = js.native
    def certificates(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SslCertificatesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SslCertificatesResponse] = js.native
    
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
