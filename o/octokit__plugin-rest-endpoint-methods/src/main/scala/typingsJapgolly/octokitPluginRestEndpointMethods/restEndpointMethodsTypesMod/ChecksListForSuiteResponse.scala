package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksListForSuiteResponse extends js.Object {
  var check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem]
  var total_count: Double
}

object ChecksListForSuiteResponse {
  @scala.inline
  def apply(check_runs: js.Array[ChecksListForSuiteResponseCheckRunsItem], total_count: Double): ChecksListForSuiteResponse = {
    val __obj = js.Dynamic.literal(check_runs = check_runs.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChecksListForSuiteResponse]
  }
}

