package typingsJapgolly.firebaseFirestoreCompat

import typingsJapgolly.firebaseAppTypes.mod.FirebaseNamespace
import typingsJapgolly.firebaseFirestore.mod.Firestore
import typingsJapgolly.firebaseFirestoreCompat.appCompatMod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configureForFirebase(
    firebase: FirebaseNamespace,
    firestoreFactory: js.Function2[
      /* app */ FirebaseApp, 
      /* firestoreExp */ Firestore, 
      typingsJapgolly.firebaseFirestoreCompat.distSrcApiDatabaseMod.Firestore
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureForFirebase")(firebase.asInstanceOf[js.Any], firestoreFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
