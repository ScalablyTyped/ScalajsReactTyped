package typingsJapgolly.geolib

import typingsJapgolly.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getGreatCircleBearing", JSImport.Namespace)
@js.native
object getGreatCircleBearingMod extends js.Object {
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  def default(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
}

