package typingsJapgolly.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.awsLambdaStrings.FAILED
import typingsJapgolly.awsLambda.awsLambdaStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceSuccessResponse
  - typingsJapgolly.awsLambda.cloudformationCustomResourceMod.CloudFormationCustomResourceFailedResponse
*/
trait CloudFormationCustomResourceResponse extends js.Object

object CloudFormationCustomResourceResponse {
  @scala.inline
  def CloudFormationCustomResourceSuccessResponse(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    StackId: String,
    Status: SUCCESS,
    Data: StringDictionary[js.Any] = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined,
    Reason: String = null
  ): CloudFormationCustomResourceResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponse]
  }
  @scala.inline
  def CloudFormationCustomResourceFailedResponse(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    Reason: String,
    RequestId: String,
    StackId: String,
    Status: FAILED,
    Data: StringDictionary[js.Any] = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponse]
  }
}

