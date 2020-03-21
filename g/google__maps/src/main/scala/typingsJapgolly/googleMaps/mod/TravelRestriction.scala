package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.tolls
  - typingsJapgolly.googleMaps.googleMapsStrings.highways
  - typingsJapgolly.googleMaps.googleMapsStrings.ferries
  - typingsJapgolly.googleMaps.googleMapsStrings.indoor
*/
trait TravelRestriction extends js.Object

object TravelRestriction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferries: typingsJapgolly.googleMaps.googleMapsStrings.ferries = this.cast("ferries")
  @scala.inline
  def highways: typingsJapgolly.googleMaps.googleMapsStrings.highways = this.cast("highways")
  @scala.inline
  def indoor: typingsJapgolly.googleMaps.googleMapsStrings.indoor = this.cast("indoor")
  @scala.inline
  def tolls: typingsJapgolly.googleMaps.googleMapsStrings.tolls = this.cast("tolls")
}

