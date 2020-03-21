package typingsJapgolly.googleapis.loggingV2Mod.loggingV2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceExclusionsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the exclusion to update:
    * "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
    * "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
    * "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example:
    * "projects/my-project-id/exclusions/my-exclusion-id".
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogExclusion] = js.native
  /**
    * Required. A nonempty list of fields to change in the existing exclusion.
    * New values for the fields are taken from the corresponding fields in the
    * LogExclusion included in this request. Fields not mentioned in
    * update_mask are not changed and are ignored in the request.For example,
    * to change the filter and description of an exclusion, specify an
    * update_mask of "filter,description".
    */
  var updateMask: js.UndefOr[String] = js.native
}

