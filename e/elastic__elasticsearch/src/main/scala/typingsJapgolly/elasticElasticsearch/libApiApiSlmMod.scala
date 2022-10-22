package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmDeleteLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmDeleteLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmExecuteLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmExecuteLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmExecuteRetentionRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmExecuteRetentionResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmGetStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmPutLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmPutLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmStartRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmStartResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmStopRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SlmStopResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSlmMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/slm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Slm {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Slm extends StObject {
    
    def deleteLifecycle(params: SlmDeleteLifecycleRequest): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmDeleteLifecycleResponse] = js.native
    
    def executeLifecycle(params: SlmExecuteLifecycleRequest): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteLifecycleResponse, Any]] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmExecuteLifecycleResponse, Any]] = js.native
    def executeLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmExecuteLifecycleResponse] = js.native
    
    def executeRetention(): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptions): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptions): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmExecuteRetentionResponse] = js.native
    
    def getLifecycle(): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetLifecycleResponse] = js.native
    
    def getStats(): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptions): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetStatsResponse] = js.native
    
    def getStatus(): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptions): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetStatusResponse] = js.native
    
    def putLifecycle(params: SlmPutLifecycleRequest): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmPutLifecycleResponse] = js.native
    
    def start(): js.Promise[SlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptions): js.Promise[SlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptions): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStartResponse] = js.native
    def start(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest): js.Promise[SlmStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmStartResponse] = js.native
    
    def stop(): js.Promise[SlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptions): js.Promise[SlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptions): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStopResponse] = js.native
    def stop(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest): js.Promise[SlmStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmStopResponse] = js.native
    
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
