package typingsJapgolly.pulumiAws.requestValidatorMod

import typingsJapgolly.pulumiAws.restApiMod.RestApi
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidatorArgs extends js.Object {
  /**
    * The name of the request validator
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApi: Input[RestApi] = js.native
  /**
    * Boolean whether to validate request body. Defaults to `false`.
    */
  val validateRequestBody: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Boolean whether to validate request parameters. Defaults to `false`.
    */
  val validateRequestParameters: js.UndefOr[Input[Boolean]] = js.native
}

object RequestValidatorArgs {
  @scala.inline
  def apply(
    restApi: Input[RestApi],
    name: Input[String] = null,
    validateRequestBody: Input[Boolean] = null,
    validateRequestParameters: Input[Boolean] = null
  ): RequestValidatorArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (validateRequestBody != null) __obj.updateDynamic("validateRequestBody")(validateRequestBody.asInstanceOf[js.Any])
    if (validateRequestParameters != null) __obj.updateDynamic("validateRequestParameters")(validateRequestParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestValidatorArgs]
  }
}

