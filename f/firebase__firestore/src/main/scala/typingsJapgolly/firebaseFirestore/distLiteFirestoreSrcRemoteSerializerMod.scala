package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Direction
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.FieldFilter
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Operator
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.OrderBy
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Target
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.MutableDocument
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelFieldMaskMod.FieldMask
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelMutationMod.MutationResult
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelObjectValueMod.ObjectValue
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelPathMod.ResourcePath
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.BatchGetDocumentsResponse
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Document
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.DocumentMask
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.DocumentsTarget
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldFilterOp
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.FieldReference
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Filter
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ListenResponse
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Order
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.QueryTarget
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.RunAggregationQueryRequest
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Timestamp
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Write
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.WriteResult
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteNumberSerializerMod.Serializer
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteWatchChangeMod.WatchChange
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcRemoteSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/remote/serializer", "JsonProtoSerializer")
  @js.native
  open class JsonProtoSerializer protected ()
    extends StObject
       with Serializer {
    def this(databaseId: DatabaseId, useProto3Json: Boolean) = this()
    
    val databaseId: DatabaseId = js.native
    
    /* CompleteClass */
    override val useProto3Json: Boolean = js.native
  }
  
  inline def convertQueryTargetToQuery(target: QueryTarget): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("convertQueryTargetToQuery")(target.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def fromBatchGetDocumentsResponse(serializer: JsonProtoSerializer, result: BatchGetDocumentsResponse): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBatchGetDocumentsResponse")(serializer.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def fromBytes(serializer: JsonProtoSerializer): ByteString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(serializer.asInstanceOf[js.Any]).asInstanceOf[ByteString]
  inline def fromBytes(serializer: JsonProtoSerializer, value: String): ByteString = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(serializer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ByteString]
  inline def fromBytes(serializer: JsonProtoSerializer, value: js.typedarray.Uint8Array): ByteString = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(serializer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ByteString]
  
  inline def fromDirection(): js.UndefOr[Direction] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDirection")().asInstanceOf[js.UndefOr[Direction]]
  inline def fromDirection(dir: OrderDirection): js.UndefOr[Direction] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDirection")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Direction]]
  
  inline def fromDocument(serializer: JsonProtoSerializer, document: Document): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDocument")(serializer.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  inline def fromDocument(serializer: JsonProtoSerializer, document: Document, hasCommittedMutations: Boolean): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDocument")(serializer.asInstanceOf[js.Any], document.asInstanceOf[js.Any], hasCommittedMutations.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def fromDocumentMask(proto: DocumentMask): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDocumentMask")(proto.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  
  inline def fromDocumentsTarget(documentsTarget: DocumentsTarget): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDocumentsTarget")(documentsTarget.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def fromFieldFilter(filter: Filter): typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFieldFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Filter]
  
  inline def fromFieldPathReference(fieldReference: FieldReference): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFieldPathReference")(fieldReference.asInstanceOf[js.Any]).asInstanceOf[FieldPath]
  
  inline def fromMutation(serializer: JsonProtoSerializer, proto: Write): Mutation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMutation")(serializer.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Mutation]
  
  inline def fromName(serializer: JsonProtoSerializer, name: String): DocumentKey = (^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(serializer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[DocumentKey]
  
  inline def fromOperatorName(op: FieldFilterOp): Operator = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOperatorName")(op.asInstanceOf[js.Any]).asInstanceOf[Operator]
  
  inline def fromPropertyOrder(orderBy: Order): OrderBy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPropertyOrder")(orderBy.asInstanceOf[js.Any]).asInstanceOf[OrderBy]
  
  inline def fromQueryTarget(target: QueryTarget): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def fromUnaryFilter(filter: Filter): typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnaryFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Filter]
  
  inline def fromVersion(version: Timestamp): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVersion")(version.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
  
  inline def fromWatchChange(serializer: JsonProtoSerializer, change: ListenResponse): WatchChange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWatchChange")(serializer.asInstanceOf[js.Any], change.asInstanceOf[js.Any])).asInstanceOf[WatchChange]
  
  inline def fromWriteResults(): js.Array[MutationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWriteResults")().asInstanceOf[js.Array[MutationResult]]
  inline def fromWriteResults(protos: js.Array[WriteResult]): js.Array[MutationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWriteResults")(protos.asInstanceOf[js.Any]).asInstanceOf[js.Array[MutationResult]]
  inline def fromWriteResults(protos: js.Array[WriteResult], commitTime: Timestamp): js.Array[MutationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWriteResults")(protos.asInstanceOf[js.Any], commitTime.asInstanceOf[js.Any])).asInstanceOf[js.Array[MutationResult]]
  inline def fromWriteResults(protos: Unit, commitTime: Timestamp): js.Array[MutationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWriteResults")(protos.asInstanceOf[js.Any], commitTime.asInstanceOf[js.Any])).asInstanceOf[js.Array[MutationResult]]
  
  inline def getEncodedDatabaseId(serializer: JsonProtoSerializer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedDatabaseId")(serializer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isValidResourceName(path: ResourcePath): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidResourceName")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toBytes(serializer: JsonProtoSerializer, bytes: ByteString): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(serializer.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  
  inline def toDirection(dir: Direction): OrderDirection = ^.asInstanceOf[js.Dynamic].applyDynamic("toDirection")(dir.asInstanceOf[js.Any]).asInstanceOf[OrderDirection]
  
  inline def toDocument(serializer: JsonProtoSerializer, document: MutableDocument): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("toDocument")(serializer.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def toDocumentMask(fieldMask: FieldMask): DocumentMask = ^.asInstanceOf[js.Dynamic].applyDynamic("toDocumentMask")(fieldMask.asInstanceOf[js.Any]).asInstanceOf[DocumentMask]
  
  inline def toDocumentsTarget(serializer: JsonProtoSerializer, target: Target): DocumentsTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("toDocumentsTarget")(serializer.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DocumentsTarget]
  
  inline def toFieldPathReference(path: FieldPath): FieldReference = ^.asInstanceOf[js.Dynamic].applyDynamic("toFieldPathReference")(path.asInstanceOf[js.Any]).asInstanceOf[FieldReference]
  
  inline def toListenRequestLabels(serializer: JsonProtoSerializer, targetData: TargetData): ApiClientObjectMap[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("toListenRequestLabels")(serializer.asInstanceOf[js.Any], targetData.asInstanceOf[js.Any])).asInstanceOf[ApiClientObjectMap[String] | Null]
  
  inline def toMutation(serializer: JsonProtoSerializer, mutation: Mutation): Write = (^.asInstanceOf[js.Dynamic].applyDynamic("toMutation")(serializer.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any])).asInstanceOf[Write]
  
  inline def toMutationDocument(serializer: JsonProtoSerializer, key: DocumentKey, fields: ObjectValue): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("toMutationDocument")(serializer.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def toName(serializer: JsonProtoSerializer, key: DocumentKey): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toName")(serializer.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toOperatorName(op: Operator): FieldFilterOp = ^.asInstanceOf[js.Dynamic].applyDynamic("toOperatorName")(op.asInstanceOf[js.Any]).asInstanceOf[FieldFilterOp]
  
  inline def toPropertyOrder(orderBy: OrderBy): Order = ^.asInstanceOf[js.Dynamic].applyDynamic("toPropertyOrder")(orderBy.asInstanceOf[js.Any]).asInstanceOf[Order]
  
  inline def toQueryTarget(serializer: JsonProtoSerializer, target: Target): QueryTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryTarget")(serializer.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[QueryTarget]
  
  inline def toResourceName(databaseId: DatabaseId, path: ResourcePath): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toResourceName")(databaseId.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toRunAggregationQueryRequest(serializer: JsonProtoSerializer, target: Target): RunAggregationQueryRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("toRunAggregationQueryRequest")(serializer.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[RunAggregationQueryRequest]
  
  inline def toTarget(serializer: JsonProtoSerializer, targetData: TargetData): typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target = (^.asInstanceOf[js.Dynamic].applyDynamic("toTarget")(serializer.asInstanceOf[js.Any], targetData.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Target]
  
  inline def toTimestamp(
    serializer: JsonProtoSerializer,
    timestamp: typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiTimestampMod.Timestamp
  ): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("toTimestamp")(serializer.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  inline def toUnaryOrFieldFilter(filter: FieldFilter): Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnaryOrFieldFilter")(filter.asInstanceOf[js.Any]).asInstanceOf[Filter]
  
  inline def toVersion(serializer: JsonProtoSerializer, version: SnapshotVersion): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("toVersion")(serializer.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  inline def versionFromListenResponse(change: ListenResponse): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("versionFromListenResponse")(change.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
}
