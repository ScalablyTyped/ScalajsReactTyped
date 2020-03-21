package typingsJapgolly.geolib

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
import typingsJapgolly.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getCompassDirection", JSImport.Namespace)
@js.native
object getCompassDirectionMod extends js.Object {
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  type BearingFunction = js.Function2[/* origin */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
}

