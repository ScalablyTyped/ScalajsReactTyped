package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataflowGraphRequest extends js.Object {
  /**
    * The Python script to transform.
    */
  var PythonScript: js.UndefOr[typingsJapgolly.awsSdk.glueMod.PythonScript] = js.native
}

object GetDataflowGraphRequest {
  @scala.inline
  def apply(PythonScript: PythonScript = null): GetDataflowGraphRequest = {
    val __obj = js.Dynamic.literal()
    if (PythonScript != null) __obj.updateDynamic("PythonScript")(PythonScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowGraphRequest]
  }
}

