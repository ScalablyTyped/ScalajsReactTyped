package typingsJapgolly.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsSubscription extends js.Object {
  /**
    * The ARN of a standard.
    */
  var StandardsArn: NonEmptyString = js.native
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: StandardsInputParameterMap = js.native
  /**
    * The status of the standards subscription.
    */
  var StandardsStatus: typingsJapgolly.awsSdk.securityhubMod.StandardsStatus = js.native
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString = js.native
}

object StandardsSubscription {
  @scala.inline
  def apply(
    StandardsArn: NonEmptyString,
    StandardsInput: StandardsInputParameterMap,
    StandardsStatus: StandardsStatus,
    StandardsSubscriptionArn: NonEmptyString
  ): StandardsSubscription = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any], StandardsInput = StandardsInput.asInstanceOf[js.Any], StandardsStatus = StandardsStatus.asInstanceOf[js.Any], StandardsSubscriptionArn = StandardsSubscriptionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StandardsSubscription]
  }
}

