package typingsJapgolly.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocationsResponse extends js.Object {
  /** A list of locations that matches the specified filter in the request. */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListLocationsResponse {
  @scala.inline
  def apply(locations: js.Array[Location] = null, nextPageToken: String = null): ListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocationsResponse]
  }
}

