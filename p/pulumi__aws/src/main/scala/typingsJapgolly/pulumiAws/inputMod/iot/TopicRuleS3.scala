package typingsJapgolly.pulumiAws.inputMod.iot

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicRuleS3 extends js.Object {
  /**
    * The Amazon S3 bucket name.
    */
  var bucketName: Input[String] = js.native
  /**
    * The object key.
    */
  var key: Input[String] = js.native
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: Input[String] = js.native
}

object TopicRuleS3 {
  @scala.inline
  def apply(bucketName: Input[String], key: Input[String], roleArn: Input[String]): TopicRuleS3 = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopicRuleS3]
  }
}

