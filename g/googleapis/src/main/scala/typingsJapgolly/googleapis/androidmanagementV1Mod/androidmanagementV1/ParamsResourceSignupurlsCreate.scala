package typingsJapgolly.googleapis.androidmanagementV1Mod.androidmanagementV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSignupurlsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The callback URL that the admin will be redirected to after successfully
    * creating an enterprise. Before redirecting there the system will add a
    * query parameter to this URL named enterpriseToken which will contain an
    * opaque token to be used for the create enterprise request. The URL will
    * be parsed then reformatted in order to add the enterpriseToken parameter,
    * so there may be some minor formatting changes.
    */
  var callbackUrl: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform project which will own the
    * enterprise.
    */
  var projectId: js.UndefOr[String] = js.native
}

