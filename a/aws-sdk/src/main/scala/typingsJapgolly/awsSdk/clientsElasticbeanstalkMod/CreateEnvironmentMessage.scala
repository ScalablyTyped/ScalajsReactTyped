package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentMessage extends StObject {
  
  /**
    * The name of the application that is associated with this environment.
    */
  var ApplicationName: typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ApplicationName
  
  /**
    * If specified, the environment attempts to use this value as the prefix for the CNAME in your Elastic Beanstalk environment URL. If not specified, the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
    */
  var CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined
  
  /**
    * Your description for this environment.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  
  /**
    * A unique name for the environment. Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens. It can't start or end with a hyphen. This name must be unique within a region in your account. If the specified name already exists in the region, Elastic Beanstalk returns an InvalidParameterValue error.  If you don't specify the CNAMEPrefix parameter, the environment name becomes part of the CNAME, and therefore part of the visible URL for your application.
    */
  var EnvironmentName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The name of the group to which the target environment belongs. Specify a group name only if the environment's name is specified in an environment manifest and not with the environment name parameter. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.GroupName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to be used as the environment's operations role. If specified, Elastic Beanstalk uses the operations role for permissions to downstream services during this call and during subsequent calls acting on this environment. To specify an operations role, you must have the iam:PassRole permission for the role. For more information, see Operations roles in the AWS Elastic Beanstalk Developer Guide.
    */
  var OperationsRole: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.OperationsRole] = js.undefined
  
  /**
    * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the configuration set for the new environment. These override the values obtained from the solution stack or the configuration template.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
  
  /**
    * A list of custom user-defined configuration options to remove from the configuration set for this new environment.
    */
  var OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom platform to use with the environment. For more information, see Custom Platforms in the AWS Elastic Beanstalk Developer Guide.  If you specify PlatformArn, don't specify SolutionStackName. 
    */
  var PlatformArn: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  
  /**
    * The name of an Elastic Beanstalk solution stack (platform version) to use with the environment. If specified, Elastic Beanstalk sets the configuration values to the default values associated with the specified solution stack. For a list of current solution stacks, see Elastic Beanstalk Supported Platforms in the AWS Elastic Beanstalk Platforms guide.  If you specify SolutionStackName, don't specify PlatformArn or TemplateName. 
    */
  var SolutionStackName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
  
  /**
    * Specifies the tags applied to resources in the environment.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
  
  /**
    * The name of the Elastic Beanstalk configuration template to use with the environment.  If you specify TemplateName, then don't specify SolutionStackName. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  
  /**
    * Specifies the tier to use in creating this environment. The environment tier that you choose determines whether Elastic Beanstalk provisions resources to support a web application that handles HTTP(S) requests or a web application that handles background-processing tasks.
    */
  var Tier: js.UndefOr[EnvironmentTier] = js.undefined
  
  /**
    * The name of the application version to deploy. Default: If not specified, Elastic Beanstalk attempts to deploy the sample application.
    */
  var VersionLabel: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}
object CreateEnvironmentMessage {
  
  inline def apply(ApplicationName: ApplicationName): CreateEnvironmentMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentMessage]
  }
  
  extension [Self <: CreateEnvironmentMessage](x: Self) {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCNAMEPrefix(value: DNSCnamePrefix): Self = StObject.set(x, "CNAMEPrefix", value.asInstanceOf[js.Any])
    
    inline def setCNAMEPrefixUndefined: Self = StObject.set(x, "CNAMEPrefix", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setOperationsRole(value: OperationsRole): Self = StObject.set(x, "OperationsRole", value.asInstanceOf[js.Any])
    
    inline def setOperationsRoleUndefined: Self = StObject.set(x, "OperationsRole", js.undefined)
    
    inline def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setOptionsToRemove(value: OptionsSpecifierList): Self = StObject.set(x, "OptionsToRemove", value.asInstanceOf[js.Any])
    
    inline def setOptionsToRemoveUndefined: Self = StObject.set(x, "OptionsToRemove", js.undefined)
    
    inline def setOptionsToRemoveVarargs(value: OptionSpecification*): Self = StObject.set(x, "OptionsToRemove", js.Array(value*))
    
    inline def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    inline def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    inline def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    inline def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
    
    inline def setTier(value: EnvironmentTier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
    
    inline def setVersionLabelUndefined: Self = StObject.set(x, "VersionLabel", js.undefined)
  }
}
