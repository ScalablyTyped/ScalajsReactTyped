package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOTAUpdatesRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The OTA update job status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.native
}

object ListOTAUpdatesRequest {
  @scala.inline
  def apply(
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    otaUpdateStatus: OTAUpdateStatus = null
  ): ListOTAUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (otaUpdateStatus != null) __obj.updateDynamic("otaUpdateStatus")(otaUpdateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOTAUpdatesRequest]
  }
}

