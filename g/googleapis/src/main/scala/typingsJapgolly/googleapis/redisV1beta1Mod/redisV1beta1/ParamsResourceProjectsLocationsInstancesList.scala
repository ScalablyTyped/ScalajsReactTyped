package typingsJapgolly.googleapis.redisV1beta1Mod.redisV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsInstancesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of items to return.  If not specified, a default value
    * of 1000 will be used by the service. Regardless of the page_size value,
    * the response may include a partial list and a caller should only rely on
    * response's next_page_token to determine if there are more instances left
    * to be queried.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the instance location using the form:
    * `projects/{project_id}/locations/{location_id}` where `location_id`
    * refers to a GCP region
    */
  var parent: js.UndefOr[String] = js.native
}

