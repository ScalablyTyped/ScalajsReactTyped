package typingsJapgolly.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typingsJapgolly.googleAuthLibrary.mod.Compute
import typingsJapgolly.googleAuthLibrary.mod.JWT
import typingsJapgolly.googleAuthLibrary.mod.OAuth2Client
import typingsJapgolly.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCustomersConfigurationsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The configuration to delete. An API resource name in the format
    * `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. If the
    * configuration is applied to any devices, the API call fails.
    */
  var name: js.UndefOr[String] = js.native
}

