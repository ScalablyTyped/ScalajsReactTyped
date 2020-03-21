package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentSizeEntries
import typingsJapgolly.firebaseFirestore.collectionsMod.DocumentSizeEntry
import typingsJapgolly.firebaseFirestore.documentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.indexManagerMod.IndexManager
import typingsJapgolly.firebaseFirestore.indexeddbSchemaMod.DbRemoteDocument
import typingsJapgolly.firebaseFirestore.localSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.persistenceMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.persistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.remoteDocumentCacheMod.RemoteDocumentCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_remote_document_cache", JSImport.Namespace)
@js.native
object indexeddbRemoteDocumentCacheMod extends js.Object {
  @js.native
  class IndexedDbRemoteDocumentCache protected () extends RemoteDocumentCache {
    /**
      * @param {LocalSerializer} serializer The document serializer.
      * @param {IndexManager} indexManager The query indexes that need to be maintained.
      */
    def this(serializer: LocalSerializer, indexManager: IndexManager) = this()
    /**
      * Adds the supplied entries to the cache.
      *
      * All calls of `addEntry` are required to go through the RemoteDocumentChangeBuffer
      * returned by `newChangeBuffer()` to ensure proper accounting of metadata.
      */
    var addEntry: js.Any = js.native
    var forEachDbEntry: js.Any = js.native
    var getMetadata: js.Any = js.native
    val indexManager: js.Any = js.native
    /**
      * Decodes `remoteDoc` and returns the document (or null, if the document
      * corresponds to the format used for sentinel deletes).
      */
    var maybeDecodeDocument: js.Any = js.native
    /**
      * Removes a document from the cache.
      *
      * All calls of `removeEntry`  are required to go through the RemoteDocumentChangeBuffer
      * returned by `newChangeBuffer()` to ensure proper accounting of metadata.
      */
    var removeEntry: js.Any = js.native
    val serializer: LocalSerializer = js.native
    var setMetadata: js.Any = js.native
    /**
      * Updates the current cache size.
      *
      * Callers to `addEntry()` and `removeEntry()` *must* call this afterwards to update the
      * cache's metadata.
      */
    var updateMetadata: js.Any = js.native
    /**
      * Looks up several entries in the cache.
      *
      * @param documentKeys The set of keys entries to look up.
      * @return A map of MaybeDocuments indexed by key (if a document cannot be
      *     found, the key will be mapped to null) and a map of sizes indexed by
      *     key (zero if the key cannot be found).
      */
    def getSizedEntries(transaction: PersistenceTransaction, documentKeys: DocumentKeySet_): PersistencePromise[DocumentSizeEntries] = js.native
    /**
      * Looks up an entry in the cache.
      *
      * @param documentKey The key of the entry to look up.
      * @return The cached MaybeDocument entry and its size, or null if we have nothing cached.
      */
    def getSizedEntry(transaction: PersistenceTransaction, documentKey: DocumentKey): PersistencePromise[DocumentSizeEntry | Null] = js.native
  }
  
  def dbDocumentSize(doc: DbRemoteDocument): Double = js.native
  /* static members */
  @js.native
  object IndexedDbRemoteDocumentCache extends js.Object {
    /**
      * Handles the details of adding and updating documents in the IndexedDbRemoteDocumentCache.
      *
      * Unlike the MemoryRemoteDocumentChangeBuffer, the IndexedDb implementation computes the size
      * delta for all submitted changes. This avoids having to re-read all documents from IndexedDb
      * when we apply the changes.
      */
    var RemoteDocumentChangeBuffer: js.Any = js.native
  }
  
}

