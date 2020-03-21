package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.prominence
  - typingsJapgolly.googleMaps.googleMapsStrings.distance
*/
trait PlacesNearbyRanking extends js.Object

object PlacesNearbyRanking {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def distance: typingsJapgolly.googleMaps.googleMapsStrings.distance = this.cast("distance")
  @scala.inline
  def prominence: typingsJapgolly.googleMaps.googleMapsStrings.prominence = this.cast("prominence")
}

