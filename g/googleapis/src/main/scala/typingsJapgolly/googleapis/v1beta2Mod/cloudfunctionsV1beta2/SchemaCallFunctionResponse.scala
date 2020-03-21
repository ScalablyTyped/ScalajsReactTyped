package typingsJapgolly.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionResponse extends js.Object {
  /**
    * Either system or user-function generated error. Set if execution was not
    * successful.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Execution id of function invocation.
    */
  var executionId: js.UndefOr[String] = js.native
  /**
    * Result populated for successful execution of synchronous function. Will
    * not be populated if function does not return a result through context.
    */
  var result: js.UndefOr[String] = js.native
}

object SchemaCallFunctionResponse {
  @scala.inline
  def apply(error: String = null, executionId: String = null, result: String = null): SchemaCallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (executionId != null) __obj.updateDynamic("executionId")(executionId.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCallFunctionResponse]
  }
}

