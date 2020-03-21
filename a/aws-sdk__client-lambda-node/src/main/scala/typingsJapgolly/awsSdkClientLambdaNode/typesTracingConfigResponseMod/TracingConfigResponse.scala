package typingsJapgolly.awsSdkClientLambdaNode.typesTracingConfigResponseMod

import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.Active
import typingsJapgolly.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingConfigResponse extends js.Object {
  /**
    * <p>The tracing mode.</p>
    */
  var Mode: js.UndefOr[Active | PassThrough | String] = js.undefined
}

object TracingConfigResponse {
  @scala.inline
  def apply(Mode: Active | PassThrough | String = null): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingConfigResponse]
  }
}

