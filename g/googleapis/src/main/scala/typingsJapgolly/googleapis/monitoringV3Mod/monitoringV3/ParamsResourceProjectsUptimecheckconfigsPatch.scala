package typingsJapgolly.googleapis.monitoringV3Mod.monitoringV3

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsUptimecheckconfigsPatch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A unique resource name for this UptimeCheckConfig. The format
    * is:projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].This field
    * should be omitted when creating the uptime check configuration; on
    * create, the resource name is assigned by the server and included in the
    * response.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUptimeCheckConfig] = js.native
  /**
    * Optional. If present, only the listed fields in the current uptime check
    * configuration are updated with values from the new configuration. If this
    * field is empty, then the current configuration is completely replaced
    * with the new configuration.
    */
  var updateMask: js.UndefOr[String] = js.native
}

