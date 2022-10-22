package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrDeleteAutoFollowPatternRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrDeleteAutoFollowPatternResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowInfoRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowInfoResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrFollowStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrForgetFollowerRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrForgetFollowerResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrGetAutoFollowPatternRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrGetAutoFollowPatternResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPauseAutoFollowPatternRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPauseAutoFollowPatternResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPauseFollowRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPauseFollowResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPutAutoFollowPatternRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrPutAutoFollowPatternResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrResumeAutoFollowPatternRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrResumeAutoFollowPatternResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrResumeFollowRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrResumeFollowResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrUnfollowRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.CcrUnfollowResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiCcrMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ccr", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ccr {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ccr extends StObject {
    
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrDeleteAutoFollowPatternResponse, Any]] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest
    ): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrDeleteAutoFollowPatternResponse, Any]] = js.native
    def deleteAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    
    def follow(params: CcrFollowRequest): js.Promise[CcrFollowResponse] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptions): js.Promise[CcrFollowResponse] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowResponse, Any]] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowResponse] = js.native
    def follow(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest): js.Promise[CcrFollowResponse] = js.native
    def follow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowResponse] = js.native
    def follow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowResponse, Any]] = js.native
    def follow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowResponse] = js.native
    
    def followInfo(params: CcrFollowInfoRequest): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptions): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowInfoResponse, Any]] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowInfoResponse, Any]] = js.native
    def followInfo(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowInfoResponse] = js.native
    
    def followStats(params: CcrFollowStatsRequest): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptions): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowStatsResponse, Any]] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowStatsResponse, Any]] = js.native
    def followStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowStatsResponse] = js.native
    
    def forgetFollower(params: CcrForgetFollowerRequest): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptions): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrForgetFollowerResponse, Any]] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrForgetFollowerResponse, Any]] = js.native
    def forgetFollower(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrForgetFollowerResponse] = js.native
    
    def getAutoFollowPattern(): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptions): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest
    ): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPauseAutoFollowPatternResponse, Any]] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest
    ): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPauseAutoFollowPatternResponse, Any]] = js.native
    def pauseAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    
    def pauseFollow(params: CcrPauseFollowRequest): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptions): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPauseFollowResponse, Any]] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPauseFollowResponse, Any]] = js.native
    def pauseFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPauseFollowResponse] = js.native
    
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPutAutoFollowPatternResponse, Any]] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest
    ): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPutAutoFollowPatternResponse, Any]] = js.native
    def putAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrResumeAutoFollowPatternResponse, Any]] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest
    ): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrResumeAutoFollowPatternResponse, Any]] = js.native
    def resumeAutoFollowPattern(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    
    def resumeFollow(params: CcrResumeFollowRequest): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptions): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrResumeFollowResponse, Any]] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrResumeFollowResponse, Any]] = js.native
    def resumeFollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrResumeFollowResponse] = js.native
    
    def stats(): js.Promise[CcrStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[CcrStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptions): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrStatsResponse] = js.native
    def stats(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest): js.Promise[CcrStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrStatsResponse] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrStatsResponse] = js.native
    
    var transport: Transport = js.native
    
    def unfollow(params: CcrUnfollowRequest): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptions): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrUnfollowResponse, Any]] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrUnfollowResponse, Any]] = js.native
    def unfollow(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrUnfollowResponse] = js.native
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
