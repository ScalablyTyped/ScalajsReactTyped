package typingsJapgolly.firebaseFirestore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import typingsJapgolly.firebaseFirestore.distFirestoreSrcCoreTypesMod.TargetId
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalBundleCacheMod.BundleCache
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalDocumentOverlayCacheMod.DocumentOverlayCache
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalIndexManagerMod.IndexManager
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalMutationQueueMod.MutationQueue
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransactionMode
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalRemoteDocumentCacheMod.RemoteDocumentCache
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalTargetCacheMod.TargetCache
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalTargetDataMod.TargetData
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelDocumentKeyMod.DocumentKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalPersistenceMod {
  
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
  
  type PrimaryStateListener = js.Function1[/* isPrimary */ Boolean, js.Promise[Unit]]
  
  trait ReferenceDelegate extends StObject {
    
    /** Notify the delegate that the given document was added to a target. */
    def addReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit]
    
    /**
      * Notify the delegate that a document may no longer be part of any views or
      * have any mutations associated.
      */
    def markPotentiallyOrphaned(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
    
    /** Notify the delegate that the given document was removed from a target. */
    def removeReference(txn: PersistenceTransaction, targetId: TargetId, doc: DocumentKey): PersistencePromise[Unit]
    
    /**
      * Notify the delegate that a target was removed. The delegate may, but is not obligated to,
      * actually delete the target and associated data.
      */
    def removeTarget(txn: PersistenceTransaction, targetData: TargetData): PersistencePromise[Unit]
    
    /** Notify the delegate that a limbo document was updated. */
    def updateLimboDocument(txn: PersistenceTransaction, doc: DocumentKey): PersistencePromise[Unit]
  }
  object ReferenceDelegate {
    
    inline def apply(
      addReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      markPotentiallyOrphaned: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit],
      removeReference: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit],
      removeTarget: (PersistenceTransaction, TargetData) => PersistencePromise[Unit],
      updateLimboDocument: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]
    ): ReferenceDelegate = {
      val __obj = js.Dynamic.literal(addReference = js.Any.fromFunction3(addReference), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument))
      __obj.asInstanceOf[ReferenceDelegate]
    }
    
    extension [Self <: ReferenceDelegate](x: Self) {
      
      inline def setAddReference(value: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit]): Self = StObject.set(x, "addReference", js.Any.fromFunction3(value))
      
      inline def setMarkPotentiallyOrphaned(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = StObject.set(x, "markPotentiallyOrphaned", js.Any.fromFunction2(value))
      
      inline def setRemoveReference(value: (PersistenceTransaction, TargetId, DocumentKey) => PersistencePromise[Unit]): Self = StObject.set(x, "removeReference", js.Any.fromFunction3(value))
      
      inline def setRemoveTarget(value: (PersistenceTransaction, TargetData) => PersistencePromise[Unit]): Self = StObject.set(x, "removeTarget", js.Any.fromFunction2(value))
      
      inline def setUpdateLimboDocument(value: (PersistenceTransaction, DocumentKey) => PersistencePromise[Unit]): Self = StObject.set(x, "updateLimboDocument", js.Any.fromFunction2(value))
    }
  }
  
  trait Scheduler extends StObject {
    
    def start(): Unit
    
    val started: Boolean
    
    def stop(): Unit
  }
  object Scheduler {
    
    inline def apply(start: Callback, started: Boolean, stop: Callback): Scheduler = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, started = started.asInstanceOf[js.Any], stop = stop.toJsFn)
      __obj.asInstanceOf[Scheduler]
    }
    
    extension [Self <: Scheduler](x: Self) {
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStarted(value: Boolean): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
