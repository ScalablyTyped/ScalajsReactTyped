package typingsJapgolly.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceSearchResponse extends js.Object {
  /**
    * When the Google Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the search response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String
  /** may contain a set of attributions about this listing which must be displayed to the user (some listings may not have attribution). */
  var html_attributions: js.Array[String]
  /**
    * contains a token that can be used to return up to 20 additional results.
    * A `next_page_token` will not be returned if there are no additional results to display.
    * The maximum number of results that can be returned is 60.
    * There is a short delay between when a `next_page_token` is issued, and when it will become valid.
    */
  var next_page_token: String
  /**
    * contains an array of places, with information about each.
    * The Places API returns up to 20 `establishment` results per query.
    * Additionally, political results may be returned which serve to identify the area of the request.
    */
  var results: js.Array[PlaceSearchResult]
  /** contains metadata on the request. */
  var status: SearchResponseStatus
}

object PlaceSearchResponse {
  @scala.inline
  def apply(
    error_message: String,
    html_attributions: js.Array[String],
    next_page_token: String,
    results: js.Array[PlaceSearchResult],
    status: SearchResponseStatus
  ): PlaceSearchResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], next_page_token = next_page_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceSearchResponse]
  }
}

