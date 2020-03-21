package typingsJapgolly.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceRolloutsResponse extends js.Object {
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The list of rollout resources. */
  var rollouts: js.UndefOr[js.Array[Rollout]] = js.undefined
}

object ListServiceRolloutsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, rollouts: js.Array[Rollout] = null): ListServiceRolloutsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (rollouts != null) __obj.updateDynamic("rollouts")(rollouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceRolloutsResponse]
  }
}

