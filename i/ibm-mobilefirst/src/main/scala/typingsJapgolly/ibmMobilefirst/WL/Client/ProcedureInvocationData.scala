package typingsJapgolly.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcedureInvocationData extends js.Object {
  var adapter: String
  var compressResponse: js.UndefOr[Boolean] = js.undefined
  var parameters: js.UndefOr[js.Array[_]] = js.undefined
  var procedure: String
}

object ProcedureInvocationData {
  @scala.inline
  def apply(
    adapter: String,
    procedure: String,
    compressResponse: js.UndefOr[Boolean] = js.undefined,
    parameters: js.Array[_] = null
  ): ProcedureInvocationData = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    if (!js.isUndefined(compressResponse)) __obj.updateDynamic("compressResponse")(compressResponse.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureInvocationData]
  }
}

