package typingsJapgolly.googleapis.dlpV2Mod.dlpV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsDeidentifytemplatesDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name of the organization and deidentify template to be deleted,
    * for example `organizations/433245324/deidentifyTemplates/432452342` or
    * projects/project-id/deidentifyTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.native
}

