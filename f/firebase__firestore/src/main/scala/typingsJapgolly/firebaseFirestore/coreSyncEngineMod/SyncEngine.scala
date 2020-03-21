package typingsJapgolly.firebaseFirestore.coreSyncEngineMod

import typingsJapgolly.firebaseFirestore.authUserMod.User
import typingsJapgolly.firebaseFirestore.coreQueryMod.Query
import typingsJapgolly.firebaseFirestore.coreTransactionMod.Transaction
import typingsJapgolly.firebaseFirestore.coreTypesMod.BatchId
import typingsJapgolly.firebaseFirestore.coreTypesMod.OnlineState
import typingsJapgolly.firebaseFirestore.coreTypesMod.OnlineStateSource
import typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.localLocalStoreMod.LocalStore
import typingsJapgolly.firebaseFirestore.localSharedClientStateMod.SharedClientState
import typingsJapgolly.firebaseFirestore.localSharedClientStateSyncerMod.SharedClientStateSyncer
import typingsJapgolly.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.modelMutationBatchMod.MutationBatchResult
import typingsJapgolly.firebaseFirestore.modelMutationMod.Mutation
import typingsJapgolly.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import typingsJapgolly.firebaseFirestore.remoteRemoteStoreMod.RemoteStore
import typingsJapgolly.firebaseFirestore.remoteRemoteSyncerMod.RemoteSyncer
import typingsJapgolly.firebaseFirestore.srcUtilPromiseMod.Deferred
import typingsJapgolly.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.utilErrorMod.FirestoreError
import typingsJapgolly.firebaseFirestore.utilSortedMapMod.SortedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/core/sync_engine", "SyncEngine")
@js.native
class SyncEngine protected ()
  extends RemoteSyncer
     with SharedClientStateSyncer {
  def this(
    localStore: LocalStore,
    remoteStore: RemoteStore,
    sharedClientState: SharedClientState,
    currentUser: User
  ) = this()
  var addMutationCallback: js.Any = js.native
  var assertSubscribed: js.Any = js.native
  var currentUser: js.Any = js.native
  var emitNewSnapsAndNotifyLocalStore: js.Any = js.native
  /**
    * Registers a view for a previously unknown query and computes its initial
    * snapshot.
    */
  var initializeViewAndComputeSnapshot: js.Any = js.native
  var isPrimary: js.Any = js.native
  var limboDocumentRefs: js.Any = js.native
  var limboResolutionsByTarget: js.Any = js.native
  var limboTargetIdGenerator: js.Any = js.native
  var limboTargetsByKey: js.Any = js.native
  var localStore: js.Any = js.native
  /** Stores user completion handlers, indexed by User and BatchId. */
  var mutationUserCallbacks: js.Any = js.native
  var onlineState: js.Any = js.native
  /** Stores user callbacks waiting for all pending writes to be acknowledged. */
  var pendingWritesCallbacks: js.Any = js.native
  /**
    * Resolves or rejects the user callback for the given batch and then discards
    * it.
    */
  var processUserCallback: js.Any = js.native
  var queriesByTarget: js.Any = js.native
  var queryViewsByQuery: js.Any = js.native
  /** Reject all outstanding callbacks waiting for pending writes to complete. */
  var rejectOutstandingPendingWritesCallbacks: js.Any = js.native
  var remoteStore: js.Any = js.native
  var removeAndCleanupTarget: js.Any = js.native
  var removeLimboTarget: js.Any = js.native
  var resetLimboDocuments: js.Any = js.native
  var sharedClientState: js.Any = js.native
  var syncEngineListener: js.Any = js.native
  /**
    * Reconcile the query views of the provided query targets with the state from
    * persistence. Raises snapshots for any changes that affect the local
    * client and returns the updated state of all target's query data.
    */
  var synchronizeQueryViewsAndRaiseSnapshots: js.Any = js.native
  /**
    * Reconcile the list of synced documents in an existing view with those
    * from persistence.
    */
  var synchronizeViewAndComputeSnapshot: js.Any = js.native
  /**
    * Creates a `Query` object from the specified `Target`. There is no way to
    * obtain the original `Query`, so we synthesize a `Query` from the `Target`
    * object.
    *
    * The synthesized result might be different from the original `Query`, but
    * since the synthesized `Query` should return the same results as the
    * original one (only the presentation of results might differ), the potential
    * difference will not cause issues.
    */
  var synthesizeTargetToQuery: js.Any = js.native
  var trackLimboChange: js.Any = js.native
  /**
    * Triggers the callbacks that are waiting for this batch id to get acknowledged by server,
    * if there are any.
    */
  var triggerPendingWritesCallbacks: js.Any = js.native
  var updateTrackedLimbos: js.Any = js.native
  /**
    * Applies an OnlineState change to the sync engine and notifies any views of
    * the change.
    */
  def applyOnlineStateChange(onlineState: OnlineState, source: OnlineStateSource): Unit = js.native
  def applyPrimaryState(isPrimary: Boolean): js.Promise[Unit] = js.native
  /**
    * Applies one remote event to the sync engine, notifying any views of the
    * changes, and releasing any pending mutation batches that would become
    * visible because of the snapshot version the remote event contains.
    */
  /* CompleteClass */
  override def applyRemoteEvent(remoteEvent: RemoteEvent): js.Promise[Unit] = js.native
  /**
    * Applies the result of a successful write of a mutation batch to the sync
    * engine, emitting snapshots in any views that the mutation applies to, and
    * removing the batch from the mutation queue.
    */
  /* CompleteClass */
  override def applySuccessfulWrite(result: MutationBatchResult): js.Promise[Unit] = js.native
  def currentLimboDocs(): SortedMap[DocumentKey, TargetId] = js.native
  def disableNetwork(): js.Promise[Unit] = js.native
  def enableNetwork(): js.Promise[Unit] = js.native
  /**
    * Returns the set of remote document keys for the given target ID. This list
    * includes the documents that were assigned to the target when we received
    * the last snapshot.
    */
  /* CompleteClass */
  override def getRemoteKeysForTarget(targetId: TargetId): DocumentKeySet_ = js.native
  def handleCredentialChange(user: User): js.Promise[Unit] = js.native
  def isPrimaryClient(): Boolean = js.native
  /**
    * Initiates the new listen, resolves promise when listen enqueued to the
    * server. All the subsequent view snapshots or errors are sent to the
    * subscribed handlers. Returns the targetId of the query.
    */
  def listen(query: Query): js.Promise[TargetId] = js.native
  /**
    * Registers a user callback that resolves when all pending mutations at the moment of calling
    * are acknowledged .
    */
  def registerPendingWritesCallback(callback: Deferred[Unit]): js.Promise[Unit] = js.native
  /**
    * Rejects the batch, removing the batch from the mutation queue, recomputing
    * the local view of any documents affected by the batch and then, emitting
    * snapshots with the reverted value.
    */
  /* CompleteClass */
  override def rejectFailedWrite(batchId: BatchId, error: FirestoreError): js.Promise[Unit] = js.native
  /**
    * Rejects the listen for the given targetID. This can be triggered by the
    * backend for any active target.
    *
    * @param targetId The targetID corresponds to one previously initiated by the
    * user as part of TargetData passed to listen() on RemoteStore.
    * @param error A description of the condition that has forced the rejection.
    * Nearly always this will be an indication that the user is no longer
    * authorized to see the data matching the target.
    */
  /* CompleteClass */
  override def rejectListen(targetId: TargetId, error: FirestoreError): js.Promise[Unit] = js.native
  /**
    * Takes an updateFunction in which a set of reads and writes can be performed
    * atomically. In the updateFunction, the client can read and write values
    * using the supplied transaction object. After the updateFunction, all
    * changes will be committed. If a retryable error occurs (ex: some other
    * client has changed any of the data referenced), then the updateFunction
    * will be called again after a backoff. If the updateFunction still fails
    * after all retries, then the transaction will be rejected.
    *
    * The transaction object passed to the updateFunction contains methods for
    * accessing documents and collections. Unlike other datastore access, data
    * accessed with the transaction will not reflect local changes that have not
    * been committed. For this reason, it is required that all reads are
    * performed before any writes. Transactions must be performed while online.
    *
    * The Deferred input is resolved when the transaction is fully committed.
    */
  def runTransaction[T](
    asyncQueue: AsyncQueue,
    updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[T]],
    deferred: Deferred[T]
  ): Unit = js.native
  /** Subscribes to SyncEngine notifications. Has to be called exactly once. */
  def subscribe(syncEngineListener: SyncEngineListener): Unit = js.native
  /** Stops listening to the query. */
  def unlisten(query: Query): js.Promise[Unit] = js.native
  /**
    * Initiates the write of local mutation batch which involves adding the
    * writes to the mutation queue, notifying the remote store about new
    * mutations and raising events for any changes this write caused.
    *
    * The promise returned by this call is resolved when the above steps
    * have completed, *not* when the write was acked by the backend. The
    * userCallback is resolved once the write was acked/rejected by the
    * backend (or failed locally for any other reason).
    */
  def write(batch: js.Array[Mutation], userCallback: Deferred[Unit]): js.Promise[Unit] = js.native
}

