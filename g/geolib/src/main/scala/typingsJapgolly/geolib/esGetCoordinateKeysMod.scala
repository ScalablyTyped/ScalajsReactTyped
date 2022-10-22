package typingsJapgolly.geolib

import typingsJapgolly.geolib.anon.Altitude
import typingsJapgolly.geolib.anon.AltitudeLatitude
import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetCoordinateKeysMod {
  
  @JSImport("geolib/es/getCoordinateKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(point: GeolibInputCoordinates): AltitudeLatitude = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any]).asInstanceOf[AltitudeLatitude]
  inline def default(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(point.asInstanceOf[js.Any], keysToLookup.asInstanceOf[js.Any])).asInstanceOf[AltitudeLatitude]
}
