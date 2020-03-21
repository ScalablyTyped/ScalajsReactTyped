package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFunctionEventInvokeConfigRequest extends js.Object {
  /**
    * A destination for events after they have been sent to a function for processing.  Destinations     Function - The Amazon Resource Name (ARN) of a Lambda function.    Queue - The ARN of an SQS queue.    Topic - The ARN of an SNS topic.    Event Bus - The ARN of an Amazon EventBridge event bus.  
    */
  var DestinationConfig: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The maximum age of a request that Lambda sends to a function for processing.
    */
  var MaximumEventAgeInSeconds: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.MaximumEventAgeInSeconds] = js.native
  /**
    * The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.MaximumRetryAttempts] = js.native
  /**
    * A version number or alias name.
    */
  var Qualifier: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.Qualifier] = js.native
}

object PutFunctionEventInvokeConfigRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    DestinationConfig: DestinationConfig = null,
    MaximumEventAgeInSeconds: Int | Double = null,
    MaximumRetryAttempts: Int | Double = null,
    Qualifier: Qualifier = null
  ): PutFunctionEventInvokeConfigRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (MaximumEventAgeInSeconds != null) __obj.updateDynamic("MaximumEventAgeInSeconds")(MaximumEventAgeInSeconds.asInstanceOf[js.Any])
    if (MaximumRetryAttempts != null) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.asInstanceOf[js.Any])
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFunctionEventInvokeConfigRequest]
  }
}

