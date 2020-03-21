package typingsJapgolly.firebaseFirestore.localMutationQueueMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.apiTimestampMod.Timestamp
import typingsJapgolly.firebaseFirestore.coreQueryMod.Query
import typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.coreTypesMod.ProtoByteString
import typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatch
import typingsJapgolly.firebaseFirestore.modelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationQueue extends js.Object {
  /**
    * Acknowledges the given batch.
    */
  def acknowledgeBatch(transaction: PersistenceTransaction, batch: MutationBatch, streamToken: ProtoByteString): PersistencePromise[Unit]
  /**
    * Creates a new mutation batch and adds it to this mutation queue.
    *
    * @param transaction The transaction this operation is scoped to.
    * @param localWriteTime The original write time of this mutation.
    * @param baseMutations Mutations that are used to populate the base values
    * when this mutation is applied locally. These mutations are used to locally
    * overwrite values that are persisted in the remote document cache.
    * @param mutations The user-provided mutations in this mutation batch.
    */
  def addMutationBatch(
    transaction: PersistenceTransaction,
    localWriteTime: Timestamp,
    baseMutations: js.Array[Mutation],
    mutations: js.Array[Mutation]
  ): PersistencePromise[MutationBatch]
  /** Returns true if this queue contains no mutation batches. */
  def checkEmpty(transaction: PersistenceTransaction): PersistencePromise[Boolean]
  /** Gets all mutation batches in the mutation queue. */
  def getAllMutationBatches(transaction: PersistenceTransaction): PersistencePromise[js.Array[MutationBatch]]
  /**
    * Finds all mutation batches that could possibly affect the given
    * document key. Not all mutations in a batch will necessarily affect the
    * document key, so when looping through the batch you'll need to check that
    * the mutation itself matches the key.
    *
    * Batches are guaranteed to be in sorted order.
    *
    * Note that because of this requirement implementations are free to return
    * mutation batches that don't contain the document key at all if it's
    * convenient.
    */
  def getAllMutationBatchesAffectingDocumentKey(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[js.Array[MutationBatch]]
  /**
    * Finds all mutation batches that could possibly affect the given set of
    * document keys. Not all mutations in a batch will necessarily affect each
    * key, so when looping through the batch you'll need to check that the
    * mutation itself matches the key.
    *
    * Batches are guaranteed to be in sorted order.
    *
    * Note that because of this requirement implementations are free to return
    * mutation batches that don't contain any of the document keys at all if it's
    * convenient.
    */
  def getAllMutationBatchesAffectingDocumentKeys(transaction: PersistenceTransaction, documentKeys: SortedMap[DocumentKey, _]): PersistencePromise[js.Array[MutationBatch]]
  /**
    * Finds all mutation batches that could affect the results for the given
    * query. Not all mutations in a batch will necessarily affect the query, so
    * when looping through the batch you'll need to check that the mutation
    * itself matches the query.
    *
    * Batches are guaranteed to be in sorted order.
    *
    * Note that because of this requirement implementations are free to return
    * mutation batches that don't match the query at all if it's convenient.
    *
    * NOTE: A PatchMutation does not need to include all fields in the query
    * filter criteria in order to be a match (but any fields it does contain do
    * need to match).
    */
  def getAllMutationBatchesAffectingQuery(transaction: PersistenceTransaction, query: Query): PersistencePromise[js.Array[MutationBatch]]
  /**
    * Gets the largest (latest) batch id in mutation queue for the current user that is pending
    * server response, returns `BATCHID_UNKNOWN` if the queue is empty.
    *
    * @return the largest batch id in the mutation queue that is not acknowledged.
    */
  def getHighestUnacknowledgedBatchId(transaction: PersistenceTransaction): PersistencePromise[BatchId]
  /** Returns the current stream token for this mutation queue. */
  def getLastStreamToken(transaction: PersistenceTransaction): PersistencePromise[ProtoByteString]
  /**
    * Gets the first unacknowledged mutation batch after the passed in batchId
    * in the mutation queue or null if empty.
    *
    * @param batchId The batch to search after, or BATCHID_UNKNOWN for the first
    * mutation in the queue.
    *
    * @return the next mutation or null if there wasn't one.
    */
  def getNextMutationBatchAfterBatchId(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null]
  /**
    * Loads the mutation batch with the given batchId.
    */
  def lookupMutationBatch(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[MutationBatch | Null]
  /**
    * Returns the document keys for the mutation batch with the given batchId.
    * For primary clients, this method returns `null` after
    * `removeMutationBatches()` has been called. Secondary clients return a
    * cached result until `removeCachedMutationKeys()` is invoked.
    */
  def lookupMutationKeys(transaction: PersistenceTransaction, batchId: BatchId): PersistencePromise[DocumentKeySet_ | Null]
  /**
    * Performs a consistency check, examining the mutation queue for any
    * leaks, if possible.
    */
  def performConsistencyCheck(transaction: PersistenceTransaction): PersistencePromise[Unit]
  /**
    * Clears the cached keys for a mutation batch. This method should be
    * called by secondary clients after they process mutation updates.
    *
    * Note that this method does not have to be called from primary clients as
    * the corresponding cache entries are cleared when an acknowledged or
    * rejected batch is removed from the mutation queue.
    */
  def removeCachedMutationKeys(batchId: BatchId): Unit
  /**
    * Removes the given mutation batch from the queue. This is useful in two
    * circumstances:
    *
    * + Removing an applied mutation from the head of the queue
    * + Removing a rejected mutation from anywhere in the queue
    *
    * Multi-Tab Note: This operation should only be called by the primary client.
    */
  def removeMutationBatch(transaction: PersistenceTransaction, batch: MutationBatch): PersistencePromise[Unit]
  /** Sets the stream token for this mutation queue. */
  def setLastStreamToken(transaction: PersistenceTransaction, streamToken: ProtoByteString): PersistencePromise[Unit]
}

object MutationQueue {
  @scala.inline
  def apply(
    acknowledgeBatch: (PersistenceTransaction, MutationBatch, ProtoByteString) => CallbackTo[PersistencePromise[Unit]],
    addMutationBatch: (PersistenceTransaction, Timestamp, js.Array[Mutation], js.Array[Mutation]) => CallbackTo[PersistencePromise[MutationBatch]],
    checkEmpty: PersistenceTransaction => CallbackTo[PersistencePromise[Boolean]],
    getAllMutationBatches: PersistenceTransaction => CallbackTo[PersistencePromise[js.Array[MutationBatch]]],
    getAllMutationBatchesAffectingDocumentKey: (PersistenceTransaction, DocumentKey) => CallbackTo[PersistencePromise[js.Array[MutationBatch]]],
    getAllMutationBatchesAffectingDocumentKeys: (PersistenceTransaction, SortedMap[DocumentKey, js.Any]) => CallbackTo[PersistencePromise[js.Array[MutationBatch]]],
    getAllMutationBatchesAffectingQuery: (PersistenceTransaction, Query) => CallbackTo[PersistencePromise[js.Array[MutationBatch]]],
    getHighestUnacknowledgedBatchId: PersistenceTransaction => CallbackTo[PersistencePromise[BatchId]],
    getLastStreamToken: PersistenceTransaction => CallbackTo[PersistencePromise[ProtoByteString]],
    getNextMutationBatchAfterBatchId: (PersistenceTransaction, BatchId) => CallbackTo[PersistencePromise[MutationBatch | Null]],
    lookupMutationBatch: (PersistenceTransaction, BatchId) => CallbackTo[PersistencePromise[MutationBatch | Null]],
    lookupMutationKeys: (PersistenceTransaction, BatchId) => CallbackTo[PersistencePromise[DocumentKeySet_ | Null]],
    performConsistencyCheck: PersistenceTransaction => CallbackTo[PersistencePromise[Unit]],
    removeCachedMutationKeys: BatchId => Callback,
    removeMutationBatch: (PersistenceTransaction, MutationBatch) => CallbackTo[PersistencePromise[Unit]],
    setLastStreamToken: (PersistenceTransaction, ProtoByteString) => CallbackTo[PersistencePromise[Unit]]
  ): MutationQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acknowledgeBatch")(js.Any.fromFunction3((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatch, t2: typingsJapgolly.firebaseFirestore.coreTypesMod.ProtoByteString) => acknowledgeBatch(t0, t1, t2).runNow()))
    __obj.updateDynamic("addMutationBatch")(js.Any.fromFunction4((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.apiTimestampMod.Timestamp, t2: js.Array[typingsJapgolly.firebaseFirestore.modelMutationMod.Mutation], t3: js.Array[typingsJapgolly.firebaseFirestore.modelMutationMod.Mutation]) => addMutationBatch(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("checkEmpty")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => checkEmpty(t0).runNow()))
    __obj.updateDynamic("getAllMutationBatches")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => getAllMutationBatches(t0).runNow()))
    __obj.updateDynamic("getAllMutationBatchesAffectingDocumentKey")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey) => getAllMutationBatchesAffectingDocumentKey(t0, t1).runNow()))
    __obj.updateDynamic("getAllMutationBatchesAffectingDocumentKeys")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap[typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey, js.Any]) => getAllMutationBatchesAffectingDocumentKeys(t0, t1).runNow()))
    __obj.updateDynamic("getAllMutationBatchesAffectingQuery")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreQueryMod.Query) => getAllMutationBatchesAffectingQuery(t0, t1).runNow()))
    __obj.updateDynamic("getHighestUnacknowledgedBatchId")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => getHighestUnacknowledgedBatchId(t0).runNow()))
    __obj.updateDynamic("getLastStreamToken")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => getLastStreamToken(t0).runNow()))
    __obj.updateDynamic("getNextMutationBatchAfterBatchId")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId) => getNextMutationBatchAfterBatchId(t0, t1).runNow()))
    __obj.updateDynamic("lookupMutationBatch")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId) => lookupMutationBatch(t0, t1).runNow()))
    __obj.updateDynamic("lookupMutationKeys")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId) => lookupMutationKeys(t0, t1).runNow()))
    __obj.updateDynamic("performConsistencyCheck")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction) => performConsistencyCheck(t0).runNow()))
    __obj.updateDynamic("removeCachedMutationKeys")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId) => removeCachedMutationKeys(t0).runNow()))
    __obj.updateDynamic("removeMutationBatch")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatch) => removeMutationBatch(t0, t1).runNow()))
    __obj.updateDynamic("setLastStreamToken")(js.Any.fromFunction2((t0: typingsJapgolly.firebaseFirestore.localPersistenceMod.PersistenceTransaction, t1: typingsJapgolly.firebaseFirestore.coreTypesMod.ProtoByteString) => setLastStreamToken(t0, t1).runNow()))
    __obj.asInstanceOf[MutationQueue]
  }
}

