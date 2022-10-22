package typingsJapgolly.firebaseFirestore.distInternalMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Persistence is the lowest-level shared interface to persistent storage in
  * Firestore.
  *
  * Persistence is used to create MutationQueue and RemoteDocumentCache
  * instances backed by persistence (which might be in-memory or LevelDB).
  *
  * Persistence also exposes an API to create and run PersistenceTransactions
  * against persistence. All read / write operations must be wrapped in a
  * transaction. Implementations of PersistenceTransaction / Persistence only
  * need to guarantee that writes made against the transaction are not made to
  * durable storage until the transaction resolves its PersistencePromise.
  * Since memory-only storage components do not alter durable storage, they are
  * free to ignore the transaction.
  *
  * This contract is enough to allow the LocalStore be be written
  * independently of whether or not the stored state actually is durably
  * persisted. If persistent storage is enabled, writes are grouped together to
  * avoid inconsistent state that could cause crashes.
  *
  * Concretely, when persistent storage is enabled, the persistent versions of
  * MutationQueue, RemoteDocumentCache, and others (the mutators) will
  * defer their writes into a transaction. Once the local store has completed
  * one logical operation, it commits the transaction.
  *
  * When persistent storage is disabled, the non-persistent versions of the
  * mutators ignore the transaction. This short-cut is allowed because
  * memory-only storage leaves no state so it cannot be inconsistent.
  *
  * This simplifies the implementations of the mutators and allows memory-only
  * implementations to supplement the persistent ones without requiring any
  * special dual-store implementation of Persistence. The cost is that the
  * LocalStore needs to be slightly careful about the order of its reads and
  * writes in order to avoid relying on being able to read back uncommitted
  * writes.
  */
trait Persistence extends StObject {
  
  /**
    * Returns a BundleCache representing the persisted cache of loaded bundles.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getBundleCache(): BundleCache
  
  /**
    * Returns a DocumentOverlayCache representing the documents that are mutated
    * locally.
    */
  def getDocumentOverlayCache(user: User): DocumentOverlayCache
  
  /**
    * Returns an IndexManager instance that manages our persisted query indexes.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called. In particular, the memory-backed implementation does this
    * to emulate the persisted implementation to the extent possible.
    */
  def getIndexManager(user: User): IndexManager
  
  /**
    * Returns a MutationQueue representing the persisted mutations for the
    * given user.
    *
    * Note: The implementation is free to return the same instance every time
    * this is called for a given user. In particular, the memory-backed
    * implementation does this to emulate the persisted implementation to the
    * extent possible (e.g. in the case of uid switching from
    * sally=&gt;jack=&gt;sally, sally's mutation queue will be preserved).
    */
  def getMutationQueue(user: User, indexManager: IndexManager): MutationQueue
  
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
  
  val referenceDelegate: ReferenceDelegate
  
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
    * @param action - A description of the action performed by this transaction,
    * used for logging.
    * @param mode - The underlying mode of the IndexedDb transaction. Can be
    * 'readonly', 'readwrite' or 'readwrite-primary'. Transactions marked
    * 'readwrite-primary' can only be executed by the primary client. In this
    * mode, the transactionOperation will not be run if the primary lease cannot
    * be acquired and the returned promise will be rejected with a
    * FAILED_PRECONDITION error.
    * @param transactionOperation - The operation to run inside a transaction.
    * @returns A `Promise` that is resolved once the transaction completes.
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
    * Releases any resources held during eager shutdown.
    */
  def shutdown(): js.Promise[Unit]
  
  /** Starts persistence. */
  def start(): js.Promise[Unit]
  
  /**
    * Whether or not this persistence instance has been started.
    */
  val started: Boolean
}
object Persistence {
  
  inline def apply(
    getBundleCache: CallbackTo[BundleCache],
    getDocumentOverlayCache: User => DocumentOverlayCache,
    getIndexManager: User => IndexManager,
    getMutationQueue: (User, IndexManager) => MutationQueue,
    getRemoteDocumentCache: CallbackTo[RemoteDocumentCache],
    getTargetCache: CallbackTo[TargetCache],
    referenceDelegate: ReferenceDelegate,
    runTransaction: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[Any]]) => js.Promise[Any],
    setDatabaseDeletedListener: js.Function0[js.Promise[Unit]] => Callback,
    setNetworkEnabled: Boolean => Callback,
    shutdown: CallbackTo[js.Promise[Unit]],
    start: CallbackTo[js.Promise[Unit]],
    started: Boolean
  ): Persistence = {
    val __obj = js.Dynamic.literal(getBundleCache = getBundleCache.toJsFn, getDocumentOverlayCache = js.Any.fromFunction1(getDocumentOverlayCache), getIndexManager = js.Any.fromFunction1(getIndexManager), getMutationQueue = js.Any.fromFunction2(getMutationQueue), getRemoteDocumentCache = getRemoteDocumentCache.toJsFn, getTargetCache = getTargetCache.toJsFn, referenceDelegate = referenceDelegate.asInstanceOf[js.Any], runTransaction = js.Any.fromFunction3(runTransaction), setDatabaseDeletedListener = js.Any.fromFunction1((t0: js.Function0[js.Promise[Unit]]) => setDatabaseDeletedListener(t0).runNow()), setNetworkEnabled = js.Any.fromFunction1((t0: Boolean) => setNetworkEnabled(t0).runNow()), shutdown = shutdown.toJsFn, start = start.toJsFn, started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistence]
  }
  
  extension [Self <: Persistence](x: Self) {
    
    inline def setGetBundleCache(value: CallbackTo[BundleCache]): Self = StObject.set(x, "getBundleCache", value.toJsFn)
    
    inline def setGetDocumentOverlayCache(value: User => DocumentOverlayCache): Self = StObject.set(x, "getDocumentOverlayCache", js.Any.fromFunction1(value))
    
    inline def setGetIndexManager(value: User => IndexManager): Self = StObject.set(x, "getIndexManager", js.Any.fromFunction1(value))
    
    inline def setGetMutationQueue(value: (User, IndexManager) => MutationQueue): Self = StObject.set(x, "getMutationQueue", js.Any.fromFunction2(value))
    
    inline def setGetRemoteDocumentCache(value: CallbackTo[RemoteDocumentCache]): Self = StObject.set(x, "getRemoteDocumentCache", value.toJsFn)
    
    inline def setGetTargetCache(value: CallbackTo[TargetCache]): Self = StObject.set(x, "getTargetCache", value.toJsFn)
    
    inline def setReferenceDelegate(value: ReferenceDelegate): Self = StObject.set(x, "referenceDelegate", value.asInstanceOf[js.Any])
    
    inline def setRunTransaction(
      value: (String, PersistenceTransactionMode, js.Function1[/* transaction */ PersistenceTransaction, PersistencePromise[Any]]) => js.Promise[Any]
    ): Self = StObject.set(x, "runTransaction", js.Any.fromFunction3(value))
    
    inline def setSetDatabaseDeletedListener(value: js.Function0[js.Promise[Unit]] => Callback): Self = StObject.set(x, "setDatabaseDeletedListener", js.Any.fromFunction1((t0: js.Function0[js.Promise[Unit]]) => value(t0).runNow()))
    
    inline def setSetNetworkEnabled(value: Boolean => Callback): Self = StObject.set(x, "setNetworkEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setShutdown(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "shutdown", value.toJsFn)
    
    inline def setStart(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
