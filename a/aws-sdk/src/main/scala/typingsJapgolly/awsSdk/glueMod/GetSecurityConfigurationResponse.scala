package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityConfigurationResponse extends js.Object {
  /**
    * The requested security configuration.
    */
  var SecurityConfiguration: js.UndefOr[typingsJapgolly.awsSdk.glueMod.SecurityConfiguration] = js.native
}

object GetSecurityConfigurationResponse {
  @scala.inline
  def apply(SecurityConfiguration: SecurityConfiguration = null): GetSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityConfigurationResponse]
  }
}

