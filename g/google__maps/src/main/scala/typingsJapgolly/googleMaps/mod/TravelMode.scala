package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.driving
  - typingsJapgolly.googleMaps.googleMapsStrings.walking
  - typingsJapgolly.googleMaps.googleMapsStrings.bicycling
  - typingsJapgolly.googleMaps.googleMapsStrings.transit
*/
trait TravelMode extends js.Object

object TravelMode {
  @scala.inline
  def bicycling: typingsJapgolly.googleMaps.googleMapsStrings.bicycling = this.cast("bicycling")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def driving: typingsJapgolly.googleMaps.googleMapsStrings.driving = this.cast("driving")
  @scala.inline
  def transit: typingsJapgolly.googleMaps.googleMapsStrings.transit = this.cast("transit")
  @scala.inline
  def walking: typingsJapgolly.googleMaps.googleMapsStrings.walking = this.cast("walking")
}

