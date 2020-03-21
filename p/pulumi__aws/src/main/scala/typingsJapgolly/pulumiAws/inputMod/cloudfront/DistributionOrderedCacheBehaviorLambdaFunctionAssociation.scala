package typingsJapgolly.pulumiAws.inputMod.cloudfront

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistributionOrderedCacheBehaviorLambdaFunctionAssociation extends js.Object {
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: Input[String] = js.native
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Input[Boolean]] = js.native
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: Input[String] = js.native
}

object DistributionOrderedCacheBehaviorLambdaFunctionAssociation {
  @scala.inline
  def apply(eventType: Input[String], lambdaArn: Input[String], includeBody: Input[Boolean] = null): DistributionOrderedCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    if (includeBody != null) __obj.updateDynamic("includeBody")(includeBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]
  }
}

