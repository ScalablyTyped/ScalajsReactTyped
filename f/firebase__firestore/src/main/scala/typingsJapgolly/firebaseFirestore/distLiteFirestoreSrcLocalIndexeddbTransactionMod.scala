package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.ListenSequenceNumber
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalPersistenceTransactionMod.PersistenceTransaction
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSimpleDbMod.SimpleDbStore
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalSimpleDbMod.SimpleDbTransaction
import typingsJapgolly.std.IDBValidKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalIndexeddbTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/indexeddb_transaction", "IndexedDbTransaction")
  @js.native
  open class IndexedDbTransaction protected () extends PersistenceTransaction {
    def this(simpleDbTransaction: SimpleDbTransaction, currentSequenceNumber: ListenSequenceNumber) = this()
    
    val simpleDbTransaction: SimpleDbTransaction = js.native
  }
  
  inline def getStore[Key /* <: IDBValidKey */, Value](txn: PersistenceTransaction, store: String): SimpleDbStore[Key, Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStore")(txn.asInstanceOf[js.Any], store.asInstanceOf[js.Any])).asInstanceOf[SimpleDbStore[Key, Value]]
}
