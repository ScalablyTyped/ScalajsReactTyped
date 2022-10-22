package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashDeletePipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashDeletePipelineResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashGetPipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashGetPipelineResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashPutPipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LogstashPutPipelineResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiLogstashMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/logstash", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Logstash {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Logstash extends StObject {
    
    def deletePipeline(params: LogstashDeletePipelineRequest): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptions): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashDeletePipelineResponse, Any]] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest
    ): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashDeletePipelineResponse, Any]] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashDeletePipelineResponse] = js.native
    
    def getPipeline(params: LogstashGetPipelineRequest): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptions): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashGetPipelineResponse, Any]] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashGetPipelineResponse, Any]] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashGetPipelineResponse] = js.native
    
    def putPipeline(params: LogstashPutPipelineRequest): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptions): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashPutPipelineResponse, Any]] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashPutPipelineResponse, Any]] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashPutPipelineResponse] = js.native
    
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
