package typingsJapgolly.firebaseFirestore.persistenceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.indexManagerMod.IndexManager
import typingsJapgolly.firebaseFirestore.mutationQueueMod.MutationQueue
import typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import typingsJapgolly.firebaseFirestore.sharedClientStateMod.ClientId
import typingsJapgolly.firebaseFirestore.targetCacheMod.TargetCache
import typingsJapgolly.firebaseFirestore.userMod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Persistence extends js.Object {
  val referenceDelegate: ReferenceDelegate
  /**
    * Whether or not this persistence instance has been started.
    */
  val started: Boolean
  /**
    * Returns the IDs of the clients that are currently active. If multi-tab
    * is not supported, returns an array that only contains the local client's
    * ID.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def getActiveClients(): js.Promise[js.Array[ClientId]]
  /**
    * Returns an IndexManager instance that manages our persisted query indexes.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getIndexManager(): IndexManager
  /**
    * Returns a MutationQueue representing the persisted mutations for the
    * given user.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called for a given user. In particular, the memory-backed
    * implementation does this to emulate the persisted implementation to the
    * extent possible (e.g. in the case of uid switching from
    * sally=>jack=>sally, sally's mutation queue will be preserved).
    */
  def getMutationQueue(user: User): MutationQueue
  /**
    * Returns a RemoteDocumentCache representing the persisted cache of remote
    * documents.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getRemoteDocumentCache(): RemoteDocumentCache
  /**
    * Returns a TargetCache representing the persisted cache of targets.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getTargetCache(): TargetCache
  /**
    * Performs an operation inside a persistence transaction. Any reads or writes
    * against persistence must be performed within a transaction. Writes will be
    * committed atomically once the transaction completes.
    *
    * Persistence operations are asynchronous and therefore the provided
    * transactionOperation must return a PersistencePromise. When it is resolved,
    * the transaction will be committed and the Promise returned by this method
    * will resolve.
    *
    * @param action A description of the action performed by this transaction,
    * used for logging.
    * @param mode The underlying mode of the IndexedDb transaction. Can be
    * 'readonly`, 'readwrite' or 'readwrite-primary'. Transactions marked
    * 'readwrite-primary' can only be executed by the primary client. In this
    * mode, the transactionOperation will not be run if the primary lease cannot
    * be acquired and the returned promise will be rejected with a
    * FAILED_PRECONDITION error.
    * @param transactionOperation The operation to run inside a transaction.
    * @return A promise that is resolved once the transaction completes.
    */
  def runTransaction[T](
    action: String,
    mode: PersistenceTransactionMode,
    transactionOperation: js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[T]]
  ): js.Promise[T]
  /**
    * Registers a listener that gets called when the database receives a
    * version change event indicating that it has deleted.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setDatabaseDeletedListener(databaseDeletedListener: js.Function0[js.Promise[Unit]]): Unit
  /**
    * Adjusts the current network state in the client's metadata, potentially
    * affecting the primary lease.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setNetworkEnabled(networkEnabled: Boolean): Unit
  /**
    * Registers a listener that gets called when the primary state of the
    * instance changes. Upon registering, this listener is invoked immediately
    * with the current primary state.
    *
    * PORTING NOTE: This is only used for Web multi-tab.
    */
  def setPrimaryStateListener(primaryStateListener: PrimaryStateListener): js.Promise[Unit]
  /**
    * Releases any resources held during eager shutdown.
    */
  def shutdown(): js.Promise[Unit]
}

object Persistence {
  @scala.inline
  def apply(
    getActiveClients: CallbackTo[js.Promise[js.Array[ClientId]]],
    getIndexManager: CallbackTo[IndexManager],
    getMutationQueue: User => CallbackTo[MutationQueue],
    getRemoteDocumentCache: CallbackTo[RemoteDocumentCache],
    getTargetCache: CallbackTo[TargetCache],
    referenceDelegate: ReferenceDelegate,
    runTransaction: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[js.Any]]) => CallbackTo[js.Promise[js.Any]],
    setDatabaseDeletedListener: js.Function0[js.Promise[Unit]] => Callback,
    setNetworkEnabled: Boolean => Callback,
    setPrimaryStateListener: PrimaryStateListener => CallbackTo[js.Promise[Unit]],
    shutdown: CallbackTo[js.Promise[Unit]],
    started: Boolean
  ): Persistence = {
    val __obj = js.Dynamic.literal(referenceDelegate = referenceDelegate.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("getActiveClients")(getActiveClients.toJsFn)
    __obj.updateDynamic("getIndexManager")(getIndexManager.toJsFn)
    __obj.updateDynamic("getMutationQueue")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.userMod.User) => getMutationQueue(t0).runNow()))
    __obj.updateDynamic("getRemoteDocumentCache")(getRemoteDocumentCache.toJsFn)
    __obj.updateDynamic("getTargetCache")(getTargetCache.toJsFn)
    __obj.updateDynamic("runTransaction")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransactionMode, t2: js.Function1[
  /* transaction */ typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction, 
  typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise[js.Any]]) => runTransaction(t0, t1, t2).runNow()))
    __obj.updateDynamic("setDatabaseDeletedListener")(js.Any.fromFunction1((t0: js.Function0[js.Promise[scala.Unit]]) => setDatabaseDeletedListener(t0).runNow()))
    __obj.updateDynamic("setNetworkEnabled")(js.Any.fromFunction1((t0: scala.Boolean) => setNetworkEnabled(t0).runNow()))
    __obj.updateDynamic("setPrimaryStateListener")(js.Any.fromFunction1((t0: typingsJapgolly.firebaseFirestore.persistenceMod.PrimaryStateListener) => setPrimaryStateListener(t0).runNow()))
    __obj.updateDynamic("shutdown")(shutdown.toJsFn)
    __obj.asInstanceOf[Persistence]
  }
}

