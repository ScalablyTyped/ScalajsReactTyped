package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentVersionMap_
import typingsJapgolly.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.documentMod.MaybeDocument
import typingsJapgolly.firebaseFirestore.firebaseFirestoreNumbers.`-1`
import typingsJapgolly.firebaseFirestore.mutationMod.Mutation
import typingsJapgolly.firebaseFirestore.mutationMod.MutationResult
import typingsJapgolly.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typingsJapgolly.firebaseFirestore.timestampMod.Timestamp
import typingsJapgolly.firebaseFirestore.typesMod.BatchId
import typingsJapgolly.firebaseFirestore.typesMod.ProtoByteString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/mutation_batch", JSImport.Namespace)
@js.native
object mutationBatchMod extends js.Object {
  @js.native
  class MutationBatch protected () extends js.Object {
    /**
      * @param batchId The unique ID of this mutation batch.
      * @param localWriteTime The original write time of this mutation.
      * @param baseMutations Mutations that are used to populate the base
      * values when this mutation is applied locally. This can be used to locally
      * overwrite values that are persisted in the remote document cache. Base
      * mutations are never sent to the backend.
      * @param mutations The user-provided mutations in this mutation batch.
      * User-provided mutations are applied both locally and remotely on the
      * backend.
      */
    def this(
      batchId: BatchId,
      localWriteTime: Timestamp,
      baseMutations: js.Array[Mutation],
      mutations: js.Array[Mutation]
    ) = this()
    var baseMutations: js.Array[Mutation] = js.native
    var batchId: BatchId = js.native
    var localWriteTime: Timestamp = js.native
    var mutations: js.Array[Mutation] = js.native
    /**
      * Computes the local view for all provided documents given the mutations in
      * this batch.
      */
    def applyToLocalDocumentSet(maybeDocs: MaybeDocumentMap_): MaybeDocumentMap_ = js.native
    def applyToLocalView(docKey: DocumentKey): MaybeDocument | Null = js.native
    /**
      * Computes the local view of a document given all the mutations in this
      * batch.
      *
      * @param docKey The key of the document to apply mutations to.
      * @param maybeDoc The document to apply mutations to.
      */
    def applyToLocalView(docKey: DocumentKey, maybeDoc: MaybeDocument): MaybeDocument | Null = js.native
    def applyToRemoteDocument(docKey: DocumentKey, maybeDoc: Null, batchResult: MutationBatchResult): MaybeDocument | Null = js.native
    /**
      * Applies all the mutations in this MutationBatch to the specified document
      * to create a new remote document
      *
      * @param docKey The key of the document to apply mutations to.
      * @param maybeDoc The document to apply mutations to.
      * @param batchResult The result of applying the MutationBatch to the
      * backend.
      */
    def applyToRemoteDocument(docKey: DocumentKey, maybeDoc: MaybeDocument, batchResult: MutationBatchResult): MaybeDocument | Null = js.native
    def isEqual(other: MutationBatch): Boolean = js.native
    def keys(): DocumentKeySet_ = js.native
  }
  
  @js.native
  class MutationBatchResult protected () extends js.Object {
    val batch: MutationBatch = js.native
    val commitVersion: SnapshotVersion = js.native
    /**
      * A pre-computed mapping from each mutated document to the resulting
      * version.
      */
    val docVersions: DocumentVersionMap_ = js.native
    val mutationResults: js.Array[MutationResult] = js.native
    val streamToken: ProtoByteString = js.native
  }
  
  val BATCHID_UNKNOWN: `-1` = js.native
  /* static members */
  @js.native
  object MutationBatchResult extends js.Object {
    /**
      * Creates a new MutationBatchResult for the given batch and results. There
      * must be one result for each mutation in the batch. This static factory
      * caches a document=>version mapping (docVersions).
      */
    def from(
      batch: MutationBatch,
      commitVersion: SnapshotVersion,
      results: js.Array[MutationResult],
      streamToken: ProtoByteString
    ): MutationBatchResult = js.native
  }
  
}

