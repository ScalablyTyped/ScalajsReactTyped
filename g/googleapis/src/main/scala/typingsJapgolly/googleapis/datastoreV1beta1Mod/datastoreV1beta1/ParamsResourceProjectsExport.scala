package typingsJapgolly.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsExport extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
  * Project ID against which to make the request.
  */
  var projectId: js.UndefOr[String] = js.native
  /**
  * Request body metadata
  */
  var requestBody: js.UndefOr[SchemaGoogleDatastoreAdminV1beta1ExportEntitiesRequest] = js.native
}

