package typingsJapgolly.googleapis.cloudidentityV1Mod.cloudidentityV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceGroupsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique ID assigned to the Group.  Must be left blank while creating a
    * Group.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGroup] = js.native
  /**
    * Editable fields: `display_name`, `description`
    */
  var updateMask: js.UndefOr[String] = js.native
}

