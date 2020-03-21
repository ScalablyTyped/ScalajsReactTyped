package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDBv2Action extends js.Object {
  /**
    * Specifies the DynamoDB table to which the message data will be written. For example:  { "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" } } }  Each attribute in the message payload will be written to a separate column in the DynamoDB database.
    */
  var putItem: PutItemInput = js.native
  /**
    * The ARN of the IAM role that grants access to the DynamoDB table.
    */
  var roleArn: AwsArn = js.native
}

object DynamoDBv2Action {
  @scala.inline
  def apply(putItem: PutItemInput, roleArn: AwsArn): DynamoDBv2Action = {
    val __obj = js.Dynamic.literal(putItem = putItem.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamoDBv2Action]
  }
}

