package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutFunctionConcurrencyRequest extends js.Object {
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typingsJapgolly.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * The number of simultaneous executions to reserve for the function.
    */
  var ReservedConcurrentExecutions: typingsJapgolly.awsSdk.lambdaMod.ReservedConcurrentExecutions = js.native
}

object PutFunctionConcurrencyRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, ReservedConcurrentExecutions: ReservedConcurrentExecutions): PutFunctionConcurrencyRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ReservedConcurrentExecutions = ReservedConcurrentExecutions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutFunctionConcurrencyRequest]
  }
}

