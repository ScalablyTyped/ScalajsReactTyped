package typingsJapgolly.firebaseFirestore.mod

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`firestore-lite`
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore", "Firestore")
@js.native
/* private */ open class Firestore () extends StObject {
  
  /**
    * The {@link @firebase/app#FirebaseApp} associated with this `Firestore` service
    * instance.
    */
  def app: FirebaseApp = js.native
  
  /**
    * Returns a JSON-serializable representation of this `Firestore` instance.
    */
  def toJSON(): js.Object = js.native
  
  /**
    * Whether it's a {@link Firestore} or Firestore Lite instance.
    */
  var `type`: `firestore-lite` | firestore = js.native
}
