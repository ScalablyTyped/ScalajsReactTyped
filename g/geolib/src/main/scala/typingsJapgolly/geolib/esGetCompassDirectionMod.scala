package typingsJapgolly.geolib

import typingsJapgolly.geolib.esTypesMod.GeolibInputCoordinates
import typingsJapgolly.geolib.geolibStrings.E
import typingsJapgolly.geolib.geolibStrings.ENE
import typingsJapgolly.geolib.geolibStrings.ESE
import typingsJapgolly.geolib.geolibStrings.N
import typingsJapgolly.geolib.geolibStrings.NE
import typingsJapgolly.geolib.geolibStrings.NNE
import typingsJapgolly.geolib.geolibStrings.NNW
import typingsJapgolly.geolib.geolibStrings.NW
import typingsJapgolly.geolib.geolibStrings.S
import typingsJapgolly.geolib.geolibStrings.SE
import typingsJapgolly.geolib.geolibStrings.SSE
import typingsJapgolly.geolib.geolibStrings.SSW
import typingsJapgolly.geolib.geolibStrings.SW
import typingsJapgolly.geolib.geolibStrings.W
import typingsJapgolly.geolib.geolibStrings.WNW
import typingsJapgolly.geolib.geolibStrings.WSW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetCompassDirectionMod {
  
  @JSImport("geolib/es/getCompassDirection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  inline def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(origin.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], bearingFn.asInstanceOf[js.Any])).asInstanceOf[S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N]
  
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}
