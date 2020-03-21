package typingsJapgolly.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentPropertiesExtended extends js.Object {
  /**
    * The correlation ID of the deployment.
    */
  val correlationId: js.UndefOr[String] = js.undefined
  /**
    * The debug setting of the deployment.
    */
  var debugSetting: js.UndefOr[DebugSetting] = js.undefined
  /**
    * The list of deployment dependencies.
    */
  var dependencies: js.UndefOr[js.Array[Dependency]] = js.undefined
  /**
    * The deployment mode. Possible values are Incremental and Complete. Possible values include:
    * 'Incremental', 'Complete'
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * The deployment on error behavior.
    */
  var onErrorDeployment: js.UndefOr[OnErrorDeploymentExtended] = js.undefined
  /**
    * Key/value pairs that represent deployment output.
    */
  var outputs: js.UndefOr[js.Any] = js.undefined
  /**
    * Deployment parameters. Use only one of Parameters or ParametersLink.
    */
  var parameters: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI referencing the parameters. Use only one of Parameters or ParametersLink.
    */
  var parametersLink: js.UndefOr[ParametersLink] = js.undefined
  /**
    * The list of resource providers needed for the deployment.
    */
  var providers: js.UndefOr[js.Array[Provider]] = js.undefined
  /**
    * The state of the provisioning.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
  /**
    * The template content. Use only one of Template or TemplateLink.
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /**
    * The URI referencing the template. Use only one of Template or TemplateLink.
    */
  var templateLink: js.UndefOr[TemplateLink] = js.undefined
  /**
    * The timestamp of the template deployment.
    */
  val timestamp: js.UndefOr[js.Date] = js.undefined
}

object DeploymentPropertiesExtended {
  @scala.inline
  def apply(
    correlationId: String = null,
    debugSetting: DebugSetting = null,
    dependencies: js.Array[Dependency] = null,
    mode: String = null,
    onErrorDeployment: OnErrorDeploymentExtended = null,
    outputs: js.Any = null,
    parameters: js.Any = null,
    parametersLink: ParametersLink = null,
    providers: js.Array[Provider] = null,
    provisioningState: String = null,
    template: js.Any = null,
    templateLink: TemplateLink = null,
    timestamp: js.Date = null
  ): DeploymentPropertiesExtended = {
    val __obj = js.Dynamic.literal()
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (debugSetting != null) __obj.updateDynamic("debugSetting")(debugSetting.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onErrorDeployment != null) __obj.updateDynamic("onErrorDeployment")(onErrorDeployment.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (parametersLink != null) __obj.updateDynamic("parametersLink")(parametersLink.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateLink != null) __obj.updateDynamic("templateLink")(templateLink.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentPropertiesExtended]
  }
}

