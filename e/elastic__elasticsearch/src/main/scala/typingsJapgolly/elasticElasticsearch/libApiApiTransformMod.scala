package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformDeleteTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformDeleteTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformGetTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformGetTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformGetTransformStatsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformGetTransformStatsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformPreviewTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformPreviewTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformPutTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformPutTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformResetTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformResetTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformStartTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformStartTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformStopTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformStopTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformUpdateTransformRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformUpdateTransformResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformUpgradeTransformsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TransformUpgradeTransformsResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTransformMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/transform", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Transform {
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
  trait Transform extends StObject {
    
    def deleteTransform(params: TransformDeleteTransformRequest): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptions): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformDeleteTransformResponse, Any]] = js.native
    def deleteTransform(params: TransformDeleteTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest
    ): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformDeleteTransformResponse] = js.native
    def deleteTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformDeleteTransformResponse, Any]] = js.native
    def deleteTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformDeleteTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformDeleteTransformResponse] = js.native
    
    def getTransform(): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: Unit, options: TransportRequestOptions): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptions): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(params: TransformGetTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest
    ): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformGetTransformResponse] = js.native
    def getTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformGetTransformResponse, Any]] = js.native
    def getTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformGetTransformResponse] = js.native
    
    def getTransformStats(params: TransformGetTransformStatsRequest): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptions): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformGetTransformStatsResponse, Any]] = js.native
    def getTransformStats(params: TransformGetTransformStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest
    ): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformGetTransformStatsResponse] = js.native
    def getTransformStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformGetTransformStatsResponse, Any]] = js.native
    def getTransformStats(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformGetTransformStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformGetTransformStatsResponse] = js.native
    
    def previewTransform[TTransform](): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptions): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptions): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](params: TransformPreviewTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest
    ): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    def previewTransform[TTransform](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformPreviewTransformResponse[TTransform], Any]] = js.native
    def previewTransform[TTransform](
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPreviewTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformPreviewTransformResponse[TTransform]] = js.native
    
    def putTransform(params: TransformPutTransformRequest): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptions): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformPutTransformResponse, Any]] = js.native
    def putTransform(params: TransformPutTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest
    ): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformPutTransformResponse] = js.native
    def putTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformPutTransformResponse, Any]] = js.native
    def putTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformPutTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformPutTransformResponse] = js.native
    
    def resetTransform(params: TransformResetTransformRequest): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptions): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformResetTransformResponse, Any]] = js.native
    def resetTransform(params: TransformResetTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest
    ): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformResetTransformResponse] = js.native
    def resetTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformResetTransformResponse, Any]] = js.native
    def resetTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformResetTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformResetTransformResponse] = js.native
    
    def startTransform(params: TransformStartTransformRequest): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptions): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformStartTransformResponse, Any]] = js.native
    def startTransform(params: TransformStartTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest
    ): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformStartTransformResponse] = js.native
    def startTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformStartTransformResponse, Any]] = js.native
    def startTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStartTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformStartTransformResponse] = js.native
    
    def stopTransform(params: TransformStopTransformRequest): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptions): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformStopTransformResponse, Any]] = js.native
    def stopTransform(params: TransformStopTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest
    ): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformStopTransformResponse] = js.native
    def stopTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformStopTransformResponse, Any]] = js.native
    def stopTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformStopTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformStopTransformResponse] = js.native
    
    var transport: Transport = js.native
    
    def updateTransform(params: TransformUpdateTransformRequest): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptions): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpdateTransformResponse, Any]] = js.native
    def updateTransform(params: TransformUpdateTransformRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest
    ): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformUpdateTransformResponse] = js.native
    def updateTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformUpdateTransformResponse, Any]] = js.native
    def updateTransform(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpdateTransformRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformUpdateTransformResponse] = js.native
    
    def upgradeTransforms(): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptions): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptions): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(params: TransformUpgradeTransformsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest
    ): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptions
    ): js.Promise[TransformUpgradeTransformsResponse] = js.native
    def upgradeTransforms(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TransformUpgradeTransformsResponse, Any]] = js.native
    def upgradeTransforms(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TransformUpgradeTransformsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TransformUpgradeTransformsResponse] = js.native
  }
}
