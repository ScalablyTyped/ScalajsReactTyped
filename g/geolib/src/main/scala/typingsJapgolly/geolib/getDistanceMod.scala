package typingsJapgolly.geolib

import typingsJapgolly.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getDistance", JSImport.Namespace)
@js.native
object getDistanceMod extends js.Object {
  def default(from: GeolibInputCoordinates, to: GeolibInputCoordinates): Double = js.native
  def default(from: GeolibInputCoordinates, to: GeolibInputCoordinates, accuracy: Double): Double = js.native
}

