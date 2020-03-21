package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunctionDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.native
  /**
    * The ID of the Lambda function definition.
    */
  var FunctionDefinitionId: string = js.native
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.native
}

object CreateFunctionDefinitionVersionRequest {
  @scala.inline
  def apply(
    FunctionDefinitionId: string,
    AmznClientToken: string = null,
    DefaultConfig: FunctionDefaultConfig = null,
    Functions: listOfFunction = null
  ): CreateFunctionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(FunctionDefinitionId = FunctionDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (DefaultConfig != null) __obj.updateDynamic("DefaultConfig")(DefaultConfig.asInstanceOf[js.Any])
    if (Functions != null) __obj.updateDynamic("Functions")(Functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionDefinitionVersionRequest]
  }
}

