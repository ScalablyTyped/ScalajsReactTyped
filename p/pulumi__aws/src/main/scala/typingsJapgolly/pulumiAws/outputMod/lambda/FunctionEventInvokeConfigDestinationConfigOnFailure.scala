package typingsJapgolly.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionEventInvokeConfigDestinationConfigOnFailure extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the destination resource. See the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations) for acceptable resource types and associated IAM permissions.
    */
  var destination: String = js.native
}

object FunctionEventInvokeConfigDestinationConfigOnFailure {
  @scala.inline
  def apply(destination: String): FunctionEventInvokeConfigDestinationConfigOnFailure = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FunctionEventInvokeConfigDestinationConfigOnFailure]
  }
}

