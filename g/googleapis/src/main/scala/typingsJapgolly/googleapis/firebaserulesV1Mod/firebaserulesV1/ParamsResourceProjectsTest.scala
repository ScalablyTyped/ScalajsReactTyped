package typingsJapgolly.googleapis.firebaserulesV1Mod.firebaserulesV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTest extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Tests may either provide `source` or a `Ruleset` resource name.  For
    * tests against `source`, the resource name must refer to the project:
    * Format: `projects/{project_id}`  For tests against a `Ruleset`, this must
    * be the `Ruleset` resource name: Format:
    * `projects/{project_id}/rulesets/{ruleset_id}`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTestRulesetRequest] = js.native
}

