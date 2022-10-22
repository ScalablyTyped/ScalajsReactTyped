package typingsJapgolly.firebaseFirestoreCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiGeoPointMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/api/geo_point", "GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typingsJapgolly.firebaseFirestore.mod.GeoPoint {
    /**
      * Creates a new immutable `GeoPoint` object with the provided latitude and
      * longitude values.
      * @param latitude - The latitude as number between -90 and 90.
      * @param longitude - The longitude as number between -180 and 180.
      */
    def this(latitude: Double, longitude: Double) = this()
  }
}
