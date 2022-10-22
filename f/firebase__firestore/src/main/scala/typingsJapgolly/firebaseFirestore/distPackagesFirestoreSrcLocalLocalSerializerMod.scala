package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcAuthUserMod.User
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.NamedQuery
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreQueryMod.Query
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbBundle
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbDocumentOverlay
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbIndexConfiguration
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbIndexState
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbMutationBatch
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbNamedQuery
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbRemoteDocument
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbTarget
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSchemaMod.DbTimestamp
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSentinelsMod.DbDocumentOverlayKey
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalIndexeddbSentinelsMod.DbTimestampKey
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelDocumentMod.MutableDocument
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelFieldIndexMod.IndexOffset
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelMutationBatchMod.MutationBatch
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcModelOverlayMod.Overlay
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.BundledQuery
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalLocalSerializerMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_serializer", "LocalSerializer")
  @js.native
  open class LocalSerializer protected () extends StObject {
    def this(remoteSerializer: JsonProtoSerializer) = this()
    
    val remoteSerializer: JsonProtoSerializer = js.native
  }
  
  inline def fromBundleMetadata(metadata: BundleMetadata): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBundleMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleMetadata]
  
  inline def fromBundledQuery(bundledQuery: BundledQuery): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBundledQuery")(bundledQuery.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def fromDbBundle(dbBundle: DbBundle): typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbBundle")(dbBundle.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleMetadata]
  
  inline def fromDbDocumentOverlay(localSerializer: LocalSerializer, dbDocumentOverlay: DbDocumentOverlay): Overlay = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbDocumentOverlay")(localSerializer.asInstanceOf[js.Any], dbDocumentOverlay.asInstanceOf[js.Any])).asInstanceOf[Overlay]
  
  inline def fromDbIndexConfiguration(index: DbIndexConfiguration): FieldIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbIndexConfiguration")(index.asInstanceOf[js.Any]).asInstanceOf[FieldIndex]
  inline def fromDbIndexConfiguration(index: DbIndexConfiguration, state: DbIndexState): FieldIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbIndexConfiguration")(index.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[FieldIndex]
  
  inline def fromDbMutationBatch(localSerializer: LocalSerializer, dbBatch: DbMutationBatch): MutationBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbMutationBatch")(localSerializer.asInstanceOf[js.Any], dbBatch.asInstanceOf[js.Any])).asInstanceOf[MutationBatch]
  
  inline def fromDbNamedQuery(dbNamedQuery: DbNamedQuery): NamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbNamedQuery")(dbNamedQuery.asInstanceOf[js.Any]).asInstanceOf[NamedQuery]
  
  inline def fromDbRemoteDocument(localSerializer: LocalSerializer, remoteDoc: DbRemoteDocument): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbRemoteDocument")(localSerializer.asInstanceOf[js.Any], remoteDoc.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def fromDbTarget(dbTarget: DbTarget): TargetData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbTarget")(dbTarget.asInstanceOf[js.Any]).asInstanceOf[TargetData]
  
  inline def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbTimestampKey")(dbTimestampKey.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
  
  inline def fromProtoNamedQuery(
    namedQuery: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
  ): NamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProtoNamedQuery")(namedQuery.asInstanceOf[js.Any]).asInstanceOf[NamedQuery]
  
  inline def toDbBundle(metadata: BundleMetadata): DbBundle = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbBundle")(metadata.asInstanceOf[js.Any]).asInstanceOf[DbBundle]
  
  inline def toDbDocumentOverlay(localSerializer: LocalSerializer, userId: String, overlay: Overlay): DbDocumentOverlay = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbDocumentOverlay")(localSerializer.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any])).asInstanceOf[DbDocumentOverlay]
  
  inline def toDbDocumentOverlayKey(userId: String, docKey: DocumentKey): DbDocumentOverlayKey = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbDocumentOverlayKey")(userId.asInstanceOf[js.Any], docKey.asInstanceOf[js.Any])).asInstanceOf[DbDocumentOverlayKey]
  
  inline def toDbIndexConfiguration(index: FieldIndex): DbIndexConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbIndexConfiguration")(index.asInstanceOf[js.Any]).asInstanceOf[DbIndexConfiguration]
  
  inline def toDbIndexState(indexId: Double, user: User, sequenceNumber: Double, offset: IndexOffset): DbIndexState = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbIndexState")(indexId.asInstanceOf[js.Any], user.asInstanceOf[js.Any], sequenceNumber.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[DbIndexState]
  
  inline def toDbMutationBatch(localSerializer: LocalSerializer, userId: String, batch: MutationBatch): DbMutationBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbMutationBatch")(localSerializer.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[DbMutationBatch]
  
  inline def toDbNamedQuery(
    query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
  ): DbNamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbNamedQuery")(query.asInstanceOf[js.Any]).asInstanceOf[DbNamedQuery]
  
  inline def toDbRemoteDocument(localSerializer: LocalSerializer, document: MutableDocument): DbRemoteDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbRemoteDocument")(localSerializer.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[DbRemoteDocument]
  
  inline def toDbTarget(localSerializer: LocalSerializer, targetData: TargetData): DbTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbTarget")(localSerializer.asInstanceOf[js.Any], targetData.asInstanceOf[js.Any])).asInstanceOf[DbTarget]
  
  inline def toDbTimestamp(snapshotVersion: SnapshotVersion): DbTimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbTimestamp")(snapshotVersion.asInstanceOf[js.Any]).asInstanceOf[DbTimestamp]
  
  inline def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbTimestampKey")(snapshotVersion.asInstanceOf[js.Any]).asInstanceOf[DbTimestampKey]
}
