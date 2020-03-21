package typingsJapgolly.pulumiAws.inputMod.s3

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
    */
  var objectLockEnabled: Input[String] = js.native
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: js.UndefOr[Input[BucketObjectLockConfigurationRule]] = js.native
}

object BucketObjectLockConfiguration {
  @scala.inline
  def apply(objectLockEnabled: Input[String], rule: Input[BucketObjectLockConfigurationRule] = null): BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfiguration]
  }
}

