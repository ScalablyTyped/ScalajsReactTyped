package typingsJapgolly.googleapis.appengineV1betaMod.appengineV1beta

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsServicesVersionsCreate extends StandardParameters {
  /**
    * Part of `parent`. Name of the parent resource to create this version
    * under. Example: apps/myapp/services/default.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVersion] = js.native
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.native
}

