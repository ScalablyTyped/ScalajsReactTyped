package typingsJapgolly.reactNativeFirebase.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "firestore")
@js.native
object firestore extends TopLevel[FirestoreModule] {
  @js.native
  class GeoPoint protected ()
    extends typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
}

