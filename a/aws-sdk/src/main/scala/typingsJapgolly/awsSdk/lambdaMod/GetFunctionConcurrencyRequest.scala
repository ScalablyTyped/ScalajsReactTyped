package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionConcurrencyRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.lambdaMod.FunctionName = js.native
}

object GetFunctionConcurrencyRequest {
  @scala.inline
  def apply(FunctionName: FunctionName): GetFunctionConcurrencyRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFunctionConcurrencyRequest]
  }
}

