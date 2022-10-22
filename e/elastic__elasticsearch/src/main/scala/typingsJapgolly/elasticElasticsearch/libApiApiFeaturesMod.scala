package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.FeaturesGetFeaturesRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.FeaturesGetFeaturesResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.FeaturesResetFeaturesRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.FeaturesResetFeaturesResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiFeaturesMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/features", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Features {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Features extends StObject {
    
    def getFeatures(): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptions): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptions): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(params: FeaturesGetFeaturesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptions
    ): js.Promise[FeaturesGetFeaturesResponse] = js.native
    def getFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FeaturesGetFeaturesResponse, Any]] = js.native
    def getFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesGetFeaturesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FeaturesGetFeaturesResponse] = js.native
    
    def resetFeatures(): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptions): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptions): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(params: FeaturesResetFeaturesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest
    ): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptions
    ): js.Promise[FeaturesResetFeaturesResponse] = js.native
    def resetFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FeaturesResetFeaturesResponse, Any]] = js.native
    def resetFeatures(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.FeaturesResetFeaturesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FeaturesResetFeaturesResponse] = js.native
    
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
