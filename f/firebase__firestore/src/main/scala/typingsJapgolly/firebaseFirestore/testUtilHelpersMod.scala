package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.apiBlobMod.Blob
import typingsJapgolly.firebaseFirestore.apiUserDataConverterMod.DocumentKeyReference
import typingsJapgolly.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.coreQueryMod.Bound
import typingsJapgolly.firebaseFirestore.coreQueryMod.FieldFilter
import typingsJapgolly.firebaseFirestore.coreQueryMod.OrderBy
import typingsJapgolly.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.coreTypesMod.ProtoByteString
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.coreViewMod.LimboDocumentChange
import typingsJapgolly.firebaseFirestore.coreViewMod.View
import typingsJapgolly.firebaseFirestore.coreViewMod.ViewChange
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.LessthansignDELETEGreaterthansign
import typingsJapgolly.firebaseFirestore.localLocalViewChangesMod.LocalViewChanges
import typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.localTargetDataMod.TargetPurpose
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import typingsJapgolly.firebaseFirestore.modelDocumentComparatorMod.DocumentComparator
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.modelDocumentMod.Document
import typingsJapgolly.firebaseFirestore.modelDocumentMod.DocumentOptions
import typingsJapgolly.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsJapgolly.firebaseFirestore.modelDocumentMod.NoDocument
import typingsJapgolly.firebaseFirestore.modelDocumentMod.UnknownDocument
import typingsJapgolly.firebaseFirestore.modelDocumentSetMod.DocumentSet
import typingsJapgolly.firebaseFirestore.modelMutationMod.DeleteMutation
import typingsJapgolly.firebaseFirestore.modelMutationMod.FieldMask
import typingsJapgolly.firebaseFirestore.modelMutationMod.MutationResult
import typingsJapgolly.firebaseFirestore.modelMutationMod.PatchMutation
import typingsJapgolly.firebaseFirestore.modelMutationMod.Precondition
import typingsJapgolly.firebaseFirestore.modelMutationMod.SetMutation
import typingsJapgolly.firebaseFirestore.modelMutationMod.TransformMutation
import typingsJapgolly.firebaseFirestore.modelPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.modelPathMod.ResourcePath
import typingsJapgolly.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import typingsJapgolly.firebaseFirestore.remoteRemoteEventMod.TargetChange
import typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.FieldValue
import typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import typingsJapgolly.firebaseFirestore.utilObjMod.Dict
import typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap
import typingsJapgolly.firebaseFirestore.utilSortedSetMod.SortedSet
import typingsJapgolly.firebaseFirestoreTypes.mod.OrderByDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/helpers", JSImport.Namespace)
@js.native
object testUtilHelpersMod extends js.Object {
  @js.native
  class DocComparator () extends js.Object
  
  val DELETE_SENTINEL: LessthansignDELETEGreaterthansign = js.native
  def ackTarget(docsOrKeys: (Document | String)*): TargetChange = js.native
  def addTargetMapping(docsOrKeys: (Document | String)*): TargetChange = js.native
  def applyDocChanges(view: View, docsOrKeys: (Document | DocumentKey)*): ViewChange = js.native
  def blob(bytes: Double*): Blob = js.native
  def bound(values: js.Array[js.Tuple3[String, js.Object, OrderByDirection]], before: Boolean): Bound = js.native
  def dbId(project: String): DatabaseId = js.native
  def dbId(project: String, database: String): DatabaseId = js.native
  def deleteMutation(keyStr: String): DeleteMutation = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion): NoDocument = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion, options: DocumentOptions): NoDocument = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_]): Document = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_], options: DocumentOptions): Document = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument]): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument], updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId], removedFromTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(
    doc: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def documentSet(comp: DocumentComparator, docs: Document*): DocumentSet = js.native
  def documentSet(docs: Document*): DocumentSet = js.native
  def documentSetAsArray(docs: DocumentSet): js.Array[Document] = js.native
  def documentUpdates(docsOrKeys: (Document | DocumentKey)*): MaybeDocumentMap_ = js.native
  def expectCorrectComparisonGroups[T /* <: js.Any */](groups: js.Array[js.Array[T]], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectCorrectComparisons[T /* <: js.Any */](array: js.Array[T], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_]): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_], message: String): Unit = js.native
  def expectEqualitySets[T](elems: js.Array[js.Array[T]], equalityFn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Unit = js.native
  def expectFirestoreError(err: js.Error): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectSetToEqual[T](set: SortedSet[T], arr: js.Array[T]): Unit = js.native
  def field(path: String): FieldPath = js.native
  def filter(path: String, op: String, value: js.Any): FieldFilter = js.native
  def key(path: String): DocumentKey = js.native
  def keySet(keys: DocumentKey*): DocumentKeySet_ = js.native
  def keys(documents: (MaybeDocument | String)*): DocumentKeySet_ = js.native
  def limboChanges(changes: AnonAddedArray): js.Array[LimboDocumentChange] = js.native
  def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: AnonAddedRemoved): LocalViewChanges = js.native
  def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[AnonKey[K, V]] = js.native
  def mask(paths: String*): FieldMask = js.native
  def mutationResult(testVersion: TestSnapshotVersion): MutationResult = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double): RemoteEvent = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double, resumeToken: ProtoByteString): RemoteEvent = js.native
  def orderBy(path: String): OrderBy = js.native
  def orderBy(path: String, op: String): OrderBy = js.native
  def patchMutation(keyStr: String, json: JsonObject[_]): PatchMutation = js.native
  def patchMutation(keyStr: String, json: JsonObject[_], precondition: Precondition): PatchMutation = js.native
  def path(path: String): ResourcePath = js.native
  def path(path: String, offset: Double): ResourcePath = js.native
  def ref(dbIdStr: String, keyStr: String): DocumentKeyReference = js.native
  def ref(dbIdStr: String, keyStr: String, offset: Double): DocumentKeyReference = js.native
  def removedDoc(keyStr: String): NoDocument = js.native
  def resumeTokenForSnapshot(snapshotVersion: SnapshotVersion): ProtoByteString = js.native
  def setMutation(keyStr: String, json: JsonObject[_]): SetMutation = js.native
  def size(obj: JsonObject[_]): Double = js.native
  def targetData(targetId: TargetId, queryPurpose: TargetPurpose, path: String): TargetData = js.native
  def transformMutation(keyStr: String, data: Dict[_]): TransformMutation = js.native
  def unknownDoc(keyStr: String, ver: TestSnapshotVersion): UnknownDocument = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String]
  ): TargetChange = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String],
    current: Boolean
  ): TargetChange = js.native
  def version(v: TestSnapshotVersion): SnapshotVersion = js.native
  def wrap(value: js.Any): FieldValue = js.native
  def wrapObject(obj: JsonObject[_]): ObjectValue = js.native
  /* static members */
  @js.native
  object DocComparator extends js.Object {
    def byField(fields: String*): DocumentComparator = js.native
  }
  
  type TestSnapshotVersion = Double
}

