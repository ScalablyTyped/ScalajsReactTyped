package typingsJapgolly.pulumiAws.functionEventInvokeConfigMod

import typingsJapgolly.pulumiAws.inputMod.lambda.FunctionEventInvokeConfigDestinationConfig
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigArgs extends js.Object {
  /**
    * Configuration block with destination configuration. See below for details.
    */
  val destinationConfig: js.UndefOr[Input[FunctionEventInvokeConfigDestinationConfig]] = js.native
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
    */
  val functionName: Input[String] = js.native
  /**
    * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
    */
  val maximumEventAgeInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
    */
  val maximumRetryAttempts: js.UndefOr[Input[Double]] = js.native
  /**
    * Lambda Function published version, `$LATEST`, or Lambda Alias name.
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
}

object FunctionEventInvokeConfigArgs {
  @scala.inline
  def apply(
    functionName: Input[String],
    destinationConfig: Input[FunctionEventInvokeConfigDestinationConfig] = null,
    maximumEventAgeInSeconds: Input[Double] = null,
    maximumRetryAttempts: Input[Double] = null,
    qualifier: Input[String] = null
  ): FunctionEventInvokeConfigArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any])
    if (destinationConfig != null) __obj.updateDynamic("destinationConfig")(destinationConfig.asInstanceOf[js.Any])
    if (maximumEventAgeInSeconds != null) __obj.updateDynamic("maximumEventAgeInSeconds")(maximumEventAgeInSeconds.asInstanceOf[js.Any])
    if (maximumRetryAttempts != null) __obj.updateDynamic("maximumRetryAttempts")(maximumRetryAttempts.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionEventInvokeConfigArgs]
  }
}

