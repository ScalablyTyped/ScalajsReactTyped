package typingsJapgolly.googlemaps.google.maps.places

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacePhoto extends js.Object {
  var height: Double
  var html_attributions: js.Array[String]
  var width: Double
  def getUrl(opts: PhotoOptions): String
}

object PlacePhoto {
  @scala.inline
  def apply(
    getUrl: PhotoOptions => CallbackTo[String],
    height: Double,
    html_attributions: js.Array[String],
    width: Double
  ): PlacePhoto = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("getUrl")(js.Any.fromFunction1((t0: typingsJapgolly.googlemaps.google.maps.places.PhotoOptions) => getUrl(t0).runNow()))
    __obj.asInstanceOf[PlacePhoto]
  }
}

