package typingsJapgolly.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingConfigurationRequest extends js.Object {
  /**
    * 
    */
  var LoggingConfiguration: typingsJapgolly.awsSdk.wafv2Mod.LoggingConfiguration = js.native
}

object PutLoggingConfigurationRequest {
  @scala.inline
  def apply(LoggingConfiguration: LoggingConfiguration): PutLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(LoggingConfiguration = LoggingConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutLoggingConfigurationRequest]
  }
}

