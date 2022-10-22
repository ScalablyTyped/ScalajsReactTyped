package typingsJapgolly.firebaseFirestore.distPrivateMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An in-memory buffer of entries to be written to a RemoteDocumentCache.
  * It can be used to batch up a set of changes to be written to the cache, but
  * additionally supports reading entries back with the `getEntry()` method,
  * falling back to the underlying RemoteDocumentCache if no entry is
  * buffered.
  *
  * Entries added to the cache *must* be read first. This is to facilitate
  * calculating the size delta of the pending changes.
  *
  * PORTING NOTE: This class was implemented then removed from other platforms.
  * If byte-counting ends up being needed on the other platforms, consider
  * porting this class as part of that implementation work.
  */
trait RemoteDocumentChangeBuffer extends StObject {
  
  /**
    * Buffers a `RemoteDocumentCache.addEntry()` call.
    *
    * You can only modify documents that have already been retrieved via
    * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
    */
  def addEntry(document: MutableDocument): Unit
  
  /**
    * Applies buffered changes to the underlying RemoteDocumentCache, using
    * the provided transaction.
    */
  @JSName("apply")
  def apply(transaction: PersistenceTransaction): PersistencePromise[Unit]
  
  /* protected */ def applyChanges(transaction: PersistenceTransaction): PersistencePromise[Unit]
  
  /** Helper to assert this.changes is not null  */
  /* protected */ def assertNotApplied(): Unit
  
  /* protected */ var changes: ObjectMap[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, 
    MutableDocument
  ]
  
  /* private */ var changesApplied: Any
  
  /* protected */ def getAllFromCache(transaction: PersistenceTransaction, documentKeys: DocumentKeySet): PersistencePromise[MutableDocumentMap]
  
  /**
    * Looks up several entries in the cache, forwarding to
    * `RemoteDocumentCache.getEntry()`.
    *
    * @param transaction - The transaction in which to perform any persistence
    *     operations.
    * @param documentKeys - The keys of the entries to look up.
    * @returns A map of cached documents, indexed by key. If an entry cannot be
    *     found, the corresponding key will be mapped to an invalid document.
    */
  def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet): PersistencePromise[MutableDocumentMap]
  
  /**
    * Looks up an entry in the cache. The buffered changes will first be checked,
    * and if no buffered change applies, this will forward to
    * `RemoteDocumentCache.getEntry()`.
    *
    * @param transaction - The transaction in which to perform any persistence
    *     operations.
    * @param documentKey - The key of the entry to look up.
    * @returns The cached document or an invalid document if we have nothing
    * cached.
    */
  def getEntry(
    transaction: PersistenceTransaction,
    documentKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[MutableDocument]
  
  /* protected */ def getFromCache(
    transaction: PersistenceTransaction,
    documentKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any
  ): PersistencePromise[MutableDocument]
  
  /**
    * Buffers a `RemoteDocumentCache.removeEntry()` call.
    *
    * You can only remove documents that have already been retrieved via
    * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
    */
  def removeEntry(
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any,
    readTime: SnapshotVersion
  ): Unit
}
object RemoteDocumentChangeBuffer {
  
  inline def apply(
    addEntry: MutableDocument => Callback,
    apply: PersistenceTransaction => PersistencePromise[Unit],
    applyChanges: PersistenceTransaction => PersistencePromise[Unit],
    assertNotApplied: Callback,
    changes: ObjectMap[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, 
      MutableDocument
    ],
    changesApplied: Any,
    getAllFromCache: (PersistenceTransaction, DocumentKeySet) => PersistencePromise[MutableDocumentMap],
    getEntries: (PersistenceTransaction, DocumentKeySet) => PersistencePromise[MutableDocumentMap],
    getEntry: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[MutableDocument],
    getFromCache: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[MutableDocument],
    removeEntry: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, SnapshotVersion) => Callback
  ): RemoteDocumentChangeBuffer = {
    val __obj = js.Dynamic.literal(addEntry = js.Any.fromFunction1((t0: MutableDocument) => addEntry(t0).runNow()), apply = js.Any.fromFunction1(apply), applyChanges = js.Any.fromFunction1(applyChanges), assertNotApplied = assertNotApplied.toJsFn, changes = changes.asInstanceOf[js.Any], changesApplied = changesApplied.asInstanceOf[js.Any], getAllFromCache = js.Any.fromFunction2(getAllFromCache), getEntries = js.Any.fromFunction2(getEntries), getEntry = js.Any.fromFunction2(getEntry), getFromCache = js.Any.fromFunction2(getFromCache), removeEntry = js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, t1: SnapshotVersion) => (removeEntry(t0, t1)).runNow()))
    __obj.asInstanceOf[RemoteDocumentChangeBuffer]
  }
  
  extension [Self <: RemoteDocumentChangeBuffer](x: Self) {
    
    inline def setAddEntry(value: MutableDocument => Callback): Self = StObject.set(x, "addEntry", js.Any.fromFunction1((t0: MutableDocument) => value(t0).runNow()))
    
    inline def setApply(value: PersistenceTransaction => PersistencePromise[Unit]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyChanges(value: PersistenceTransaction => PersistencePromise[Unit]): Self = StObject.set(x, "applyChanges", js.Any.fromFunction1(value))
    
    inline def setAssertNotApplied(value: Callback): Self = StObject.set(x, "assertNotApplied", value.toJsFn)
    
    inline def setChanges(
      value: ObjectMap[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, 
          MutableDocument
        ]
    ): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesApplied(value: Any): Self = StObject.set(x, "changesApplied", value.asInstanceOf[js.Any])
    
    inline def setGetAllFromCache(value: (PersistenceTransaction, DocumentKeySet) => PersistencePromise[MutableDocumentMap]): Self = StObject.set(x, "getAllFromCache", js.Any.fromFunction2(value))
    
    inline def setGetEntries(value: (PersistenceTransaction, DocumentKeySet) => PersistencePromise[MutableDocumentMap]): Self = StObject.set(x, "getEntries", js.Any.fromFunction2(value))
    
    inline def setGetEntry(
      value: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[MutableDocument]
    ): Self = StObject.set(x, "getEntry", js.Any.fromFunction2(value))
    
    inline def setGetFromCache(
      value: (PersistenceTransaction, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any) => PersistencePromise[MutableDocument]
    ): Self = StObject.set(x, "getFromCache", js.Any.fromFunction2(value))
    
    inline def setRemoveEntry(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, SnapshotVersion) => Callback
    ): Self = StObject.set(x, "removeEntry", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _DocumentKey */ Any, t1: SnapshotVersion) => (value(t0, t1)).runNow()))
  }
}
