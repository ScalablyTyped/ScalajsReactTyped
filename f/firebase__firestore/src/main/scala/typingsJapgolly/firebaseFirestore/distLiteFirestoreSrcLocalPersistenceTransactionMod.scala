package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreTypesMod.ListenSequenceNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalPersistenceTransactionMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/persistence_transaction", "PRIMARY_LEASE_LOST_ERROR_MSG")
  @js.native
  val PRIMARY_LEASE_LOST_ERROR_MSG: String = js.native
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/src/local/persistence_transaction", "PersistenceTransaction")
  @js.native
  open class PersistenceTransaction () extends StObject {
    
    def addOnCommittedListener(listener: js.Function0[Unit]): Unit = js.native
    
    val currentSequenceNumber: ListenSequenceNumber = js.native
    
    /* private */ val onCommittedListeners: Any = js.native
    
    def raiseOnCommittedEvent(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readonly
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readwrite
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`
  */
  trait PersistenceTransactionMode extends StObject
  object PersistenceTransactionMode {
    
    inline def readonly: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readonly = "readonly".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readonly]
    
    inline def readwrite: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readwrite = "readwrite".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.readwrite]
    
    inline def `readwrite-primary`: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary` = "readwrite-primary".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`readwrite-primary`]
  }
}
