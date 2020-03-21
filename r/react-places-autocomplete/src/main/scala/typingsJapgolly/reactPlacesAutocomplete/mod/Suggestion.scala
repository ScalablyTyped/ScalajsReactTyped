package typingsJapgolly.reactPlacesAutocomplete.mod

import typingsJapgolly.googlemaps.google.maps.places.PredictionSubstring
import typingsJapgolly.googlemaps.google.maps.places.PredictionTerm
import typingsJapgolly.reactPlacesAutocomplete.AnonMainText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var active: Boolean
  var description: String
  var formattedSuggestion: AnonMainText
  var id: String
  var index: Double
  var matchedSubstrings: js.Array[PredictionSubstring]
  var placeId: String
  var terms: js.Array[PredictionTerm]
  var types: js.Array[String]
}

object Suggestion {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    formattedSuggestion: AnonMainText,
    id: String,
    index: Double,
    matchedSubstrings: js.Array[PredictionSubstring],
    placeId: String,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): Suggestion = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedSuggestion = formattedSuggestion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], matchedSubstrings = matchedSubstrings.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Suggestion]
  }
}

