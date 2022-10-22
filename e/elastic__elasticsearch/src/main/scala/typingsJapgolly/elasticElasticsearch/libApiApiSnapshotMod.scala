package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCleanupRepositoryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCleanupRepositoryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCloneRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCloneResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCreateRepositoryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCreateRepositoryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCreateRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotCreateResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotDeleteRepositoryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotDeleteRepositoryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotDeleteRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotDeleteResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotGetRepositoryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotGetRepositoryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotGetRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotGetResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotRestoreRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotRestoreResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotStatusRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotStatusResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotVerifyRepositoryRequest
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.SnapshotVerifyRepositoryResponse
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.TODO
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptions
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typingsJapgolly.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typingsJapgolly.elasticTransport.libTypesMod.TransportResult
import typingsJapgolly.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSnapshotMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/snapshot", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Snapshot {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Snapshot extends StObject {
    
    def cleanupRepository(params: SnapshotCleanupRepositoryRequest): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    def cleanupRepository(params: SnapshotCleanupRepositoryRequest, options: TransportRequestOptions): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    def cleanupRepository(params: SnapshotCleanupRepositoryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotCleanupRepositoryResponse, Any]] = js.native
    def cleanupRepository(params: SnapshotCleanupRepositoryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    def cleanupRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCleanupRepositoryRequest
    ): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    def cleanupRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCleanupRepositoryRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    def cleanupRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCleanupRepositoryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotCleanupRepositoryResponse, Any]] = js.native
    def cleanupRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCleanupRepositoryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotCleanupRepositoryResponse] = js.native
    
    def clone(params: SnapshotCloneRequest): js.Promise[SnapshotCloneResponse] = js.native
    def clone(params: SnapshotCloneRequest, options: TransportRequestOptions): js.Promise[SnapshotCloneResponse] = js.native
    def clone(params: SnapshotCloneRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotCloneResponse, Any]] = js.native
    def clone(params: SnapshotCloneRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotCloneResponse] = js.native
    def clone(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCloneRequest): js.Promise[SnapshotCloneResponse] = js.native
    def clone(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCloneRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotCloneResponse] = js.native
    def clone(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCloneRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotCloneResponse, Any]] = js.native
    def clone(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCloneRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotCloneResponse] = js.native
    
    def create(params: SnapshotCreateRequest): js.Promise[SnapshotCreateResponse] = js.native
    def create(params: SnapshotCreateRequest, options: TransportRequestOptions): js.Promise[SnapshotCreateResponse] = js.native
    def create(params: SnapshotCreateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotCreateResponse, Any]] = js.native
    def create(params: SnapshotCreateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotCreateResponse] = js.native
    def create(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRequest): js.Promise[SnapshotCreateResponse] = js.native
    def create(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotCreateResponse] = js.native
    def create(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotCreateResponse, Any]] = js.native
    def create(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotCreateResponse] = js.native
    
    def createRepository(params: SnapshotCreateRepositoryRequest): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    def createRepository(params: SnapshotCreateRepositoryRequest, options: TransportRequestOptions): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    def createRepository(params: SnapshotCreateRepositoryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotCreateRepositoryResponse, Any]] = js.native
    def createRepository(params: SnapshotCreateRepositoryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    def createRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRepositoryRequest
    ): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    def createRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRepositoryRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    def createRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRepositoryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotCreateRepositoryResponse, Any]] = js.native
    def createRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotCreateRepositoryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotCreateRepositoryResponse] = js.native
    
    def delete(params: SnapshotDeleteRequest): js.Promise[SnapshotDeleteResponse] = js.native
    def delete(params: SnapshotDeleteRequest, options: TransportRequestOptions): js.Promise[SnapshotDeleteResponse] = js.native
    def delete(params: SnapshotDeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotDeleteResponse, Any]] = js.native
    def delete(params: SnapshotDeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotDeleteResponse] = js.native
    def delete(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRequest): js.Promise[SnapshotDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotDeleteResponse] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotDeleteResponse, Any]] = js.native
    def delete(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotDeleteResponse] = js.native
    
    def deleteRepository(params: SnapshotDeleteRepositoryRequest): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    def deleteRepository(params: SnapshotDeleteRepositoryRequest, options: TransportRequestOptions): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    def deleteRepository(params: SnapshotDeleteRepositoryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotDeleteRepositoryResponse, Any]] = js.native
    def deleteRepository(params: SnapshotDeleteRepositoryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    def deleteRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRepositoryRequest
    ): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    def deleteRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRepositoryRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    def deleteRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRepositoryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotDeleteRepositoryResponse, Any]] = js.native
    def deleteRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotDeleteRepositoryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotDeleteRepositoryResponse] = js.native
    
    def get(params: SnapshotGetRequest): js.Promise[SnapshotGetResponse] = js.native
    def get(params: SnapshotGetRequest, options: TransportRequestOptions): js.Promise[SnapshotGetResponse] = js.native
    def get(params: SnapshotGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotGetResponse, Any]] = js.native
    def get(params: SnapshotGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotGetResponse] = js.native
    def get(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRequest): js.Promise[SnapshotGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotGetResponse] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotGetResponse, Any]] = js.native
    def get(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotGetResponse] = js.native
    
    def getRepository(): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(params: Unit, options: TransportRequestOptions): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotGetRepositoryResponse, Any]] = js.native
    def getRepository(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(params: SnapshotGetRepositoryRequest): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(params: SnapshotGetRepositoryRequest, options: TransportRequestOptions): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(params: SnapshotGetRepositoryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotGetRepositoryResponse, Any]] = js.native
    def getRepository(params: SnapshotGetRepositoryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRepositoryRequest
    ): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRepositoryRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotGetRepositoryResponse] = js.native
    def getRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRepositoryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotGetRepositoryResponse, Any]] = js.native
    def getRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotGetRepositoryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotGetRepositoryResponse] = js.native
    
    def repositoryAnalyze(): js.Promise[TODO] = js.native
    def repositoryAnalyze(params: TODO | typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TODO): js.Promise[TODO] = js.native
    def repositoryAnalyze(
      params: TODO | typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TODO,
      options: TransportRequestOptions
    ): js.Promise[TODO] = js.native
    def repositoryAnalyze(
      params: TODO | typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TODO,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[TODO, Any]] = js.native
    def repositoryAnalyze(
      params: TODO | typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.TODO,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[TODO] = js.native
    def repositoryAnalyze(params: Unit, options: TransportRequestOptions): js.Promise[TODO] = js.native
    def repositoryAnalyze(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TODO, Any]] = js.native
    def repositoryAnalyze(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[TODO] = js.native
    
    def restore(params: SnapshotRestoreRequest): js.Promise[SnapshotRestoreResponse] = js.native
    def restore(params: SnapshotRestoreRequest, options: TransportRequestOptions): js.Promise[SnapshotRestoreResponse] = js.native
    def restore(params: SnapshotRestoreRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotRestoreResponse, Any]] = js.native
    def restore(params: SnapshotRestoreRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotRestoreResponse] = js.native
    def restore(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRestoreRequest): js.Promise[SnapshotRestoreResponse] = js.native
    def restore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRestoreRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotRestoreResponse] = js.native
    def restore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRestoreRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotRestoreResponse, Any]] = js.native
    def restore(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotRestoreRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotRestoreResponse] = js.native
    
    def status(): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: Unit, options: TransportRequestOptions): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotStatusResponse, Any]] = js.native
    def status(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: SnapshotStatusRequest): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: SnapshotStatusRequest, options: TransportRequestOptions): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: SnapshotStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotStatusResponse, Any]] = js.native
    def status(params: SnapshotStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotStatusResponse] = js.native
    def status(params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotStatusRequest): js.Promise[SnapshotStatusResponse] = js.native
    def status(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotStatusResponse] = js.native
    def status(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotStatusResponse, Any]] = js.native
    def status(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotStatusResponse] = js.native
    
    var transport: Transport = js.native
    
    def verifyRepository(params: SnapshotVerifyRepositoryRequest): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
    def verifyRepository(params: SnapshotVerifyRepositoryRequest, options: TransportRequestOptions): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
    def verifyRepository(params: SnapshotVerifyRepositoryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SnapshotVerifyRepositoryResponse, Any]] = js.native
    def verifyRepository(params: SnapshotVerifyRepositoryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
    def verifyRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotVerifyRepositoryRequest
    ): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
    def verifyRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotVerifyRepositoryRequest,
      options: TransportRequestOptions
    ): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
    def verifyRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotVerifyRepositoryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SnapshotVerifyRepositoryResponse, Any]] = js.native
    def verifyRepository(
      params: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.SnapshotVerifyRepositoryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SnapshotVerifyRepositoryResponse] = js.native
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
