package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupDeleteJobRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupDeleteJobResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetJobsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetJobsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetRollupCapsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetRollupCapsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetRollupIndexCapsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupGetRollupIndexCapsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupPutJobRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupPutJobResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupRollupRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupRollupResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupRollupSearchRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupRollupSearchResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupStartJobRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupStartJobResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupStopJobRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.RollupStopJobResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiRollupMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/rollup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Rollup {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Rollup extends StObject {
    
    def deleteJob(params: RollupDeleteJobRequest): js.Promise[RollupDeleteJobResponse] = js.native
    def deleteJob(params: RollupDeleteJobRequest, options: TransportRequestOptions): js.Promise[RollupDeleteJobResponse] = js.native
    def deleteJob(params: RollupDeleteJobRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupDeleteJobResponse, Any]] = js.native
    def deleteJob(params: RollupDeleteJobRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupDeleteJobResponse] = js.native
    def deleteJob(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupDeleteJobRequest): js.Promise[RollupDeleteJobResponse] = js.native
    def deleteJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupDeleteJobRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupDeleteJobResponse] = js.native
    def deleteJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupDeleteJobRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupDeleteJobResponse, Any]] = js.native
    def deleteJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupDeleteJobRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupDeleteJobResponse] = js.native
    
    def getJobs(): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: Unit, options: TransportRequestOptions): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupGetJobsResponse, Any]] = js.native
    def getJobs(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: RollupGetJobsRequest): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: RollupGetJobsRequest, options: TransportRequestOptions): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: RollupGetJobsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupGetJobsResponse, Any]] = js.native
    def getJobs(params: RollupGetJobsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetJobsRequest): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetJobsRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupGetJobsResponse] = js.native
    def getJobs(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetJobsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupGetJobsResponse, Any]] = js.native
    def getJobs(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetJobsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupGetJobsResponse] = js.native
    
    def getRollupCaps(): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: Unit, options: TransportRequestOptions): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupGetRollupCapsResponse, Any]] = js.native
    def getRollupCaps(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: RollupGetRollupCapsRequest): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: RollupGetRollupCapsRequest, options: TransportRequestOptions): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: RollupGetRollupCapsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupGetRollupCapsResponse, Any]] = js.native
    def getRollupCaps(params: RollupGetRollupCapsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupCapsRequest): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupCapsRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupGetRollupCapsResponse] = js.native
    def getRollupCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupCapsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupGetRollupCapsResponse, Any]] = js.native
    def getRollupCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupCapsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupGetRollupCapsResponse] = js.native
    
    def getRollupIndexCaps(params: RollupGetRollupIndexCapsRequest): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    def getRollupIndexCaps(params: RollupGetRollupIndexCapsRequest, options: TransportRequestOptions): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    def getRollupIndexCaps(params: RollupGetRollupIndexCapsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupGetRollupIndexCapsResponse, Any]] = js.native
    def getRollupIndexCaps(params: RollupGetRollupIndexCapsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    def getRollupIndexCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupIndexCapsRequest
    ): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    def getRollupIndexCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupIndexCapsRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    def getRollupIndexCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupIndexCapsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupGetRollupIndexCapsResponse, Any]] = js.native
    def getRollupIndexCaps(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupGetRollupIndexCapsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupGetRollupIndexCapsResponse] = js.native
    
    def putJob(params: RollupPutJobRequest): js.Promise[RollupPutJobResponse] = js.native
    def putJob(params: RollupPutJobRequest, options: TransportRequestOptions): js.Promise[RollupPutJobResponse] = js.native
    def putJob(params: RollupPutJobRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupPutJobResponse, Any]] = js.native
    def putJob(params: RollupPutJobRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupPutJobResponse] = js.native
    def putJob(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupPutJobRequest): js.Promise[RollupPutJobResponse] = js.native
    def putJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupPutJobRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupPutJobResponse] = js.native
    def putJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupPutJobRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupPutJobResponse, Any]] = js.native
    def putJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupPutJobRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupPutJobResponse] = js.native
    
    def rollup(params: RollupRollupRequest): js.Promise[RollupRollupResponse] = js.native
    def rollup(params: RollupRollupRequest, options: TransportRequestOptions): js.Promise[RollupRollupResponse] = js.native
    def rollup(params: RollupRollupRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupRollupResponse, Any]] = js.native
    def rollup(params: RollupRollupRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupRollupResponse] = js.native
    def rollup(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupRequest): js.Promise[RollupRollupResponse] = js.native
    def rollup(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupRollupResponse] = js.native
    def rollup(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupRollupResponse, Any]] = js.native
    def rollup(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupRollupResponse] = js.native
    
    def rollupSearch[TDocument, TAggregations](params: RollupRollupSearchRequest): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    def rollupSearch[TDocument, TAggregations](params: RollupRollupSearchRequest, options: TransportRequestOptions): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    def rollupSearch[TDocument, TAggregations](params: RollupRollupSearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupRollupSearchResponse[TDocument, TAggregations], Any]] = js.native
    def rollupSearch[TDocument, TAggregations](params: RollupRollupSearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    def rollupSearch[TDocument, TAggregations](params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupSearchRequest): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    def rollupSearch[TDocument, TAggregations](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupSearchRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    def rollupSearch[TDocument, TAggregations](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupSearchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupRollupSearchResponse[TDocument, TAggregations], Any]] = js.native
    def rollupSearch[TDocument, TAggregations](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupRollupSearchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupRollupSearchResponse[TDocument, TAggregations]] = js.native
    
    def startJob(params: RollupStartJobRequest): js.Promise[RollupStartJobResponse] = js.native
    def startJob(params: RollupStartJobRequest, options: TransportRequestOptions): js.Promise[RollupStartJobResponse] = js.native
    def startJob(params: RollupStartJobRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupStartJobResponse, Any]] = js.native
    def startJob(params: RollupStartJobRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupStartJobResponse] = js.native
    def startJob(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStartJobRequest): js.Promise[RollupStartJobResponse] = js.native
    def startJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStartJobRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupStartJobResponse] = js.native
    def startJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStartJobRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupStartJobResponse, Any]] = js.native
    def startJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStartJobRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupStartJobResponse] = js.native
    
    def stopJob(params: RollupStopJobRequest): js.Promise[RollupStopJobResponse] = js.native
    def stopJob(params: RollupStopJobRequest, options: TransportRequestOptions): js.Promise[RollupStopJobResponse] = js.native
    def stopJob(params: RollupStopJobRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[RollupStopJobResponse, Any]] = js.native
    def stopJob(params: RollupStopJobRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[RollupStopJobResponse] = js.native
    def stopJob(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStopJobRequest): js.Promise[RollupStopJobResponse] = js.native
    def stopJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStopJobRequest,
      options: TransportRequestOptions
    ): js.Promise[RollupStopJobResponse] = js.native
    def stopJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStopJobRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[RollupStopJobResponse, Any]] = js.native
    def stopJob(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.RollupStopJobRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[RollupStopJobResponse] = js.native
    
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
