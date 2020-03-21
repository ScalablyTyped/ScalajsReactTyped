package typingsJapgolly.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggingConfigurationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the web ACL for which you want to get the LoggingConfiguration.
    */
  var ResourceArn: typingsJapgolly.awsSdk.wafMod.ResourceArn = js.native
}

object GetLoggingConfigurationRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoggingConfigurationRequest]
  }
}

