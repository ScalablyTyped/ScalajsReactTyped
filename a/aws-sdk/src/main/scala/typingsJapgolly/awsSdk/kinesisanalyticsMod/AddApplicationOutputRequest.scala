package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationOutputRequest extends js.Object {
  /**
    * Name of the application to which you want to add the output configuration.
    */
  var ApplicationName: typingsJapgolly.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Version of the application to which you want to add the output configuration. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * An array of objects, each describing one output configuration. In the output configuration, you specify the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
    */
  var Output: typingsJapgolly.awsSdk.kinesisanalyticsMod.Output = js.native
}

object AddApplicationOutputRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    Output: Output
  ): AddApplicationOutputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddApplicationOutputRequest]
  }
}

