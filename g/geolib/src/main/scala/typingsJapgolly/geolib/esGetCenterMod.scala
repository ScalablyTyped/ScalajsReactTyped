package typingsJapgolly.geolib

import typingsJapgolly.geolib.anon.Longitude
import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import typingsJapgolly.geolib.geolibBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetCenterMod {
  
  @JSImport("geolib/es/getCenter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any]).asInstanceOf[`false` | Longitude]
}
