package typingsJapgolly.googleapis.bigtableadminV2Mod.bigtableadminV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesAppprofilesCreate extends StandardParameters {
  /**
    * The ID to be used when referring to the new app profile within its
    * instance, e.g., just `myprofile` rather than
    * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
    */
  var appProfileId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * If true, ignore safety checks when creating the app profile.
    */
  var ignoreWarnings: js.UndefOr[Boolean] = js.native
  /**
    * The unique name of the instance in which to create the new app profile.
    * Values are of the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAppProfile] = js.native
}

