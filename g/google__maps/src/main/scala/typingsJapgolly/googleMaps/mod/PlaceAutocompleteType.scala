package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.geocode
  - typingsJapgolly.googleMaps.googleMapsStrings.address
  - typingsJapgolly.googleMaps.googleMapsStrings.establishment
  - typingsJapgolly.googleMaps.googleMapsStrings.LeftparenthesisregionsRightparenthesis
  - typingsJapgolly.googleMaps.googleMapsStrings.LeftparenthesiscitiesRightparenthesis
*/
trait PlaceAutocompleteType extends js.Object

object PlaceAutocompleteType {
  @scala.inline
  def LeftparenthesiscitiesRightparenthesis: typingsJapgolly.googleMaps.googleMapsStrings.LeftparenthesiscitiesRightparenthesis = this.cast("(cities)")
  @scala.inline
  def LeftparenthesisregionsRightparenthesis: typingsJapgolly.googleMaps.googleMapsStrings.LeftparenthesisregionsRightparenthesis = this.cast("(regions)")
  @scala.inline
  def address: typingsJapgolly.googleMaps.googleMapsStrings.address = this.cast("address")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def establishment: typingsJapgolly.googleMaps.googleMapsStrings.establishment = this.cast("establishment")
  @scala.inline
  def geocode: typingsJapgolly.googleMaps.googleMapsStrings.geocode = this.cast("geocode")
}

