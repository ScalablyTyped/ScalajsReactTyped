package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSummary extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Name of the application.
    */
  var ApplicationName: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Status of the application.
    */
  var ApplicationStatus: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationStatus = js.native
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSummary]
  }
}

