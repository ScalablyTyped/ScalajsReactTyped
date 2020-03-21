package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputProcessingConfigurationRequest extends js.Object {
  /**
    * The name of the application to which you want to add the input processing configuration.
    */
  var ApplicationName: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The version of the application to which you want to add the input processing configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The ID of the input configuration to add the input processing configuration to. You can get a list of the input IDs for an application using the DescribeApplication operation.
    */
  var InputId: Id = js.native
  /**
    * The InputProcessingConfiguration to add to the application.
    */
  var InputProcessingConfiguration: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.InputProcessingConfiguration = js.native
}

object AddApplicationInputProcessingConfigurationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    InputId: Id,
    InputProcessingConfiguration: InputProcessingConfiguration
  ): AddApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], InputId = InputId.asInstanceOf[js.Any], InputProcessingConfiguration = InputProcessingConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddApplicationInputProcessingConfigurationRequest]
  }
}

