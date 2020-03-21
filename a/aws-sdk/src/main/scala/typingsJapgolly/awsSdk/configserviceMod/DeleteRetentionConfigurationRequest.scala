package typingsJapgolly.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRetentionConfigurationRequest extends js.Object {
  /**
    * The name of the retention configuration to delete.
    */
  var RetentionConfigurationName: typingsJapgolly.awsSdk.configserviceMod.RetentionConfigurationName = js.native
}

object DeleteRetentionConfigurationRequest {
  @scala.inline
  def apply(RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionConfigurationName = RetentionConfigurationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
  }
}

