package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherAckWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherAckWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherActivateWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherActivateWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherDeactivateWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherDeactivateWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherDeleteWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherDeleteWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherExecuteWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherExecuteWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherGetWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherGetWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherPutWatchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherPutWatchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherQueryWatchesRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherQueryWatchesResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStartRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStartResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStopRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.WatcherStopResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiWatcherMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/watcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Watcher {
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
  trait Watcher extends StObject {
    
    def ackWatch(params: WatcherAckWatchRequest): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptions): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherAckWatchResponse, Any]] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherAckWatchResponse, Any]] = js.native
    def ackWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherAckWatchResponse] = js.native
    
    def activateWatch(params: WatcherActivateWatchRequest): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptions): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherActivateWatchResponse, Any]] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherActivateWatchResponse, Any]] = js.native
    def activateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherActivateWatchResponse] = js.native
    
    def deactivateWatch(params: WatcherDeactivateWatchRequest): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptions): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherDeactivateWatchResponse, Any]] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest
    ): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherDeactivateWatchResponse, Any]] = js.native
    def deactivateWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherDeactivateWatchResponse] = js.native
    
    def deleteWatch(params: WatcherDeleteWatchRequest): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptions): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherDeleteWatchResponse, Any]] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherDeleteWatchResponse, Any]] = js.native
    def deleteWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherDeleteWatchResponse] = js.native
    
    def executeWatch(): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptions): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptions): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherExecuteWatchResponse] = js.native
    
    def getWatch(params: WatcherGetWatchRequest): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptions): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherGetWatchResponse, Any]] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherGetWatchResponse, Any]] = js.native
    def getWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherGetWatchResponse] = js.native
    
    def putWatch(params: WatcherPutWatchRequest): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptions): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherPutWatchResponse, Any]] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherPutWatchResponse, Any]] = js.native
    def putWatch(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherPutWatchResponse] = js.native
    
    def queryWatches(): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptions): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptions): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherQueryWatchesResponse] = js.native
    
    def start(): js.Promise[WatcherStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptions): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStartResponse] = js.native
    def start(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest): js.Promise[WatcherStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStartResponse] = js.native
    
    def stats(): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptions): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest): js.Promise[WatcherStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStatsResponse] = js.native
    
    def stop(): js.Promise[WatcherStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptions): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStopResponse] = js.native
    def stop(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest): js.Promise[WatcherStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStopResponse] = js.native
    
    var transport: Transport = js.native
  }
}
