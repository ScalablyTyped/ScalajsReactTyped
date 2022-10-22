package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestDeletePipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestDeletePipelineResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestGeoIpStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestGeoIpStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestGetPipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestGetPipelineResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestProcessorGrokRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestProcessorGrokResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestPutPipelineRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestPutPipelineResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestSimulateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.IngestSimulateResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiIngestMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ingest", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ingest {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ingest extends StObject {
    
    def deletePipeline(params: IngestDeletePipelineRequest): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptions): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestDeletePipelineResponse, Any]] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestDeletePipelineResponse, Any]] = js.native
    def deletePipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestDeletePipelineResponse] = js.native
    
    def geoIpStats(): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptions): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptions): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestGeoIpStatsResponse] = js.native
    
    def getPipeline(): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptions): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptions): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestGetPipelineResponse] = js.native
    
    def processorGrok(): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptions): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptions): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestProcessorGrokResponse] = js.native
    
    def putPipeline(params: IngestPutPipelineRequest): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptions): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestPutPipelineResponse, Any]] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestPutPipelineResponse, Any]] = js.native
    def putPipeline(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestPutPipelineResponse] = js.native
    
    def simulate(): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: Unit, options: TransportRequestOptions): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptions): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest): js.Promise[IngestSimulateResponse] = js.native
    def simulate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestSimulateResponse] = js.native
    def simulate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestSimulateResponse] = js.native
    
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
