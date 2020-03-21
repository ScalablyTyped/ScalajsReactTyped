package typingsJapgolly.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application to associate with this configuration template. If no application is found with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var ApplicationName: typingsJapgolly.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Describes this configuration.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The ID of the environment used with this configuration template.
    */
  var EnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value overrides the value obtained from the solution stack or the source configuration template.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  /**
    * The ARN of the custom platform.
    */
  var PlatformArn: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack used by this configuration. The solution stack specifies the operating system, architecture, and application server for a configuration template. It determines the set of configuration options as well as the possible and default values.  Use ListAvailableSolutionStacks to obtain a list of available solution stacks.   A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk returns an InvalidParameterValue error.  If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic Beanstalk uses the same solution stack as the source configuration template.
    */
  var SolutionStackName: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  /**
    * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to create a new configuration.  Values specified in the OptionSettings parameter of this call overrides any values obtained from the SourceConfiguration.   If no configuration template is found, returns an InvalidParameterValue error.   Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the solution stack of the source configuration template must match the specified solution stack name or else AWS Elastic Beanstalk returns an InvalidParameterCombination error. 
    */
  var SourceConfiguration: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.SourceConfiguration] = js.native
  /**
    * Specifies the tags applied to the configuration template.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.elasticbeanstalkMod.Tags] = js.native
  /**
    * The name of the configuration template. Constraint: This name must be unique per application. Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an InvalidParameterValue error. 
    */
  var TemplateName: ConfigurationTemplateName = js.native
}

object CreateConfigurationTemplateMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    TemplateName: ConfigurationTemplateName,
    Description: Description = null,
    EnvironmentId: EnvironmentId = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    SourceConfiguration: SourceConfiguration = null,
    Tags: Tags = null
  ): CreateConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    if (SourceConfiguration != null) __obj.updateDynamic("SourceConfiguration")(SourceConfiguration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationTemplateMessage]
  }
}

