package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the configuration.
    */
  var ConfigurationId: string = js.native
  /**
    * Required. The base64-encoded XML configuration.
    */
  var Data: js.UndefOr[string] = js.native
  /**
    * The description of the configuration.
    */
  var Description: js.UndefOr[string] = js.native
}

object UpdateConfigurationRequest {
  @scala.inline
  def apply(ConfigurationId: string, Data: string = null, Description: string = null): UpdateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfigurationRequest]
  }
}

