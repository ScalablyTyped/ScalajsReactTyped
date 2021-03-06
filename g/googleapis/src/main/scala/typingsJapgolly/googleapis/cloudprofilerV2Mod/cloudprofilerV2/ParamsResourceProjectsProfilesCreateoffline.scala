package typingsJapgolly.googleapis.cloudprofilerV2Mod.cloudprofilerV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsProfilesCreateoffline extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Parent project to create the profile in.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProfile] = js.native
}

