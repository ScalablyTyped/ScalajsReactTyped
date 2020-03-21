package typingsJapgolly.pulumiAws.inputMod.s3

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketObjectLockConfigurationRule extends js.Object {
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention] = js.native
}

object BucketObjectLockConfigurationRule {
  @scala.inline
  def apply(defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention]): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
}

