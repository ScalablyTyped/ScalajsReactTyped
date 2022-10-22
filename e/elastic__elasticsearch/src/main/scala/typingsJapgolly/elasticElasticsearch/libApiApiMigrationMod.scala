package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationDeprecationsRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationDeprecationsResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationGetFeatureUpgradeStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationGetFeatureUpgradeStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationPostFeatureUpgradeRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.MigrationPostFeatureUpgradeResponse
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMigrationMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/migration", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Migration {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Migration extends StObject {
    
    def deprecations(): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: Unit, options: TransportRequestOptions): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptions): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(params: MigrationDeprecationsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest
    ): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationDeprecationsResponse] = js.native
    def deprecations(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationDeprecationsResponse, Any]] = js.native
    def deprecations(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationDeprecationsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationDeprecationsResponse] = js.native
    
    def getFeatureUpgradeStatus(): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptions): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptions): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(params: MigrationGetFeatureUpgradeStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    def getFeatureUpgradeStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationGetFeatureUpgradeStatusResponse, Any]] = js.native
    def getFeatureUpgradeStatus(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationGetFeatureUpgradeStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationGetFeatureUpgradeStatusResponse] = js.native
    
    def postFeatureUpgrade(): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptions): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptions): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(params: MigrationPostFeatureUpgradeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest
    ): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptions
    ): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    def postFeatureUpgrade(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[MigrationPostFeatureUpgradeResponse, Any]] = js.native
    def postFeatureUpgrade(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MigrationPostFeatureUpgradeRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[MigrationPostFeatureUpgradeResponse] = js.native
    
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
