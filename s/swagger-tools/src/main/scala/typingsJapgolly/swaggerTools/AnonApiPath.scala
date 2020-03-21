package typingsJapgolly.swaggerTools

import typingsJapgolly.swaggerTools.mod.OperationParameter
import typingsJapgolly.swaggerTools.mod.Swagger20Operation
import typingsJapgolly.swaggerTools.mod.SwaggerRequestParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiPath[P /* <: SwaggerRequestParameters */] extends js.Object {
  var apiPath: String
  var operation: js.UndefOr[Swagger20Operation] = js.undefined
  var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.undefined
  var operationPath: js.UndefOr[js.Array[String]] = js.undefined
  var params: P
  var path: js.Any
  var security: js.Array[_]
  var swaggerObject: js.Any
  var swaggerVersion: String
  var useStubs: js.UndefOr[Boolean] = js.undefined
}

object AnonApiPath {
  @scala.inline
  def apply[P /* <: SwaggerRequestParameters */](
    apiPath: String,
    params: P,
    path: js.Any,
    security: js.Array[_],
    swaggerObject: js.Any,
    swaggerVersion: String,
    operation: Swagger20Operation = null,
    operationParameters: js.Array[OperationParameter] = null,
    operationPath: js.Array[String] = null,
    useStubs: js.UndefOr[Boolean] = js.undefined
  ): AnonApiPath[P] = {
    val __obj = js.Dynamic.literal(apiPath = apiPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], swaggerObject = swaggerObject.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (operationParameters != null) __obj.updateDynamic("operationParameters")(operationParameters.asInstanceOf[js.Any])
    if (operationPath != null) __obj.updateDynamic("operationPath")(operationPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiPath[P]]
  }
}

