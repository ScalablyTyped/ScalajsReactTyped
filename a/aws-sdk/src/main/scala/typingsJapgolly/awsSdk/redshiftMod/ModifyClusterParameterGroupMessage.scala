package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the parameter group to be modified.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single request. For each parameter to be modified, you must supply at least the parameter name and parameter value; other name-value pairs of the parameter are optional. For the workload management (WLM) configuration, you must supply all the name-value pairs in the wlm_json_configuration parameter.
    */
  var Parameters: ParametersList = js.native
}

object ModifyClusterParameterGroupMessage {
  @scala.inline
  def apply(ParameterGroupName: String, Parameters: ParametersList): ModifyClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyClusterParameterGroupMessage]
  }
}

