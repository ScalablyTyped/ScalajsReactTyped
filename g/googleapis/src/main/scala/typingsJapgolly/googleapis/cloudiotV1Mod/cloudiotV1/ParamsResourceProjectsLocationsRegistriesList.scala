package typingsJapgolly.googleapis.cloudiotV1Mod.cloudiotV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRegistriesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of registries to return in the response. If this value
    * is zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListDeviceRegistriesResponse`; indicates
    * that this is a continuation of a prior `ListDeviceRegistries` call and
    * the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project and cloud region path. For example,
    * `projects/example-project/locations/us-central1`.
    */
  var parent: js.UndefOr[String] = js.native
}

