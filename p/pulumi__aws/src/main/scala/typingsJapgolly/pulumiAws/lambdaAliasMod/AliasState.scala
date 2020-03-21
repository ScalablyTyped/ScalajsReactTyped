package typingsJapgolly.pulumiAws.lambdaAliasMod

import typingsJapgolly.pulumiAws.inputMod.lambda.AliasRoutingConfig
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda function alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The function ARN of the Lambda function for which you want to create an alias.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`aws.apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    */
  val invokeArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: js.UndefOr[Input[AliasRoutingConfig]] = js.native
}

object AliasState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    functionName: Input[String] = null,
    functionVersion: Input[String] = null,
    invokeArn: Input[String] = null,
    name: Input[String] = null,
    routingConfig: Input[AliasRoutingConfig] = null
  ): AliasState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (functionVersion != null) __obj.updateDynamic("functionVersion")(functionVersion.asInstanceOf[js.Any])
    if (invokeArn != null) __obj.updateDynamic("invokeArn")(invokeArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (routingConfig != null) __obj.updateDynamic("routingConfig")(routingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasState]
  }
}

