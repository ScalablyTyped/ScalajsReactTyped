package typingsJapgolly.gapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProjectBillingInfoResponse extends js.Object {
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListProjectBillingInfo` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * A list of `ProjectBillingInfo` resources representing the projects
    * associated with the billing account.
    */
  var projectBillingInfo: js.UndefOr[js.Array[ProjectBillingInfo]] = js.undefined
}

object ListProjectBillingInfoResponse {
  @scala.inline
  def apply(nextPageToken: String = null, projectBillingInfo: js.Array[ProjectBillingInfo] = null): ListProjectBillingInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (projectBillingInfo != null) __obj.updateDynamic("projectBillingInfo")(projectBillingInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectBillingInfoResponse]
  }
}

