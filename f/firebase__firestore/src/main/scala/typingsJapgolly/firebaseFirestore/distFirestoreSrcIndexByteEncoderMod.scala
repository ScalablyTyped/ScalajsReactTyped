package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcDirectionalIndexByteEncoderMod.DirectionalIndexByteEncoder
import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelFieldIndexMod.IndexKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcIndexByteEncoderMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/index_byte_encoder", "IndexByteEncoder")
  @js.native
  open class IndexByteEncoder () extends StObject {
    
    /* private */ var ascending: Any = js.native
    
    /* private */ var descending: Any = js.native
    
    def encodedBytes(): js.typedarray.Uint8Array = js.native
    
    def forKind(kind: IndexKind): DirectionalIndexByteEncoder = js.native
    
    /* private */ var orderedCode: Any = js.native
    
    def reset(): Unit = js.native
    
    def seed(encodedBytes: js.typedarray.Uint8Array): Unit = js.native
  }
}
