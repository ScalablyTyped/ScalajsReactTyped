package typingsJapgolly.pulumiAws.methodSettingsMod

import typingsJapgolly.pulumiAws.inputMod.apigateway.MethodSettingsSettings
import typingsJapgolly.pulumiAws.restApiMod.RestApi
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: Input[String] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: Input[RestApi] = js.native
  /**
    * The settings block, see below.
    */
  val settings: Input[MethodSettingsSettings] = js.native
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
}

object MethodSettingsArgs {
  @scala.inline
  def apply(
    methodPath: Input[String],
    restApi: Input[RestApi],
    settings: Input[MethodSettingsSettings],
    stageName: Input[String]
  ): MethodSettingsArgs = {
    val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodSettingsArgs]
  }
}

