package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunctionResponse extends js.Object {
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}

object CreateFunctionResponse {
  @scala.inline
  def apply(functionConfiguration: FunctionConfiguration = null): CreateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (functionConfiguration != null) __obj.updateDynamic("functionConfiguration")(functionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFunctionResponse]
  }
}

