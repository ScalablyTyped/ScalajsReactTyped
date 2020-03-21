package typingsJapgolly.mapboxMapboxSdk.geocodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent`
*/
trait GeocodeMode extends js.Object

object GeocodeMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mapboxDotplaces: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.mapboxDotplaces = this.cast("mapbox.places")
  @scala.inline
  def `mapboxDotplaces-permanent`: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`mapboxDotplaces-permanent` = this.cast("mapbox.places-permanent")
}

