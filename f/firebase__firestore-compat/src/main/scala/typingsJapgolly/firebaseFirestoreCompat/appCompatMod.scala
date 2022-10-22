package typingsJapgolly.firebaseFirestoreCompat

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseFirestoreCompat.anon.Blob
import typingsJapgolly.firebaseFirestoreTypes.mod.FirebaseFirestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    var firestore: js.UndefOr[js.Function0[FirebaseFirestore]] = js.undefined
  }
  object FirebaseApp {
    
    inline def apply(): FirebaseApp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setFirestore(value: CallbackTo[FirebaseFirestore]): Self = StObject.set(x, "firestore", value.toJsFn)
      
      inline def setFirestoreUndefined: Self = StObject.set(x, "firestore", js.undefined)
    }
  }
  
  trait FirebaseNamespace extends StObject {
    
    def firestore(): FirebaseFirestore
    def firestore(app: FirebaseApp): FirebaseFirestore
    def firestore(app: typingsJapgolly.firebaseFirestoreCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp): FirebaseFirestore
    @JSName("firestore")
    var firestore_Original: Blob
  }
  object FirebaseNamespace {
    
    inline def apply(firestore: Blob): FirebaseNamespace = {
      val __obj = js.Dynamic.literal(firestore = firestore.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseNamespace]
    }
    
    extension [Self <: FirebaseNamespace](x: Self) {
      
      inline def setFirestore(value: Blob): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    }
  }
}
