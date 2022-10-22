package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichDeletePolicyRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichDeletePolicyResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichExecutePolicyRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichExecutePolicyResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichGetPolicyRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichGetPolicyResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichPutPolicyRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichPutPolicyResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.EnrichStatsResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiEnrichMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/enrich", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Enrich {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Enrich extends StObject {
    
    def deletePolicy(params: EnrichDeletePolicyRequest): js.Promise[EnrichDeletePolicyResponse] = js.native
    def deletePolicy(params: EnrichDeletePolicyRequest, options: TransportRequestOptions): js.Promise[EnrichDeletePolicyResponse] = js.native
    def deletePolicy(params: EnrichDeletePolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichDeletePolicyResponse, Any]] = js.native
    def deletePolicy(params: EnrichDeletePolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichDeletePolicyResponse] = js.native
    def deletePolicy(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichDeletePolicyRequest): js.Promise[EnrichDeletePolicyResponse] = js.native
    def deletePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichDeletePolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[EnrichDeletePolicyResponse] = js.native
    def deletePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichDeletePolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EnrichDeletePolicyResponse, Any]] = js.native
    def deletePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichDeletePolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EnrichDeletePolicyResponse] = js.native
    
    def executePolicy(params: EnrichExecutePolicyRequest): js.Promise[EnrichExecutePolicyResponse] = js.native
    def executePolicy(params: EnrichExecutePolicyRequest, options: TransportRequestOptions): js.Promise[EnrichExecutePolicyResponse] = js.native
    def executePolicy(params: EnrichExecutePolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichExecutePolicyResponse, Any]] = js.native
    def executePolicy(params: EnrichExecutePolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichExecutePolicyResponse] = js.native
    def executePolicy(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichExecutePolicyRequest): js.Promise[EnrichExecutePolicyResponse] = js.native
    def executePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichExecutePolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[EnrichExecutePolicyResponse] = js.native
    def executePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichExecutePolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EnrichExecutePolicyResponse, Any]] = js.native
    def executePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichExecutePolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EnrichExecutePolicyResponse] = js.native
    
    def getPolicy(): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: Unit, options: TransportRequestOptions): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichGetPolicyResponse, Any]] = js.native
    def getPolicy(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: EnrichGetPolicyRequest): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: EnrichGetPolicyRequest, options: TransportRequestOptions): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: EnrichGetPolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichGetPolicyResponse, Any]] = js.native
    def getPolicy(params: EnrichGetPolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichGetPolicyRequest): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichGetPolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[EnrichGetPolicyResponse] = js.native
    def getPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichGetPolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EnrichGetPolicyResponse, Any]] = js.native
    def getPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichGetPolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EnrichGetPolicyResponse] = js.native
    
    def putPolicy(params: EnrichPutPolicyRequest): js.Promise[EnrichPutPolicyResponse] = js.native
    def putPolicy(params: EnrichPutPolicyRequest, options: TransportRequestOptions): js.Promise[EnrichPutPolicyResponse] = js.native
    def putPolicy(params: EnrichPutPolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichPutPolicyResponse, Any]] = js.native
    def putPolicy(params: EnrichPutPolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichPutPolicyResponse] = js.native
    def putPolicy(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPutPolicyRequest): js.Promise[EnrichPutPolicyResponse] = js.native
    def putPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPutPolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[EnrichPutPolicyResponse] = js.native
    def putPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPutPolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EnrichPutPolicyResponse, Any]] = js.native
    def putPolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichPutPolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EnrichPutPolicyResponse] = js.native
    
    def stats(): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: EnrichStatsRequest): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: EnrichStatsRequest, options: TransportRequestOptions): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: EnrichStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EnrichStatsResponse, Any]] = js.native
    def stats(params: EnrichStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EnrichStatsResponse] = js.native
    def stats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichStatsRequest): js.Promise[EnrichStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[EnrichStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EnrichStatsResponse, Any]] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.EnrichStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EnrichStatsResponse] = js.native
    
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
