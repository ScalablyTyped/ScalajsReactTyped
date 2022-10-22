package typingsJapgolly.firebaseFirestore

import org.scalajs.dom.IDBDatabase
import org.scalajs.dom.IDBTransaction
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalLocalSerializerMod.LocalSerializer
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLocalSimpleDbMod.SimpleDbSchemaConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcLocalIndexeddbSchemaConverterMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/local/indexeddb_schema_converter", "SchemaConverter")
  @js.native
  open class SchemaConverter protected ()
    extends StObject
       with SimpleDbSchemaConverter {
    def this(serializer: LocalSerializer) = this()
    
    /* private */ var addDocumentGlobal: Any = js.native
    
    /* private */ var createCollectionParentIndex: Any = js.native
    
    /* CompleteClass */
    override def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit] = js.native
    
    /**
      * Ensures that every document in the remote document cache has a corresponding sentinel row
      * with a sequence number. Missing rows are given the most recently used sequence number.
      */
    /* private */ var ensureSequenceNumbers: Any = js.native
    
    /* private */ var removeAcknowledgedMutations: Any = js.native
    
    /* private */ var rewriteCanonicalIds: Any = js.native
    
    /* private */ var rewriteRemoteDocumentCache: Any = js.native
    
    /* private */ var runOverlayMigration: Any = js.native
    
    /* private */ val serializer: Any = js.native
  }
}
