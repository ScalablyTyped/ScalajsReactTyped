package typingsJapgolly.geolib

import typingsJapgolly.geolib.typesMod.GeolibDistanceFn
import typingsJapgolly.geolib.typesMod.GeolibInputCoordinatesWithTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getSpeed", JSImport.Namespace)
@js.native
object getSpeedMod extends js.Object {
  def default(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  def default(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
}

