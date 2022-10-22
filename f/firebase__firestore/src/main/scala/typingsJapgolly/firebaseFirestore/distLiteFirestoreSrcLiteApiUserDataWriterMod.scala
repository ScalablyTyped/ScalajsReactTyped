package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilByteStringMod.ByteString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLiteApiUserDataWriterMod {
  
  /* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/src/lite-api/user_data_writer", "AbstractUserDataWriter")
  @js.native
  open class AbstractUserDataWriter () extends StObject {
    
    /* private */ var convertArray: Any = js.native
    
    /* protected */ def convertBytes(bytes: ByteString): Any = js.native
    
    /* protected */ def convertDocumentKey(name: String, expectedDatabaseId: DatabaseId): DocumentKey = js.native
    
    /* private */ var convertGeoPoint: Any = js.native
    
    /* private */ var convertObject: Any = js.native
    
    /* protected */ def convertReference(name: String): Any = js.native
    
    /* private */ var convertServerTimestamp: Any = js.native
    
    /* private */ var convertTimestamp: Any = js.native
    
    def convertValue(value: Value): Any = js.native
    def convertValue(value: Value, serverTimestampBehavior: ServerTimestampBehavior): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.estimate
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.previous
    - typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.none
  */
  trait ServerTimestampBehavior extends StObject
  object ServerTimestampBehavior {
    
    inline def estimate: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.estimate = "estimate".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.estimate]
    
    inline def none: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.none = "none".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.none]
    
    inline def previous: typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.previous = "previous".asInstanceOf[typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.previous]
  }
}
