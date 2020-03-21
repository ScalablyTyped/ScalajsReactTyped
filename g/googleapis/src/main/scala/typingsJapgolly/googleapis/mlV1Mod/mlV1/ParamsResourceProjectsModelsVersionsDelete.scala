package typingsJapgolly.googleapis.mlV1Mod.mlV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsModelsVersionsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The name of the version. You can get the names of all the
    * versions of a model by calling
    * [projects.models.versions.list](/ml-engine/reference/rest/v1/projects.models.versions/list).
    */
  var name: js.UndefOr[String] = js.native
}

