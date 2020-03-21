package typingsJapgolly.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultUpdateRequestModel extends js.Object {
  var actionResultDeletes: js.Array[TestActionResultModel]
  var actionResults: js.Array[TestActionResultModel]
  var parameterDeletes: js.Array[TestResultParameterModel]
  var parameters: js.Array[TestResultParameterModel]
  var testCaseResult: TestCaseResultUpdateModel
}

object ResultUpdateRequestModel {
  @scala.inline
  def apply(
    actionResultDeletes: js.Array[TestActionResultModel],
    actionResults: js.Array[TestActionResultModel],
    parameterDeletes: js.Array[TestResultParameterModel],
    parameters: js.Array[TestResultParameterModel],
    testCaseResult: TestCaseResultUpdateModel
  ): ResultUpdateRequestModel = {
    val __obj = js.Dynamic.literal(actionResultDeletes = actionResultDeletes.asInstanceOf[js.Any], actionResults = actionResults.asInstanceOf[js.Any], parameterDeletes = parameterDeletes.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], testCaseResult = testCaseResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultUpdateRequestModel]
  }
}

