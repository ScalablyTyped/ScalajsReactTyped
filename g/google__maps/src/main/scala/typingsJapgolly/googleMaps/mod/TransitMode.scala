package typingsJapgolly.googleMaps.mod

import typingsJapgolly.googleMaps.googleMapsStrings.bus_
import typingsJapgolly.googleMaps.googleMapsStrings.rail_
import typingsJapgolly.googleMaps.googleMapsStrings.subway_
import typingsJapgolly.googleMaps.googleMapsStrings.tram_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleMaps.googleMapsStrings.bus_
  - typingsJapgolly.googleMaps.googleMapsStrings.subway_
  - typingsJapgolly.googleMaps.googleMapsStrings.train
  - typingsJapgolly.googleMaps.googleMapsStrings.tram_
  - typingsJapgolly.googleMaps.googleMapsStrings.rail_
*/
trait TransitMode extends js.Object

object TransitMode {
  @scala.inline
  def bus: bus_ = this.cast("bus")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rail: rail_ = this.cast("rail")
  @scala.inline
  def subway: subway_ = this.cast("subway")
  @scala.inline
  def train: typingsJapgolly.googleMaps.googleMapsStrings.train = this.cast("train")
  @scala.inline
  def tram: tram_ = this.cast("tram")
}

