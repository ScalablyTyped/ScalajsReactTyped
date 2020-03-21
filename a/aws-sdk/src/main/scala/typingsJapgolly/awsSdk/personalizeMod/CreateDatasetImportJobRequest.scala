package typingsJapgolly.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: DataSource = js.native
  /**
    * The ARN of the dataset that receives the imported data.
    */
  var datasetArn: Arn = js.native
  /**
    * The name for the dataset import job.
    */
  var jobName: Name = js.native
  /**
    * The ARN of the IAM role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: RoleArn = js.native
}

object CreateDatasetImportJobRequest {
  @scala.inline
  def apply(dataSource: DataSource, datasetArn: Arn, jobName: Name, roleArn: RoleArn): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], datasetArn = datasetArn.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
}

