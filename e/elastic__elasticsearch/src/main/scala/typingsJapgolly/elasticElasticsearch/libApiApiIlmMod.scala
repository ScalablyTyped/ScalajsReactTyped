package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmDeleteLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmDeleteLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmGetLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmGetLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmGetStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmGetStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmMigrateToDataTiersRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmMigrateToDataTiersResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmMoveToStepRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmMoveToStepResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmPutLifecycleRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmPutLifecycleResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmRemovePolicyRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmRemovePolicyResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmRetryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmRetryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmStartRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmStartResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmStopRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmStopResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiIlmMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ilm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ilm {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ilm extends StObject {
    
    def deleteLifecycle(params: IlmDeleteLifecycleRequest): js.Promise[IlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: IlmDeleteLifecycleRequest, options: TransportRequestOptions): js.Promise[IlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: IlmDeleteLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(params: IlmDeleteLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmDeleteLifecycleRequest): js.Promise[IlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmDeleteLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmDeleteLifecycleResponse] = js.native
    
    def explainLifecycle(params: IlmExplainLifecycleRequest): js.Promise[IlmExplainLifecycleResponse] = js.native
    def explainLifecycle(params: IlmExplainLifecycleRequest, options: TransportRequestOptions): js.Promise[IlmExplainLifecycleResponse] = js.native
    def explainLifecycle(params: IlmExplainLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmExplainLifecycleResponse, Any]] = js.native
    def explainLifecycle(params: IlmExplainLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmExplainLifecycleResponse] = js.native
    def explainLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleRequest): js.Promise[IlmExplainLifecycleResponse] = js.native
    def explainLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmExplainLifecycleResponse] = js.native
    def explainLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmExplainLifecycleResponse, Any]] = js.native
    def explainLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmExplainLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmExplainLifecycleResponse] = js.native
    
    def getLifecycle(): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptions): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: IlmGetLifecycleRequest): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: IlmGetLifecycleRequest, options: TransportRequestOptions): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: IlmGetLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: IlmGetLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetLifecycleRequest): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmGetLifecycleResponse] = js.native
    
    def getStatus(): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptions): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmGetStatusResponse, Any]] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: IlmGetStatusRequest): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: IlmGetStatusRequest, options: TransportRequestOptions): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: IlmGetStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmGetStatusResponse, Any]] = js.native
    def getStatus(params: IlmGetStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetStatusRequest): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmGetStatusResponse] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmGetStatusResponse, Any]] = js.native
    def getStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmGetStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmGetStatusResponse] = js.native
    
    def migrateToDataTiers(): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(params: Unit, options: TransportRequestOptions): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmMigrateToDataTiersResponse, Any]] = js.native
    def migrateToDataTiers(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(params: IlmMigrateToDataTiersRequest): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(params: IlmMigrateToDataTiersRequest, options: TransportRequestOptions): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(params: IlmMigrateToDataTiersRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmMigrateToDataTiersResponse, Any]] = js.native
    def migrateToDataTiers(params: IlmMigrateToDataTiersRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMigrateToDataTiersRequest
    ): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMigrateToDataTiersRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    def migrateToDataTiers(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMigrateToDataTiersRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmMigrateToDataTiersResponse, Any]] = js.native
    def migrateToDataTiers(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMigrateToDataTiersRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmMigrateToDataTiersResponse] = js.native
    
    def moveToStep(params: IlmMoveToStepRequest): js.Promise[IlmMoveToStepResponse] = js.native
    def moveToStep(params: IlmMoveToStepRequest, options: TransportRequestOptions): js.Promise[IlmMoveToStepResponse] = js.native
    def moveToStep(params: IlmMoveToStepRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmMoveToStepResponse, Any]] = js.native
    def moveToStep(params: IlmMoveToStepRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmMoveToStepResponse] = js.native
    def moveToStep(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMoveToStepRequest): js.Promise[IlmMoveToStepResponse] = js.native
    def moveToStep(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMoveToStepRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmMoveToStepResponse] = js.native
    def moveToStep(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMoveToStepRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmMoveToStepResponse, Any]] = js.native
    def moveToStep(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmMoveToStepRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmMoveToStepResponse] = js.native
    
    def putLifecycle(params: IlmPutLifecycleRequest): js.Promise[IlmPutLifecycleResponse] = js.native
    def putLifecycle(params: IlmPutLifecycleRequest, options: TransportRequestOptions): js.Promise[IlmPutLifecycleResponse] = js.native
    def putLifecycle(params: IlmPutLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(params: IlmPutLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmPutLifecycleResponse] = js.native
    def putLifecycle(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmPutLifecycleRequest): js.Promise[IlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmPutLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmPutLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmPutLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmPutLifecycleResponse] = js.native
    
    def removePolicy(params: IlmRemovePolicyRequest): js.Promise[IlmRemovePolicyResponse] = js.native
    def removePolicy(params: IlmRemovePolicyRequest, options: TransportRequestOptions): js.Promise[IlmRemovePolicyResponse] = js.native
    def removePolicy(params: IlmRemovePolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmRemovePolicyResponse, Any]] = js.native
    def removePolicy(params: IlmRemovePolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmRemovePolicyResponse] = js.native
    def removePolicy(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRemovePolicyRequest): js.Promise[IlmRemovePolicyResponse] = js.native
    def removePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRemovePolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmRemovePolicyResponse] = js.native
    def removePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRemovePolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmRemovePolicyResponse, Any]] = js.native
    def removePolicy(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRemovePolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmRemovePolicyResponse] = js.native
    
    def retry(params: IlmRetryRequest): js.Promise[IlmRetryResponse] = js.native
    def retry(params: IlmRetryRequest, options: TransportRequestOptions): js.Promise[IlmRetryResponse] = js.native
    def retry(params: IlmRetryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmRetryResponse, Any]] = js.native
    def retry(params: IlmRetryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmRetryResponse] = js.native
    def retry(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRetryRequest): js.Promise[IlmRetryResponse] = js.native
    def retry(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRetryRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmRetryResponse] = js.native
    def retry(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRetryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmRetryResponse, Any]] = js.native
    def retry(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmRetryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmRetryResponse] = js.native
    
    def start(): js.Promise[IlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptions): js.Promise[IlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmStartResponse, Any]] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmStartResponse] = js.native
    def start(params: IlmStartRequest): js.Promise[IlmStartResponse] = js.native
    def start(params: IlmStartRequest, options: TransportRequestOptions): js.Promise[IlmStartResponse] = js.native
    def start(params: IlmStartRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmStartResponse, Any]] = js.native
    def start(params: IlmStartRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmStartResponse] = js.native
    def start(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStartRequest): js.Promise[IlmStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStartRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmStartResponse] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStartRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmStartResponse, Any]] = js.native
    def start(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStartRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmStartResponse] = js.native
    
    def stop(): js.Promise[IlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptions): js.Promise[IlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmStopResponse, Any]] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmStopResponse] = js.native
    def stop(params: IlmStopRequest): js.Promise[IlmStopResponse] = js.native
    def stop(params: IlmStopRequest, options: TransportRequestOptions): js.Promise[IlmStopResponse] = js.native
    def stop(params: IlmStopRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IlmStopResponse, Any]] = js.native
    def stop(params: IlmStopRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IlmStopResponse] = js.native
    def stop(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStopRequest): js.Promise[IlmStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStopRequest,
      options: TransportRequestOptions
    ): js.Promise[IlmStopResponse] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStopRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IlmStopResponse, Any]] = js.native
    def stop(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IlmStopRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IlmStopResponse] = js.native
    
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
