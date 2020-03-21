package typingsJapgolly.watsonDeveloperCloud.speechToTextV1GeneratedMod

import typingsJapgolly.watsonDeveloperCloud.speechToTextV1GeneratedMod.CreateAcousticModelConstants.BaseModelName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `createAcousticModel` operation. */
trait CreateAcousticModelParams extends js.Object {
  /** The name of the base language model that is to be customized by the new custom acoustic model. The new custom model can be used only with the base model that it customizes. To determine whether a base model supports acoustic model customization, refer to [Language support for customization](https://cloud.ibm.com/docs/services/speech-to-text/custom.html#languageSupport). */
  var base_model_name: BaseModelName | String
  /** A description of the new custom acoustic model. Use a localized description that matches the language of the custom model. */
  var description: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** A user-defined name for the new custom acoustic model. Use a name that is unique among all custom acoustic models that you own. Use a localized name that matches the language of the custom model. Use a name that describes the acoustic environment of the custom model, such as `Mobile custom model` or `Noisy car custom model`. */
  var name: String
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object CreateAcousticModelParams {
  @scala.inline
  def apply(
    base_model_name: BaseModelName | String,
    name: String,
    description: String = null,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): CreateAcousticModelParams = {
    val __obj = js.Dynamic.literal(base_model_name = base_model_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAcousticModelParams]
  }
}

