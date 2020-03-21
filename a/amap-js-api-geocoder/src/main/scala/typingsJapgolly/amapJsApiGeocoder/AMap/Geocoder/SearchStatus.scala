package typingsJapgolly.amapJsApiGeocoder.AMap.Geocoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete
  - typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data
  - typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.complete = this.cast("complete")
  @scala.inline
  def error: typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.error = this.cast("error")
  @scala.inline
  def no_data: typingsJapgolly.amapJsApiGeocoder.amapJsApiGeocoderStrings.no_data = this.cast("no_data")
}

