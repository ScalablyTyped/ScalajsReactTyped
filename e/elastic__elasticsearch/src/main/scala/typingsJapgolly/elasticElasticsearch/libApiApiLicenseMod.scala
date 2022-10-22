package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseDeleteRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseDeleteResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetBasicStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetBasicStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetTrialStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicenseGetTrialStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostStartBasicRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostStartBasicResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostStartTrialRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.LicensePostStartTrialResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiLicenseMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/license", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with License {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait License extends StObject {
    
    def delete(): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: Unit, options: TransportRequestOptions): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseDeleteResponse, Any]] = js.native
    def delete(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: LicenseDeleteRequest): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: LicenseDeleteRequest, options: TransportRequestOptions): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: LicenseDeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseDeleteResponse, Any]] = js.native
    def delete(params: LicenseDeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseDeleteResponse] = js.native
    def delete(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseDeleteRequest): js.Promise[LicenseDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseDeleteRequest,
      options: TransportRequestOptions
    ): js.Promise[LicenseDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseDeleteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicenseDeleteResponse, Any]] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseDeleteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicenseDeleteResponse] = js.native
    
    def get(): js.Promise[LicenseGetResponse] = js.native
    def get(params: Unit, options: TransportRequestOptions): js.Promise[LicenseGetResponse] = js.native
    def get(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetResponse, Any]] = js.native
    def get(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetResponse] = js.native
    def get(params: LicenseGetRequest): js.Promise[LicenseGetResponse] = js.native
    def get(params: LicenseGetRequest, options: TransportRequestOptions): js.Promise[LicenseGetResponse] = js.native
    def get(params: LicenseGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetResponse, Any]] = js.native
    def get(params: LicenseGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetResponse] = js.native
    def get(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetRequest): js.Promise[LicenseGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetRequest,
      options: TransportRequestOptions
    ): js.Promise[LicenseGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicenseGetResponse, Any]] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicenseGetResponse] = js.native
    
    def getBasicStatus(): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(params: Unit, options: TransportRequestOptions): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetBasicStatusResponse, Any]] = js.native
    def getBasicStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(params: LicenseGetBasicStatusRequest): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(params: LicenseGetBasicStatusRequest, options: TransportRequestOptions): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(params: LicenseGetBasicStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetBasicStatusResponse, Any]] = js.native
    def getBasicStatus(params: LicenseGetBasicStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetBasicStatusRequest
    ): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetBasicStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[LicenseGetBasicStatusResponse] = js.native
    def getBasicStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetBasicStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicenseGetBasicStatusResponse, Any]] = js.native
    def getBasicStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetBasicStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicenseGetBasicStatusResponse] = js.native
    
    def getTrialStatus(): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(params: Unit, options: TransportRequestOptions): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetTrialStatusResponse, Any]] = js.native
    def getTrialStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(params: LicenseGetTrialStatusRequest): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(params: LicenseGetTrialStatusRequest, options: TransportRequestOptions): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(params: LicenseGetTrialStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicenseGetTrialStatusResponse, Any]] = js.native
    def getTrialStatus(params: LicenseGetTrialStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetTrialStatusRequest
    ): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetTrialStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[LicenseGetTrialStatusResponse] = js.native
    def getTrialStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetTrialStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicenseGetTrialStatusResponse, Any]] = js.native
    def getTrialStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicenseGetTrialStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicenseGetTrialStatusResponse] = js.native
    
    def post(params: LicensePostRequest): js.Promise[LicensePostResponse] = js.native
    def post(params: LicensePostRequest, options: TransportRequestOptions): js.Promise[LicensePostResponse] = js.native
    def post(params: LicensePostRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicensePostResponse, Any]] = js.native
    def post(params: LicensePostRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicensePostResponse] = js.native
    def post(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostRequest): js.Promise[LicensePostResponse] = js.native
    def post(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostRequest,
      options: TransportRequestOptions
    ): js.Promise[LicensePostResponse] = js.native
    def post(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicensePostResponse, Any]] = js.native
    def post(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicensePostResponse] = js.native
    
    def postStartBasic(): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(params: Unit, options: TransportRequestOptions): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicensePostStartBasicResponse, Any]] = js.native
    def postStartBasic(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(params: LicensePostStartBasicRequest): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(params: LicensePostStartBasicRequest, options: TransportRequestOptions): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(params: LicensePostStartBasicRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicensePostStartBasicResponse, Any]] = js.native
    def postStartBasic(params: LicensePostStartBasicRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartBasicRequest
    ): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartBasicRequest,
      options: TransportRequestOptions
    ): js.Promise[LicensePostStartBasicResponse] = js.native
    def postStartBasic(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartBasicRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicensePostStartBasicResponse, Any]] = js.native
    def postStartBasic(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartBasicRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicensePostStartBasicResponse] = js.native
    
    def postStartTrial(): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(params: Unit, options: TransportRequestOptions): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicensePostStartTrialResponse, Any]] = js.native
    def postStartTrial(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(params: LicensePostStartTrialRequest): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(params: LicensePostStartTrialRequest, options: TransportRequestOptions): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(params: LicensePostStartTrialRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LicensePostStartTrialResponse, Any]] = js.native
    def postStartTrial(params: LicensePostStartTrialRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartTrialRequest
    ): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartTrialRequest,
      options: TransportRequestOptions
    ): js.Promise[LicensePostStartTrialResponse] = js.native
    def postStartTrial(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartTrialRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LicensePostStartTrialResponse, Any]] = js.native
    def postStartTrial(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.LicensePostStartTrialRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LicensePostStartTrialResponse] = js.native
    
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
