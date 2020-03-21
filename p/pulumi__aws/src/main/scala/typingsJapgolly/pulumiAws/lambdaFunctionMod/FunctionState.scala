package typingsJapgolly.pulumiAws.lambdaFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.arnMod.ARN
import typingsJapgolly.pulumiAws.inputMod.lambda.FunctionDeadLetterConfig
import typingsJapgolly.pulumiAws.inputMod.lambda.FunctionEnvironment
import typingsJapgolly.pulumiAws.inputMod.lambda.FunctionTracingConfig
import typingsJapgolly.pulumiAws.inputMod.lambda.FunctionVpcConfig
import typingsJapgolly.pulumiPulumi.mod.asset.Archive
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[Input[Archive]] = js.native
  /**
    * Nested block to configure the function's *dead letter queue*. See details below.
    */
  val deadLetterConfig: js.UndefOr[Input[FunctionDeadLetterConfig]] = js.native
  /**
    * Description of what your Lambda Function does.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The Lambda environment's configuration settings. Fields documented below.
    */
  val environment: js.UndefOr[Input[FunctionEnvironment]] = js.native
  /**
    * The function [entrypoint][3] in your code.
    */
  val handler: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`aws.apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    */
  val invokeArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: js.UndefOr[Input[String]] = js.native
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers][10]
    */
  val layers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits][5]
    */
  val memorySize: js.UndefOr[Input[Double]] = js.native
  /**
    * A unique name for your Lambda Function.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
    */
  val publish: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function Version
    * (if versioning is enabled via `publish = true`).
    */
  val qualifiedArn: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency][9]
    */
  val reservedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model][4] for more details.
    */
  val role: js.UndefOr[Input[ARN]] = js.native
  /**
    * See [Runtimes][6] for valid values.
    */
  val runtime: js.UndefOr[Input[String]] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[Input[String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `filebase64sha256("file.zip")` (this provider 0.11.12 and later) or `base64sha256(file("file.zip"))` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda function source archive.
    */
  val sourceCodeHash: js.UndefOr[Input[String]] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits][5]
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  val tracingConfig: js.UndefOr[Input[FunctionTracingConfig]] = js.native
  /**
    * Latest published version of your Lambda Function.
    */
  val version: js.UndefOr[Input[String]] = js.native
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC][7]
    */
  val vpcConfig: js.UndefOr[Input[FunctionVpcConfig]] = js.native
}

object FunctionState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    code: Input[Archive] = null,
    deadLetterConfig: Input[FunctionDeadLetterConfig] = null,
    description: Input[String] = null,
    environment: Input[FunctionEnvironment] = null,
    handler: Input[String] = null,
    invokeArn: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    lastModified: Input[String] = null,
    layers: Input[js.Array[Input[String]]] = null,
    memorySize: Input[Double] = null,
    name: Input[String] = null,
    publish: Input[Boolean] = null,
    qualifiedArn: Input[String] = null,
    reservedConcurrentExecutions: Input[Double] = null,
    role: Input[ARN] = null,
    runtime: Input[String] = null,
    s3Bucket: Input[String] = null,
    s3Key: Input[String] = null,
    s3ObjectVersion: Input[String] = null,
    sourceCodeHash: Input[String] = null,
    sourceCodeSize: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null,
    timeout: Input[Double] = null,
    tracingConfig: Input[FunctionTracingConfig] = null,
    version: Input[String] = null,
    vpcConfig: Input[FunctionVpcConfig] = null
  ): FunctionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (deadLetterConfig != null) __obj.updateDynamic("deadLetterConfig")(deadLetterConfig.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (invokeArn != null) __obj.updateDynamic("invokeArn")(invokeArn.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (memorySize != null) __obj.updateDynamic("memorySize")(memorySize.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (qualifiedArn != null) __obj.updateDynamic("qualifiedArn")(qualifiedArn.asInstanceOf[js.Any])
    if (reservedConcurrentExecutions != null) __obj.updateDynamic("reservedConcurrentExecutions")(reservedConcurrentExecutions.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key.asInstanceOf[js.Any])
    if (s3ObjectVersion != null) __obj.updateDynamic("s3ObjectVersion")(s3ObjectVersion.asInstanceOf[js.Any])
    if (sourceCodeHash != null) __obj.updateDynamic("sourceCodeHash")(sourceCodeHash.asInstanceOf[js.Any])
    if (sourceCodeSize != null) __obj.updateDynamic("sourceCodeSize")(sourceCodeSize.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tracingConfig != null) __obj.updateDynamic("tracingConfig")(tracingConfig.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionState]
  }
}

