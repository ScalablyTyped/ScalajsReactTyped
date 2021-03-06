package typingsJapgolly.googleapis.testingV1Mod.testingV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsTestmatricesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Cloud project that owns the test matrix.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Unique test matrix id which was assigned by the service.
    */
  var testMatrixId: js.UndefOr[String] = js.native
}

