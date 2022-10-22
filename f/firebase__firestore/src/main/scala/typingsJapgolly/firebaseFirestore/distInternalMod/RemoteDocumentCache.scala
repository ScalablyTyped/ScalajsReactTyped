package typingsJapgolly.firebaseFirestore.distInternalMod

import typingsJapgolly.firebaseFirestore.anon.TrackRemovals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents cached documents received from the remote backend.
  *
  * The cache is keyed by DocumentKey and entries in the cache are
  * MutableDocuments, meaning we can cache both actual documents as well as
  * documents that are known to not exist.
  */
@js.native
trait RemoteDocumentCache extends StObject {
  
  /**
    * Returns the documents from the provided collection.
    *
    * @param collection - The collection to read.
    * @param offset - The offset to start the scan at (exclusive).
    * @returns The set of matching documents.
    */
  def getAllFromCollection(transaction: PersistenceTransaction, collection: ResourcePath, offset: IndexOffset): PersistencePromise[MutableDocumentMap] = js.native
  
  /**
    * Looks up the next `limit` documents for a collection group based on the
    * provided offset. The ordering is based on the document's read time and key.
    *
    * @param collectionGroup - The collection group to scan.
    * @param offset - The offset to start the scan at (exclusive).
    * @param limit - The maximum number of results to return.
    * @returns The set of matching documents.
    */
  def getAllFromCollectionGroup(transaction: PersistenceTransaction, collectionGroup: String, offset: IndexOffset, limit: Double): PersistencePromise[MutableDocumentMap] = js.native
  
  /**
    * Looks up a set of entries in the cache.
    *
    * @param documentKeys - The keys of the entries to look up.
    * @returns The cached document entries indexed by key. If an entry is not
    * cached, the corresponding key will be mapped to an invalid document.
    */
  def getEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet): PersistencePromise[MutableDocumentMap] = js.native
  
  /**
    * Looks up an entry in the cache.
    *
    * @param documentKey - The key of the entry to look up.*
    * @returns The cached document entry. Returns an invalid document if the
    * document is not cached.
    */
  def getEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[MutableDocument] = js.native
  
  /**
    * Get an estimate of the size of the document cache. Note that for eager
    * garbage collection, we don't track sizes so this will return 0.
    */
  def getSize(transaction: PersistenceTransaction): PersistencePromise[Double] = js.native
  
  /**
    * Provides access to add or update the contents of the cache. The buffer
    * handles proper size accounting for the change.
    *
    * Multi-Tab Note: This should only be called by the primary client.
    *
    * @param options - Specify `trackRemovals` to create sentinel entries for
    * removed documents, which allows removals to be tracked by
    * `getNewDocumentChanges()`.
    */
  def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
  def newChangeBuffer(options: TrackRemovals): RemoteDocumentChangeBuffer = js.native
  
  /** Sets the index manager to use for managing the collectionGroup index. */
  def setIndexManager(indexManager: IndexManager): Unit = js.native
}
