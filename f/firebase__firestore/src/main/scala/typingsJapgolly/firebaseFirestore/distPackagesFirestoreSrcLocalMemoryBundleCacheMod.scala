package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.BundleMetadata
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcCoreBundleMod.NamedQuery
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalBundleCacheMod.BundleCache
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLocalMemoryBundleCacheMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/memory_bundle_cache", "MemoryBundleCache")
  @js.native
  open class MemoryBundleCache protected ()
    extends StObject
       with BundleCache {
    def this(serializer: LocalSerializer) = this()
    
    /* private */ var bundles: Any = js.native
    
    /**
      * Gets the saved `BundleMetadata` for a given `bundleId`, returns undefined
      * if no bundle metadata is found under the given id.
      */
    /* CompleteClass */
    override def getBundleMetadata(transaction: PersistenceTransaction, bundleId: String): PersistencePromise[js.UndefOr[BundleMetadata]] = js.native
    
    /**
      * Gets a saved `NamedQuery` for the given query name. Returns undefined if
      * no queries are found under the given name.
      */
    /* CompleteClass */
    override def getNamedQuery(transaction: PersistenceTransaction, queryName: String): PersistencePromise[js.UndefOr[NamedQuery]] = js.native
    
    /* private */ var namedQueries: Any = js.native
    
    /**
      * Saves a `BundleMetadata` from a bundle into local storage, using its id as
      * the persistent key.
      */
    /* CompleteClass */
    override def saveBundleMetadata(
      transaction: PersistenceTransaction,
      metadata: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
    ): PersistencePromise[Unit] = js.native
    
    /**
      * Saves a `NamedQuery` from a bundle, using its name as the persistent key.
      */
    /* CompleteClass */
    override def saveNamedQuery(
      transaction: PersistenceTransaction,
      query: typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery
    ): PersistencePromise[Unit] = js.native
    
    /* private */ var serializer: Any = js.native
  }
}
