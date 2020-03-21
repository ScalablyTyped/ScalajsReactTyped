package typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationVersionResponse extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
  /**
    * An array of parameter types supported by the application.
    */
  var ParameterDefinitions: js.UndefOr[listOfParameterDefinition] = js.native
  /**
    * A list of values that you must specify before you can deploy certain applications.
    Some applications might include resources that can affect permissions in your AWS
    account, for example, by creating new AWS Identity and Access Management (IAM) users.
    For those applications, you must explicitly acknowledge their capabilities by
    specifying this parameter.The only valid values are CAPABILITY_IAM, CAPABILITY_NAMED_IAM,
    CAPABILITY_RESOURCE_POLICY, and CAPABILITY_AUTO_EXPAND.The following resources require you to specify CAPABILITY_IAM or
    CAPABILITY_NAMED_IAM:
    AWS::IAM::Group,
    AWS::IAM::InstanceProfile,
    AWS::IAM::Policy, and
    AWS::IAM::Role.
    If the application contains IAM resources, you can specify either CAPABILITY_IAM
    or CAPABILITY_NAMED_IAM. If the application contains IAM resources
    with custom names, you must specify CAPABILITY_NAMED_IAM.The following resources require you to specify CAPABILITY_RESOURCE_POLICY:
    AWS::Lambda::Permission,
    AWS::IAM:Policy,
    AWS::ApplicationAutoScaling::ScalingPolicy,
    AWS::S3::BucketPolicy,
    AWS::SQS::QueuePolicy, and
    AWS::SNS::TopicPolicy.Applications that contain one or more nested applications require you to specify
    CAPABILITY_AUTO_EXPAND.If your application template contains any of the above resources, we recommend that you review
    all permissions associated with the application before deploying. If you don't specify
    this parameter for an application that requires capabilities, the call will fail.
    */
  var RequiredCapabilities: js.UndefOr[listOfCapability] = js.native
  /**
    * Whether all of the AWS resources contained in this application are supported in the region
    in which it is being retrieved.
    */
  var ResourcesSupported: js.UndefOr[boolean] = js.native
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  /**
    * A link to the packaged AWS SAM template of your application.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}

object CreateApplicationVersionResponse {
  @scala.inline
  def apply(
    ApplicationId: string = null,
    CreationTime: string = null,
    ParameterDefinitions: listOfParameterDefinition = null,
    RequiredCapabilities: listOfCapability = null,
    ResourcesSupported: js.UndefOr[Boolean] = js.undefined,
    SemanticVersion: string = null,
    SourceCodeArchiveUrl: string = null,
    SourceCodeUrl: string = null,
    TemplateUrl: string = null
  ): CreateApplicationVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (ParameterDefinitions != null) __obj.updateDynamic("ParameterDefinitions")(ParameterDefinitions.asInstanceOf[js.Any])
    if (RequiredCapabilities != null) __obj.updateDynamic("RequiredCapabilities")(RequiredCapabilities.asInstanceOf[js.Any])
    if (!js.isUndefined(ResourcesSupported)) __obj.updateDynamic("ResourcesSupported")(ResourcesSupported.asInstanceOf[js.Any])
    if (SemanticVersion != null) __obj.updateDynamic("SemanticVersion")(SemanticVersion.asInstanceOf[js.Any])
    if (SourceCodeArchiveUrl != null) __obj.updateDynamic("SourceCodeArchiveUrl")(SourceCodeArchiveUrl.asInstanceOf[js.Any])
    if (SourceCodeUrl != null) __obj.updateDynamic("SourceCodeUrl")(SourceCodeUrl.asInstanceOf[js.Any])
    if (TemplateUrl != null) __obj.updateDynamic("TemplateUrl")(TemplateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationVersionResponse]
  }
}

