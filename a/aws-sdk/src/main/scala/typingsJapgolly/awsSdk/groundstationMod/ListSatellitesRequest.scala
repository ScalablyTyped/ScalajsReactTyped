package typingsJapgolly.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSatellitesRequest extends js.Object {
  /**
    * Maximum number of satellites returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListSatellitesRequest {
  @scala.inline
  def apply(maxResults: Int | scala.Double = null, nextToken: String = null): ListSatellitesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSatellitesRequest]
  }
}

