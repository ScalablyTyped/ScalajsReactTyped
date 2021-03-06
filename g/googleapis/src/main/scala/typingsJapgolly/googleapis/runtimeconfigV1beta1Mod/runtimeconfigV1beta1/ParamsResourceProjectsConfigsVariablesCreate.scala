package typingsJapgolly.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsConfigsVariablesCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The path to the RutimeConfig resource that this variable should belong
    * to. The configuration must exist beforehand; the path must be in the
    * format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVariable] = js.native
  /**
    * An optional but recommended unique `request_id`. If the server receives
    * two `create()` requests  with the same `request_id`, then the second
    * request will be ignored and the first resource created and stored in the
    * backend is returned. Empty `request_id` fields are ignored.  It is
    * responsibility of the client to ensure uniqueness of the `request_id`
    * strings.  `request_id` strings are limited to 64 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}

