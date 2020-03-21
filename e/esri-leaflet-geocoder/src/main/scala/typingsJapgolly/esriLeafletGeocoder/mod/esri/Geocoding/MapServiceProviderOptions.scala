package typingsJapgolly.esriLeafletGeocoder.mod.esri.Geocoding

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: Double | js.Array[Double]
  var layers: Double | js.Array[Double]
  var searchFields: String | js.Array[String]
  var url: String
  def formatSuggestion(featureInformation: js.Any): String
}

object MapServiceProviderOptions {
  @scala.inline
  def apply(
    bufferRadius: Double | js.Array[Double],
    formatSuggestion: js.Any => CallbackTo[String],
    layers: Double | js.Array[Double],
    searchFields: String | js.Array[String],
    url: String,
    attribution: String = null,
    label: String = null,
    maxResults: Int | Double = null,
    token: String = null
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("formatSuggestion")(js.Any.fromFunction1((t0: js.Any) => formatSuggestion(t0).runNow()))
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
}

