package typingsJapgolly.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsWorkflowtemplatesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The "resource name" of the workflow template, as described in
    * https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}/workflowTemplates/{template_id}
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The version of workflow template to retrieve. Only previously
    * instatiated versions can be retrieved.If unspecified, retrieves the
    * current version.
    */
  var version: js.UndefOr[Double] = js.native
}

