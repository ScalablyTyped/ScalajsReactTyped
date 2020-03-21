package typingsJapgolly.googleapis.storagetransferV1Mod.storagetransferV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTransferjobsGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The job to get. Required.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
}

